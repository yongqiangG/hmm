package com.johnny.udpserver.service;

import com.johnny.udpserver.udp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class MyAppRunner implements ApplicationRunner {
    private static Logger logger = LoggerFactory.getLogger(MyAppRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("开始启动服务---------------------");
        /**
         * UDP 服务器主线程
         */
        //new MainThread().start();  myUDPServer
        String myUDPServer= Config.MY_UDP_SERVER;
        if(myUDPServer!=null && "on".equals(myUDPServer)){
            //UDP服务重启机制
            UDPMainThread udpMth = new UDPMainThread();
            UDPMainThreadListener listener = new UDPMainThreadListener();
            udpMth.addObserver(listener);
            new Thread(udpMth).start();
        }else{
            new MainThread().start();
        }

        /**
         * UDP消息发送线程
         */
        String msgSendThreadFlag=Config.MY_MSG_SEND_THREAD_FLAG;
        if(msgSendThreadFlag!=null && "on".equals(msgSendThreadFlag)){
            //重启机制
            MessageSendThreadMain msgThreadMain = new MessageSendThreadMain();
            MessageSendThreadMainListener msgSendListener = new MessageSendThreadMainListener();
            msgThreadMain.addObserver(msgSendListener);
            new Thread(msgThreadMain).start();
        }else{
            new MessageSenderThread().start();
        }
        /**
         * 终端设备超时检测线程
         */
        String sendPoolFlag= Config.MY_SEND_POOL_FLAG;
        if(sendPoolFlag!=null&& "on".equals(sendPoolFlag)){
            String poolNumString=Config.SEND_POOL_SIZE;
            int sendPool=Integer.parseInt(poolNumString.trim());
            ExecutorService timePool = Executors.newFixedThreadPool(sendPool);
            Thread myTimeOuThread=new TimeoutThread();
            timePool.execute(myTimeOuThread);
        }else{
            new TimeoutThread().start();
        }
    }
}
