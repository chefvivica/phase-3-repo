package com.client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.model.WelcomeDAO;


public class Client {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		WelcomeDAO wd = (WelcomeDAO) ctx.getBean("welcomeImpl");

		System.out.println(wd.sayWelcome("viv"));
//		wd.sayHi("viv", "viv@gmail.com");
//		wd.sayAround();
//		
		
	}
}
