package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;

@Configuration
@ImportResource(value="classpath:beans.xml")
public class AppConfig {
	
	@Bean
	public InMemoryAccountRepository accountRepository () {
		return new InMemoryAccountRepository();
	}
	
//	@Bean
//	public TransferServiceImpl transferService() {
//		return new TransferServiceImpl(accountRepository ());
//	}
	
}
