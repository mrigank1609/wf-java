package io;

import java.io.Serializable;

public class Email implements Serializable{
	String to;
	String from;
	String body;
	int i=20;

	public Email() {

	}

	
	public Email(String to, String from, String body) {
		this.to = to;
		this.from = from;
		this.body = body;
	}


	public void readMail() {
		System.out.println("From : " + from + "\n" + "Message " + body);
	}
}
