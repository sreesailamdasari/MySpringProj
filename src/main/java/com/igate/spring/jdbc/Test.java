package com.igate.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao dao = (StudentDao) applicationContext.getBean("sdao");
		System.out.println("Total count of students" + dao.getTotalStudents());
	}
}
