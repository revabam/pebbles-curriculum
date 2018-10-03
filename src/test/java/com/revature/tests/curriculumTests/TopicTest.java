package com.revature.tests.curriculumTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.Application;
import com.revature.models.Curriculum;
import com.revature.models.Subtopic;
import com.revature.models.Topic;
import com.revature.tests.TestDriver;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDriver.class, properties="/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes=Application.class)

public class TopicTest extends TestDriver{

	static String url = "http://localhost:9996/topic";
	
    @Test
    public void findAllSubtopics() {
    	
        int status = RestAssured.given().contentType("application/json").get(url + "/topics").getStatusCode();
        
        assertEquals(200, status);
    }
	

	@Test
	public void addTopic() {
	  Topic topic = new Topic(0, "Angular", null);
	  
	  int status = RestAssured.given().contentType("application/json").body(topic).post(url + "/topics/1/4").getStatusCode();
	  
	  assertEquals(201, status);
	}
	
	
	@Test
	public void findTopicById() {
		
	  int status = RestAssured.given().contentType("application/json").get(url + "/find/1").getStatusCode();
	  
	  assertEquals(200, status);
	}
	
	
	@Test
	public void deleteTopic() {
		
		int status = RestAssured.given().contentType("application/json").delete(url + "/1").getStatusCode();
	
		assertEquals(200, status);
	}


}


