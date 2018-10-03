package com.revature.tests.curriculumTests;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.Application;
import com.revature.models.DaySubTopic;
import com.revature.models.Subtopic;
import com.revature.tests.TestDriver;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDriver.class, properties="/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes=Application.class)

public class SubTopicTest extends TestDriver {
	
	static String url = "http://localhost:9996/subtopic";

	@Test
	public void updateSubtopic() {
	    Subtopic subtopic = new Subtopic(2, "Exceptions", 1);
	    
	    int status = RestAssured.given().contentType("application/json").body(subtopic).put(url + "/day").getStatusCode();
	    
	    assertEquals(200, status);
	  }
	
	@Test
    public void getAllSubtopics() {
    	
        int status = RestAssured.given().contentType("application/json").get(url).getStatusCode();
        
        assertEquals(200, status);
    }
	
	@Test
    public void getAllDaySubtopics() {
    	
        int status = RestAssured.given().contentType("application/json").get(url + "/day").getStatusCode();
        
        assertEquals(200, status);
    }
	
	@Test
	public void getByTopicId() {
		
		int status = RestAssured.given().contentType("application/json").get(url + "/1").getStatusCode();
		
		assertEquals(200, status);
	}
	
	@Ignore
	@Test
	public void deleteSubTopic() {
		
		int status = RestAssured.given().contentType("application/json").delete(url + "/day/1").getStatusCode();
	
		assertEquals(200, status);
	}
    
	@Ignore 
	@Test
	public void deleteDaySubTopic() {
		
		int status = RestAssured.given().contentType("application/json").delete(url + "/1").getStatusCode();
	
		assertEquals(200, status);
	}
	
	@Ignore
	@Test
	public void addDaySubtopic() {
	    DaySubTopic daySubTopic = new DaySubTopic(0, 0, 0, 0);
	    
	    int status = RestAssured.given().contentType("application/json").body(daySubTopic).post(url + "/day").getStatusCode();
	    
	    assertEquals(201, status);
	  }
	
	@Ignore
	@Test
	public void addSubtopic() {
	    Subtopic subtopic = new Subtopic(10, "Test", 1);
	    
	    int status = RestAssured.given().contentType("application/json").body(subtopic).post(url).getStatusCode();
	    
	    assertEquals(201, status);
	  }

}
