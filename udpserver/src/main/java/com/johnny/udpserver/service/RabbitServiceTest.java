package com.johnny.udpserver.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.johnny.udpserver.model.RabbitMqMsg;
import com.johnny.udpserver.udp.MessageSender;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RabbitServiceTest {
    @RabbitListener(queues = "myQueue")
    public void rabbitTest(Message message) throws IOException {
        RabbitMqMsg rabbitMqMsg = new ObjectMapper().readValue(new String(message.getBody()), RabbitMqMsg.class);
        String s = new String(message.getBody());
        System.out.println("message.getBody() = " + s);
        System.out.println("message.getMessageProperties() = " + message.getMessageProperties());
        MessageSender.sendMsg(rabbitMqMsg.getIp(),rabbitMqMsg.getPort(),rabbitMqMsg.getMsg());
    }
}
