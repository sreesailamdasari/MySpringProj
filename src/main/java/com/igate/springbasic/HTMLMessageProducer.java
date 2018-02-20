package com.igate.springbasic;

public class HTMLMessageProducer implements IMessageProducer{

	public String messageFormat(String message) {

		return "<html> "+message+"</html>";
	}

}
