package com.igate.spring.qualifier;

import org.springframework.stereotype.Component;

@Component(value="cars")
public class Car implements Vechile {

	public void start() {
		System.out.println("car start");

	}

	public void run() {
		System.out.println("car run");

	}

}
