package com.zhuani21.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CostTimeInterceptor {
	
	@Pointcut("execution(public * com.zhuani21.spring.service.impl..*.*(..))")
	 public void logPointCut(){};
	
	@Around("logPointCut()")
	public void printCostTime(ProceedingJoinPoint pjp){
		long start = System.currentTimeMillis();
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("method run cost :" + (System.currentTimeMillis()-start) + "milliseconds ");
	}
}
