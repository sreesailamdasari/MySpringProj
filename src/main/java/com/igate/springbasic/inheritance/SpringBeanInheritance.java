/**
 * 
 */
package com.igate.springbasic.inheritance;

/**
 * @author sreesdas
 *
 */
public class SpringBeanInheritance {
	private int id;
	private String name;
	private String color;
	private String model;
	private String type;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "id=" + id + ",\nname=" + name + ",\ncolor=" + color + ",\nmodel=" + model + ",\ntype=" + type;
	}

}
