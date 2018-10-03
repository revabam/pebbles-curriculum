package com.revature.tests.curriculumTests;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.Application;
import com.revature.models.CurriculumWeek;
import com.revature.tests.TestDriver;

import io.restassured.RestAssured;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDriver.class, properties="/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes=Application.class)
public class CurriculumWeekTest extends TestDriver {
	
	static String url = "http://localhost:9996/curriculums/weeks";
	
	@Test
	public void findAllWeeks() {
		
        int status = RestAssured.given().contentType("application/json").get(url).getStatusCode();
        
        assertEquals(200, status);
    }
	
	@Test
	public void findWeekById() {
		
		int status = RestAssured.given().contentType("application/json").get(url + "/1").getStatusCode();
		
		assertEquals(200, status);
	}
	
	@Ignore
	@Test
	public void findWeekByIdAndWeekNum() {
		
		int CurriculumWeekId = RestAssured.get(url + "/1/1").as(CurriculumWeek.class).getWeekNum();
		
		assertEquals(1, CurriculumWeekId);
	}
	
	@Ignore
	@Test
	public void addWeek() {
		
		CurriculumWeek curriculumWeek = new CurriculumWeek(1, 1, 0, null);
		
		int status = RestAssured.given().contentType("application/json").body(curriculumWeek).post(url).getStatusCode();
		
		assertEquals(201, status);
	}
	
	@Ignore
	@Test
	public void updateWeek() {
		
		CurriculumWeek testCurriculumWeek = new CurriculumWeek(1, 1, 0, null);
		
		CurriculumWeek curriculumWeek = RestAssured.given().contentType("application/json").body(testCurriculumWeek).put(url).as(CurriculumWeek.class);
		
				
		assertEquals(testCurriculumWeek, curriculumWeek);
	}
	
	@Ignore
	@Test
	public void deleteWeek() {
		
		int status = RestAssured.given().contentType("application/json").delete(url + "/1").getStatusCode();
		
		assertEquals(200, status);
	}

}
