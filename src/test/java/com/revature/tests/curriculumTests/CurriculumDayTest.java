package com.revature.tests.curriculumTests;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.Application;
import com.revature.models.CurriculumDay;
import com.revature.tests.TestDriver;

import io.restassured.RestAssured;

/**
 * Tests endpoints in the CurriculumDayController
 * @author Joshua Maciejewski | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestDriver.class, properties = "/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = Application.class)

public class CurriculumDayTest extends TestDriver {

	static String url = "http://localhost:9996/curriculums/days";

	@Test
	public void findAllCurriculumDays() {

		int status = RestAssured.given().contentType("application/json").get(url).getStatusCode();

		assertEquals(200, status);
	}

	@Test
	public void findByCurriculumDayId() {

		int status = RestAssured.given().contentType("application/json").get(url + "/1").getStatusCode();

		assertEquals(200, status);
	}

	@Test
	public void findByCurriculumWeekIdAndDayNum() {

		int status = RestAssured.given().contentType("application/json").get(url + "/1/1").getStatusCode();

		assertEquals(200, status);
	}

	@Ignore
	@Test
	public void addCurriculumDay() {

		CurriculumDay curriculumDay = new CurriculumDay(5, 1, 1, null);

		int status = RestAssured.given().contentType("application/json").body(curriculumDay).post(url).getStatusCode();

		assertEquals(201, status);
	}

	@Ignore
	@Test
	public void updateCurriculumDay() {
		CurriculumDay testCurriculumDay = new CurriculumDay(4, 1, 1, null);

		CurriculumDay curriculumDay = RestAssured.given().contentType("application/json").body(testCurriculumDay)
				.put(url).as(CurriculumDay.class);

		assertEquals(testCurriculumDay, curriculumDay);
	}

	@Ignore
	@Test
	public void deleteCurriculumDay() {

		int status = RestAssured.given().contentType("application/json").delete(url + "/1").getStatusCode();

		assertEquals(200, status);
	}

}