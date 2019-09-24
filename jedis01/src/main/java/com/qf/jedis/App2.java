package com.qf.jedis;

import com.qf.utils.JedisUtils;
import redis.clients.jedis.Jedis;

public class App2 {

    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getJedis();
        System.out.println(jedis.get("name"));
        JedisUtils.closeJedis(jedis);


    }
}
