package com.johnny.hm;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmApplicationTests {
    /*@Autowired
    HrMapper hrMapper;
    @Autowired
    AmqpAdmin amqpAdmin;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;
    //redis
    @Test
    public void redis1(){
        stringRedisTemplate.opsForValue().set("a","hello");
    }
    @Test
    public void redis2(){
        String a = stringRedisTemplate.opsForValue().get("a");
        System.out.println("a = " + a);

    }
    //rabbitmq
    @Test
    public void amqp() {
        amqpAdmin.declareExchange(new DirectExchange("myDirectExchange"));
        amqpAdmin.declareQueue(new Queue("myQueue"));
        amqpAdmin.declareBinding(new Binding("myQueue", Binding.DestinationType.QUEUE, "myDirectExchange", "johnny", null));
    }

    @Test
    public void sendMsg() throws InterruptedException {
        *//*HashMap<String, Object> map = new HashMap<>();
        map.put("name","johnny");*//*
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("myDirectExchange", "johnny", "123456789");
        }
    }

    @Test
    public void recvMsg() {
        Object msg = rabbitTemplate.receiveAndConvert("myQueue");
        System.out.println(msg.toString());
    }

    //加密
    @Test
    public void bCry() {
        PasswordEncoder pwe = new BCryptPasswordEncoder();
        String[] strings = new String[10];
        String encode = pwe.encode("chenxiaomin");
        System.out.println(encode);
    }

    @Test
    public void getRolesByHrId() {
        List<Role> roles = hrMapper.getRolesById(10);
        for (Role role : roles) {
            System.out.println(role.getName());
        }
    }


    @Test
    public void contextLoads() {
    }*/

}
