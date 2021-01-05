package com.client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.model.CalDAO;



public class Client {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		CalDAO ca = (CalDAO) ctx.getBean("calDaoImpl");
		ca.add(1, 2);
		ca.sub(1, 2);
		ca.multi(1, 2);
	}
}
