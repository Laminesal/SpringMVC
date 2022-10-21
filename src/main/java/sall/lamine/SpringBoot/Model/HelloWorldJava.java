package sall.lamine.SpringBoot.Model;

import org.springframework.beans.factory.annotation.Autowired;

import sall.lamine.SpringBoot.Service.BusinessService;


public class HelloWorldJava {
	
	@Autowired
	private BusinessService bs;
	
	private String value= "Hello World!";
	
	
	@Override
	public String toString() {
		return "HelloWorldJava [value=" + value + "]";
	}
	
	
	
	
	
}
