package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;

@Configuration

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
