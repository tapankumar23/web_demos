package com.tap.backend.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogingAspect {

	@Before("execution(public String getName())")
	public void loggingAspect(){
		System.out.println("This is default advise");
	}
}
