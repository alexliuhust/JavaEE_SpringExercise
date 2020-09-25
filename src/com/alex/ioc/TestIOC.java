package com.alex.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	public static void main(String[] args) {
		// 1. Initialize Spring Container and load the config file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Obtain the instance through the container
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");

		// 3. Call the method
		userDao.say();
	}

}
