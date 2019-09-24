package com.qf.jedis;

import redis.clients.jedis.Jedis;

public class App {

    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("10.8.152.96", 6379, 1000);
        //设置redis的密码
        jedis.auth("redis");
        //根据K值获取字符串数据
        String name = jedis.get("name");
        System.out.println(name);

        //设置字符串类型数据
        jedis.set("name","tom");
        String name1 = jedis.get("name");
        System.out.println(name1);


        jedis.hset("abc1","1","123");
        jedis.hset("abc2","1","234");

//        String abc = jedis.get("abc");
//        System.out.println(abc);

        jedis.close();



    }
}
