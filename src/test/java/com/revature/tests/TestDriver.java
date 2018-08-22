package com.revature.tests;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.Application;

/**
 * 
 * @author Brandon Scoggins, Batch: 1806-Jun18-Java-USF, Trainer: Wezley Singleton
 *
 *	Creating Launcher
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDriver.class, properties="/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes=Application.class)

public class TestDriver {
	
	 public static void main(String[] args){
	        new SpringApplicationBuilder()
	        .sources(TestDriver.class)
	        .run(args);
	  }
	
	@Test
	@Ignore
	public void run() {}
	
}
