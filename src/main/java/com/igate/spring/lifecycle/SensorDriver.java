package com.igate.spring.lifecycle;

import org.springframework.beans.factory.annotation.Required;

public class SensorDriver {
	private String type;

	@Required
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SensorDriver [type=" + type + "]";
	}

}
