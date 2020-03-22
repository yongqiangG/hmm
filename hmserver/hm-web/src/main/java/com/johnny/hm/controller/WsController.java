package com.johnny.hm.controller;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.model.ChatMsg;
import com.johnny.hm.model.RespMsg;
import com.johnny.hm.utils.WsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
public class WsController {
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    //聊天消息处理

    @MessageMapping("/ws/chat")
    public void handleMsg(Authentication authentication, ChatMsg chatMsg){
        Hr hr = (Hr) authentication.getPrincipal();
        chatMsg.setFrom(hr.getName());
        chatMsg.setDate(new Date());
        simpMessagingTemplate.convertAndSendToUser(chatMsg.getTo(),"/queue/chat",chatMsg);
    }
    @RequestMapping("/pushMsg")
    @ResponseBody
    public void pushMsg(){
        for (int i = 0; i <10; i++) {
            RespMsg msg=new RespMsg();
            msg.setName("消息"+i);
            msg.setProgress(i);
            WsUtil.getInstance().push(msg);
        }
    }
    @MessageMapping("/air")
    public String pushMessage(){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        new Thread(){
            @Override
            public void run() {
                RespMsg msg= (RespMsg) WsUtil.getInstance().poll();
                ExecutorService executorService=Executors.newFixedThreadPool(2);
                simpMessagingTemplate.convertAndSend("/topic/pullMsg",msg);
            }
        }.start();
        return "OK";
    }
}
