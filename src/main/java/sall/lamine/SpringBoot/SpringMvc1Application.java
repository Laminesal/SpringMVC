package sall.lamine.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sall.lamine.SpringBoot.Model.HelloWorldJava;
import sall.lamine.SpringBoot.Service.BusinessService;

@SpringBootApplication
public class SpringMvc1Application {
private BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(SpringMvc1Application.class, args);
	}
	
	
	public void run(String... args) throws Exception {
		HelloWorldJava hw = bs.getHelloWordl();
		System.out.println(hw);
	}

}
