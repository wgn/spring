package com.zhuani21.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class LogInterceptor {
	//@Pointcut("execution(public * com.zhuani21.spring..*.*(..))")
	//public void logPointCut(){};
	
	//@Pointcut("execution(public * com.zhuani21.spring.service..*.*(..))")
	//public void transactionPointCut(){};

	//@Before("logPointCut()")
	public void before(){
		System.out.println("logInterceptor before runned");
	}
	//@Around("transactionPointCut()")
	public void after(ProceedingJoinPoint pjp){
		long start = System.currentTimeMillis();
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("方法执行了：" + (System.currentTimeMillis() - start) + "毫秒" );
	}
}
