package com.igate.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService=applicationContext.getBean(MyService.class);
		myService.myservice();
	}
}
