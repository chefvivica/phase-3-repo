package com.client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class Client {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =  new ClassPathXmlApplicationContext("beans.xml");
		//step 1 create a container -> get all you class
//		ApplicationContext ctx = new ClassPathX?mlApplicationContext("beans.xml");
//		//step2 access the service 		
		CalculatorService cs = (CalculatorService)ctx.getBean("service");//service is the injection 
		System.out.println(cs.service(4));
		ctx.close();
		//same hashcode, same instance obj, by default -> singleton 
//		System.out.println(cs.hashCode());
//		CalculatorService cs2 = (CalculatorService)ctx.getBean("service");//service is the injection 
//		System.out.println(cs2.hashCode());
		//to make diff instance obj, change bean scope = "prototype" 
		
	
		
		
		
	}
}
