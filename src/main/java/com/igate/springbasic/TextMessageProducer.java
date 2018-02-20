package com.igate.springbasic;

public class TextMessageProducer implements IMessageProducer {

	public String messageFormat(String message) {
		return "Hi " + message;
	}

}
