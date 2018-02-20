package com.igate.springbasic;

import java.beans.ConstructorProperties;

public class Robot {
	private int id;
	private String name;
	private String type;

	@ConstructorProperties({"id","name"})
	public Robot(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Robot(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}
