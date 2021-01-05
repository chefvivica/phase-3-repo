package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;


@Configuration
@ImportResource(value="classpath:beans.xml")
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public SavingAccount savingAccount() {
		return new SavingAccount();
	}
	@Bean
	public FixedAccount fixedAccount() {
		return new FixedAccount();
	}
	@Bean
	public CalculatorService service() {
		return new CalculatorService(fixedAccount());
	}


}
