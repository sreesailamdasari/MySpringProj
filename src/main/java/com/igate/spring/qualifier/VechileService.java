package com.igate.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile222")
public class VechileService {
	@Autowired
	@Qualifier(value="cars")
	private Vechile vechile;

	public void vs() {
		vechile.start();
		vechile.run();
	}
}
