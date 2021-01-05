package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppIntercep implements Ordered{
	
	@Before("execution(* com.model.WelcomeDAO.*(..))")
	public void callBeforeMethod() {
		System.out.println("call before 2");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}



}
