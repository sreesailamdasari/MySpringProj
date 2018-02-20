package com.igate.spring.qualifier;

import org.springframework.stereotype.Component;

@Component(value="bike")
public class Bike implements Vechile {

	public void start() {
		System.out.println("Bike start");

	}

	public void run() {
		System.out.println("Bike run");

	}

}
