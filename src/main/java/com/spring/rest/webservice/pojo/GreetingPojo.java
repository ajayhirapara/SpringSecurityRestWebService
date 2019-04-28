package com.spring.rest.webservice.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="GreetingInfo")
public class GreetingPojo {

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGreegingFrom() {
		return greegingFrom;
	}

	public void setGreegingFrom(String greegingFrom) {
		this.greegingFrom = greegingFrom;
	}

	public String getGreetingTo() {
		return greetingTo;
	}

	public void setGreetingTo(String greetingTo) {
		this.greetingTo = greetingTo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public GreetingPojo() {
		
	}
	
	public GreetingPojo( int id,String greegingFrom, String greetingTo, String message) {
		super();
		this.greegingFrom = greegingFrom;
		this.greetingTo = greetingTo;
		this.message = message;
		this.id = id;
	}
	
	private String greegingFrom;
	private String greetingTo;
	
	private String message;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
}
