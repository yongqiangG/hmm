package com.johnny.udpserver.utils;

import org.slf4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class RabbitMqUtil {
    private static Logger logger = getLogger(RabbitMqUtil.class);
    private static RabbitTemplate rabbitTemplate;
    @Autowired
    public void setRedisTemplate(RabbitTemplate rabbitTemplate) {
        RabbitMqUtil.rabbitTemplate = rabbitTemplate;
    }
    public static boolean send(String exchange,String routingkey,Object o){
        try{
            RabbitMqUtil.rabbitTemplate.convertAndSend(exchange,routingkey,o);
            return true;
        }catch (Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }
}
