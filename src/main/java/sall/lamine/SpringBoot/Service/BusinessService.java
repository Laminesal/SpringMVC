package sall.lamine.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import sall.lamine.SpringBoot.Model.HelloWorldJava;

@Component
@Qualifier("Bean")
public class BusinessService {
	
	public HelloWorldJava getHelloWordl() {
		
		 HelloWorldJava a = new HelloWorldJava();
		 
		 return a;
	}

}
