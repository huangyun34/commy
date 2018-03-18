package com.zhuanqian.redis.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2017/5/11.
 */
public class TestReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestReceiver.class);

    public void receiveMessage(Object message){
        LOGGER.info("Received <" + message + ">");
        if("hello".equals(message)){
            LOGGER.info("成功");
        }else {
            LOGGER.info("有杂质");
        }
    }
}
