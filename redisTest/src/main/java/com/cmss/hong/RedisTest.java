package com.cmss.hong;

import redis.clients.jedis.Jedis;

/**
 * @author hong
 * @date 2020/2/25
 */
public class RedisTest {
    public static void main(String[] args){
        RedisTest redis = new RedisTest();
        try {
            redis.test4();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void test() throws Exception{
        //创建一个jedis
        Jedis jedis = new Jedis("10.139.8.11");
        jedis.auth("123456");  //如果设置了密码 就填上这一句
        jedis.set("name", "zhang");
        jedis.close();
    }

    public void test1() throws Exception{
        Jedis jedis = new Jedis("10.139.8.11");
        System.out.println(jedis.get("name"));
        jedis.close();
    }

    public void test3() throws Exception{
        //得到jedusUtils对象
        Jedis jedis = JedisUtils.INSTANCE.getJedis();
        //设置密码
        jedis.set("name", "张老板");
        System.out.println("name"+jedis.get("name"));
        jedis.close();
    }

    public void test4() throws Exception{
        Jedis jedis = JedisUtils.INSTANCE.getJedis();
        jedis.set("name","5555" );
        System.out.println(jedis.get("name"));
        jedis.close();
    }
}
