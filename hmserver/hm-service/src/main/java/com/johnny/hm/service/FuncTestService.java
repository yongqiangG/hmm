package com.johnny.hm.service;

import com.johnny.hm.utils.HexUtil;
import com.johnny.hm.utils.UdpUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FuncTestService {
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendBind(Map<String, Object> info) {
        String machineCode = ((String) info.get("machineCode"));
        String ipAddr = ((String) info.get("ipAddr"));
        String broadcastIp = ((String) info.get("broadcastIp"));
        String header = UdpUtil.getHeader(0, machineCode, 0x01);
        StringBuffer sb = new StringBuffer("");
        //设备指定ip
        sb.append(HexUtil.toIpHexStr(ipAddr));
        //设备指定网关
        sb.append(HexUtil.toIpHexStr(broadcastIp));
        String content = sb.toString();
        content = UdpUtil.toMsg(header, content);
        //广播ip
        //String broadcastIp = deviceBroadcast.substring(0, deviceBroadcast.lastIndexOf(".")) + ".255";
        HashMap<String, Object> m = new HashMap<>();
        m.put("ip", broadcastIp);
        m.put("port", "3341");
        m.put("msg", content);
        rabbitTemplate.convertAndSend("myDirectExchange", "johnny", m);
    }
    @RabbitListener(queues = "myRecvQueue")
    public void recvBind(Message message){
        String s = new String(message.getBody());
        simpMessagingTemplate.convertAndSendToUser("johnny","/queue/chat",s);
    }
}
