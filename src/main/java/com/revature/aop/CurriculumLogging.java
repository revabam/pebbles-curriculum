package com.revature.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * Class where a spring aop advice executes before or after the methods 
 * in the services and controller is called/executed.
 * @author obosanosa-igiebor Batch: 1806-spark, Trainer: Steven Kelsey 
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
	
	//This executed before the methods in the curriculum controller
	@Before("execution( * com.revature.controllers.CurriculumController.*(..))")
	public void logCurriculum(JoinPoint joinPoint) throws Throwable{
		logger.info("Curriculums endpoint hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
}
	
	//This executed before the methods in the curriculum day controller
	@Before("execution( * com.revature.controllers.CurriculumDayController.*(..))")
	public void logCurriculumDay(JoinPoint joinPoint) throws Throwable{
		logger.info("CurriculumsDay endpoint hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
}
	
	//This executed before the methods in the curriculum week controller
	@Before("execution( * com.revature.controllers.CurriculumWeekController.*(..))")
	public void logCurriculumWeek(JoinPoint joinPoint) throws Throwable{
		logger.info("CurriculumWeek endpoint hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
}
	
	//This executed before the methods in the curriculum subtopic controller
	@Before("execution( * com.revature.controllers.SubTopicController.*(..))")
	public void logSubtopic(JoinPoint joinPoint) throws Throwable{
		logger.info("SubTopic endpoint hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
}
	
	@Before("execution( * com.revature.controllers.TopicController.*(..))")
	public void logTopic(JoinPoint joinPoint) throws Throwable{
		logger.info("Topic endpoint hit" + joinPoint);
		logger.error("Error!");
		logger.debug("Now Debugging...");
}
	
}
