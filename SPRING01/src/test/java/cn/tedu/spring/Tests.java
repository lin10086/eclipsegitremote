package cn.tedu.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	@Test
	public void test() {
		 // 加载Spring配置文件，获取Spring容器
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取所需的对象
	//	User user=(User) ac.getBean("user");
		Phone p=(Phone) ac.getBean("phone");
		PhoneFactory.newInstance();
        // 测试
		//System.out.println(user);
		System.out.println(p);
        // 释放资源
		ac.close();
		
	}
}
