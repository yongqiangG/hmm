package com.johnny.hm.utils;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class WsUtil {
    public static final int QUEUE_MAX_SIZE = 10000;
    private static WsUtil wsUtil = new WsUtil();
    private BlockingDeque<Object> blockingDeque = new LinkedBlockingDeque<>(QUEUE_MAX_SIZE);

    private WsUtil() {
    }

    public static WsUtil getInstance() {
        return wsUtil;
    }

    public boolean push(Object message) {
        return this.blockingDeque.add(message);
    }
    public Object poll(){
        Object result =null;
        try {
            result=this.blockingDeque.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

}
