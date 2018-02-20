package com.igate.spring.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BaseVOPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		if (bean instanceof BaseVO) {
			((BaseVO) bean).setLastModifiedDate(new Date());
		}
		return bean;
	}

}