package com.igate.springbasic;

public class MessageWriter {
	IMessageProducer iMessageProducer;

	public void setiMessageProducer(IMessageProducer iMessageProducer) {
		this.iMessageProducer = iMessageProducer;
	}

	public MessageWriter(IMessageProducer iMessageProducer) {
		this.iMessageProducer = iMessageProducer;
	}

	public void writeMessage(String type) {
		String message = iMessageProducer.messageFormat(type);
		System.out.println(message);
	}
}