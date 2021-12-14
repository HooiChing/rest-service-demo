package com.example.demo;

// POJO - Plain Old Java Object ie. plain Java class

public class Greeting {

	private final long id;   // final means = constent

	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}


}
