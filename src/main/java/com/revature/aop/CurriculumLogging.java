package com.revature.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * This is a Class where a Spring Aop advice executes before or after the
 * methods in the services and controller is called/executed.
 * 
 * @author Obosa Nosa-Igiebor | Batch: 1806-spark | Steven Kelsey
 *
 */

@Aspect
@Configuration
public class CurriculumLogging {

	private Logger logger = Logger.getLogger(this.getClass());

	// This executes after the methods in the service class
	@After("execution( * com.revature.services.*.*(..))")
	public void logExecutionTime(JoinPoint joinPoint) throws Throwable {
		System.out.println("Current Directory = " + System.getProperty("user.dir"));
		System.out.println("NOW LOGGING");
		logger.info("Used  services " + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}

	// This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.CurriculumController.*(..))")
	public void logCurriculum(JoinPoint joinPoint) throws Throwable {
		logger.info("Curriculum endpoints hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}

	// This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.CurriculumDayController.*(..))")
	public void logCurriculumDay(JoinPoint joinPoint) throws Throwable {
		logger.info("Curriculum Day endpoints hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}

	// This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.CurriculumWeekController.*(..))")
	public void logCurriculumWeek(JoinPoint joinPoint) throws Throwable {
		logger.info("Curriculum Week Day endpoints hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}

	// This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.SubTopicController.*(..))")
	public void logSubTopic(JoinPoint joinPoint) throws Throwable {
		logger.info("SubTopic endpoints hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}

	// This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.TopicController.*(..))")
	public void logTopic(JoinPoint joinPoint) throws Throwable {
		logger.info("Topic endpoints hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
	}
}
