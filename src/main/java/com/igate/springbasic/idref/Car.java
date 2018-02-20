package com.igate.springbasic.idref;

public class Car {

	private Engine engine;

	

	public Car(Engine engine) {
		this.engine = engine;
	}



	public void run() {
		engine.start();
	}

}
