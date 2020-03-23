package com.johnny.hm.controller;

import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.FuncTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/func/test")
public class FuncTestController {
    @Autowired
    FuncTestService funcTestService;
    @PostMapping("/bind")
    public RespBean bind(@RequestBody Map<String,Object> info){
        funcTestService.sendBind(info);
        return RespBean.ok("发送绑定中");
    }
}
