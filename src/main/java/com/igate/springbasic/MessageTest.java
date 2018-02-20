package com.igate.springbasic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.igate.springbasic.idref.Car;
import com.igate.springbasic.inheritance.SpringBeanInheritance;
import com.igate.springbasic.innerbeans.BeanScopes;
import com.igate.springbasic.innerbeans.Bycycle;

public class MessageTest {
	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		// MessageWriter messageWriter =
		// beanFactory.getBean("messageWriter",MessageWriter.class);
		/*
		 * Robot r=(Robot) beanFactory.getBean("robot");
		 * System.out.println(r.toString());
		 */
		// IMessageProducer iMessageProducer =
		// beanFactory.getBean("text",IMessageProducer.class);
		// messageWriter.setiMessageProducer(iMessageProducer);
		// messageWriter.writeMessage("Welcome to Spring");
		/*
		 * Course course =(Course)beanFactory.getBean("course");
		 * course.testProperties(); System.out.println(course.toString());
		 */

		/*
		 * SpringBeanInheritance inheritance=(SpringBeanInheritance)
		 * beanFactory.getBean("car1"); beanFactory.getBean("baseCar");
		 * System.out.println(inheritance.toString());
		 */
		// Inner Beans
		
		Car car=(Car)beanFactory.getBean("car");
		car.run();
		 
		/*BeanScopes beanScopes = (BeanScopes) beanFactory.getBean("scope");
		BeanScopes beanScopes1 = (BeanScopes) beanFactory.getBean("scope");
		System.out.println("Hashcode :" + beanScopes.hashCode());
		System.out.println("Hashcode1 :" + beanScopes1.hashCode());
		System.out.println(beanScopes == beanScopes1);*/
	}
}