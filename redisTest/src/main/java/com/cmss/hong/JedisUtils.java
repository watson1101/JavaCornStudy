package com.cmss.hong;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author hong
 * @date 2020/2/25
 */
public enum  JedisUtils {
    //实例
    INSTANCE;

    //得到jedisPool
    private static JedisPool jedisPool;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(10);//最大连接数
        config.setMaxIdle(5);//空闲连接数
        config.setMaxWaitMillis(5000);
        config.setTestOnBorrow(true);

        //创建一个jedis，连接redis服务器
        //jedisPool = new JedisPool(config,"10.139.8.11",6379,5000);
        jedisPool = new JedisPool(config,"10.139.8.11",6379,5000,"123456");
    }

    //得到jedis对象
    public Jedis getJedis(){
        return jedisPool.getResource();
    }

    //关闭jedis对象
    public void closeJedis(Jedis jedis){
        if (jedis != null){
            jedis.close();
        }
    }
}
