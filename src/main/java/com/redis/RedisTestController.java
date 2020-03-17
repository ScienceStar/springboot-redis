package com.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName RedisTestController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17 21:32
 * @Version V1.0
 **/
@Controller
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    RedisUtil redisUtil;

    /**
     *@Description: 测试redis
     *@param key, value
     *@return Object
     *@Author: zyj 2018/5/26 8:46
     */
    @RequestMapping("/testRedisAdd")
    @ResponseBody
    Object testRedisAdd(String key,String value){
        redisUtil.set(key,value);
        return redisUtil.get(key);
    }
}
