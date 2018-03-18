package com.zhuanqian.controller;

import com.zhuanqian.model.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/6.
 */
@Controller
@RequestMapping("/api/connect")
public class ConnectTestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectTestController.class);

    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String helloWord(HttpServletRequest request, @RequestBody JsonObject jsonObject){
        return "test";
    }
}
