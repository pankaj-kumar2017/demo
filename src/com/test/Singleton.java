package com.test;

public class Singleton {
	
	private Singleton(){}
	private static Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
	}
	
	private EmailMessageBean message;
	public EmailMessageBean getMessage() {
		return message;
	}
	
	public void setMessage(EmailMessageBean message) {
		this.message = message;
	}
	

}

/*
 * How two controllers MainController & EmailDetailsController will communicate?
 * Through Singleton Class, this will be passed to both the controllers
 */

