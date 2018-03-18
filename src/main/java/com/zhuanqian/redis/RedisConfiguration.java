package com.zhuanqian.redis;

import com.zhuanqian.redis.receiver.TestReceiver;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import javax.sound.midi.Receiver;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2017/5/10.
 */
@Configuration
@EnableCaching
public class RedisConfiguration{

    @Bean
    public RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new PatternTopic("test"));
        return container;
    }

    @Bean
    public MessageListenerAdapter listenerAdapter(TestReceiver receiver){
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }

    @Bean
    public TestReceiver receiver(){
        return new TestReceiver();
    }

}
