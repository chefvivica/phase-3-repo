package com.client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;
import com.service.CalculatorService;

public class Client {
	public static void main(String[] args) {
		
//		ConfigurableApplicationContext ctx =  new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
			
		CalculatorService cs = (CalculatorService)ctx.getBean("service");//service is the injection 
		System.out.println(cs.service(456));
		ctx.close();

		
	
		
		
		
	}
}
