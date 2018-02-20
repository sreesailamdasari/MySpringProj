package com.igate.springbasic.innerbeans;

public class Chain {
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chain [type=" + type + "]";
	}

}
