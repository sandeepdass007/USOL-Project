package com.pgdca.resultmanagement.chartservice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ControllerAOP {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Around("execution(* com.pgdca.resultmanagement.chartservice.controller.*.*(..))")
	public Object profileAllMethods(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		final Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();
		logger.info("Execution time: " + stopWatch.getTotalTimeMillis() + "ms");
		return result;
	}
}
