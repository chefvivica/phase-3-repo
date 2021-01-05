package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppInterceptor {
	
	@Before("execution(* com.model.*(..))")
	public void callBeforeMethod() {
		System.out.println("call before");
	}

}
