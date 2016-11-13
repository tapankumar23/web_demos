package com.tap.backend.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogingAspect {

	@Pointcut("execution(public String getName())")
	public void loggingAspect(){
		System.out.println("This is default advise");
	}
}
