package com.igate.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Robot implements InitializingBean, DisposableBean {
	private String name;
	private SensorDriver driver;

	@Required
	public void setName(String name) {
		this.name = name;
	}

	
	public void setDriver(SensorDriver driver) {
		this.driver = driver;
	}

	public void destroy() throws Exception {
		System.out.println("release method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method ");
		System.out.println("Driver Name : " + driver + " Robot Name : " + name);
	}

}
