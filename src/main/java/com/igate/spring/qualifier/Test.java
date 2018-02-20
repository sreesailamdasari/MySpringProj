package com.igate.spring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		VechileService vechileService = (VechileService) applicationContext.getBean("vechile222");
		vechileService.vs();

	}
}
