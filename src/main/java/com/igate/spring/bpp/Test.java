package com.igate.spring.bpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		BaseVOPostProcessor bpp = beanFactory.getBean("bpp", BaseVOPostProcessor.class);
		((ConfigurableListableBeanFactory) beanFactory).addBeanPostProcessor(bpp);*/
		EmployeeDeligate deligate = (EmployeeDeligate) beanFactory.getBean("empdel");
		deligate.insert();
	}
}
