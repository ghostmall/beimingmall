package com.taotao.order.dao;

public interface JedisClient {
	
	String get(String key);
	String set(String key,String value);
	String hget(String hkey,String key);
	long hset(String hkey,String key,String value);
	//使得在对应value的值上面自己增加一位数
	long incr(String key);
	//设置存在的时间是多长
	long expire(String key,int second);
	//查看还剩余多长的时间
	long ttl(String key);
	//添加删除的功能
	long del(String key);
	long hdel(String hkey,String key);
}
