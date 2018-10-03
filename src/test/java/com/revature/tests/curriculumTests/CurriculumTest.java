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
public class CurriculumTest extends TestDriver {
    
    static String url = "http://localhost:9996/curriculums";
    
    @Test
    public void findAllCurriculums() {
        RestAssured.get(url).prettyPrint();
    }
    
    
    @Test
    public void findCurriculumById() {
        int status = RestAssured.given().contentType("application/json").get(url+"/1").getStatusCode();
        
        assertEquals(200, status);
    }
    

    
    @Test
    public void addCurriculum() {
        Curriculum curr = new Curriculum(0, "Full-stack .Net", 2, 1, 1, 1, new Date(1534815476247L), 10, null);
        
        int status = RestAssured.given().contentType("application/json").body(curr).post(url).getStatusCode();
        
        assertEquals(201, status);
    }

    
    @Test
    public void updateCurriculum() {
        Curriculum updatedCurr = new Curriculum(1, "Full-stack .Net", 2, 1, 1, 1, new Date(1534815476247L), 10, null);

        int status = RestAssured.given().contentType("application/json").body(updatedCurr).put(url).getStatusCode();
        
        assertEquals(200, status);
    }

}
