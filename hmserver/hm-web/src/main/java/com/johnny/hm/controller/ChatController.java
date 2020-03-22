package com.johnny.hm.controller;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    HrService hrService;
    @GetMapping("hrs")
    public List<Hr> getAllHrs(){
        return hrService.getAllHrs();
    }
}
