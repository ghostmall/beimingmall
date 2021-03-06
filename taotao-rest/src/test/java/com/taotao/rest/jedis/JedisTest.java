package com.taotao.rest.jedis;

import java.util.HashSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class JedisTest {
		@Test//单机版的
		public void testJedisSingle(){
			 //创建一个jedis的对象
			Jedis jedis = new Jedis("192.168.194.129", 6379);
		    //调用jedis对象的方法
			jedis.set("key1", "jedis test");
			String string = jedis.get("key1");
			System.out.println(string);
			//关闭jedis
			jedis.close();
		}
		
		/**
		 * 使用连接池   单机版的jedis
		 */
		@Test
		public void testJedisPool(){
			//创建jedis连接池
			JedisPool jedisPool = new JedisPool("192.168.194.129", 6379);
			//从连接池中获得jedis对象
			Jedis jedis = jedisPool.getResource();
			String str = jedis.get("key1");
			System.out.println(str);
			//关闭jedis对象
			jedis.close();
			jedisPool.close();
		}
		
         /**
          * 集群版测试		 jedisCluster自带连接池
          */
		@Test
		public void testJedisCluster(){
			 HashSet<HostAndPort> nodes = new HashSet<>();
			 nodes.add(new HostAndPort("192.168.194.129", 7001));
			 nodes.add(new HostAndPort("192.168.194.129", 7002));
			 nodes.add(new HostAndPort("192.168.194.129", 7003));
			 nodes.add(new HostAndPort("192.168.194.129", 7004));
			 nodes.add(new HostAndPort("192.168.194.129", 7005));
			 nodes.add(new HostAndPort("192.168.194.129", 7006));
			 
			JedisCluster cluster = new JedisCluster(nodes);
			
			cluster.set("key1", "1000");
			cluster.get("key1");
			String  string = cluster.get("key1");
			System.out.println(string);
			cluster.close();
		}
		
		//配置文件xml单机版的jedis测试
		@Test
		public void testSpringJedisSingle(){
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
			JedisPool pool = (JedisPool)applicationContext.getBean("redisClient");
			Jedis jedis = pool.getResource();
			String string = jedis.get("key1");
			System.out.println(string);
			jedis.close();
			pool.close();
		}
		
		@Test
		public void testSpringJedisCluster(){
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
			JedisCluster jedisCluster = (JedisCluster) applicationContext.getBean("redisClient");
			String string = jedisCluster.get("key1");
			System.out.println(string);
			jedisCluster.close();
		}
		
		
		
		
		
		
		
}
