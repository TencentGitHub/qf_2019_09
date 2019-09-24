package com.qf.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtils {

    private static JedisPool jedisPool = null;

    static {
        //jedis连接池的配置对象
        JedisPoolConfig config = new JedisPoolConfig();

        config.setMaxTotal(30);
        config.setMaxIdle(5);
        config.setMaxIdle(10);

        //创建连接池对象
         jedisPool = new JedisPool(config, "10.8.152.96", 6379, 1000, "redis");
    }

    //获取jedis对象
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

    public static void closeJedis(Jedis jedis){
       jedis.close();
    }
}
