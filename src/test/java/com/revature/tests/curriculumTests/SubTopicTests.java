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

public class SubTopicTests extends TestDriver {
	
	static String url = "http://localhost:9996/subtopic";
	
    @Test
    public void getAllSubtopics() {
    	
        int status = RestAssured.given().contentType("application/json").get(url).getStatusCode();
        
        assertEquals(200, status);
    }
    
  @Test
  public void addSubtopic() {
    Subtopic subtopic = new Subtopic(10, "Exceptions", 1);
    
    int status = RestAssured.given().contentType("application/json").body(subtopic).post(url).getStatusCode();
    
    assertEquals(201, status);
  }

	

}
