package com.revature.tests.curriculumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.JsonObject;
import com.revature.Application;
import com.revature.models.Curriculum;
import com.revature.models.CurriculumTopic;
import com.revature.models.Subtopic;
import com.revature.models.Topic;
import com.revature.tests.TestDriver;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDriver.class, properties="/pebbles-curriculum/src/test/resources/application.properties", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes=Application.class)
public class CurriculumTest {
	
	static String url = "http://localhost:9996";
	
	@Test
	public void canGetAllCurriculums() {
		RestAssured.get(url).prettyPrint();
	}
	
	@Test
	public void canGetCurriculumById() {
		Curriculum testCurr = new Curriculum(1, "Full-stack Java", "version_1.0.1", 1, new Date(1531781274069L), 10);
		int status = RestAssured.get(url+"/1").getStatusCode();
		
		assertEquals(200, status);
	}
	
	@Test
	public void canAddCurriculum() {
		Curriculum curr = new Curriculum(0, "Full-stack .Net", "version_1.0.1", 1, new Date(1534815476247L), 10);
		
		JsonObject json = new JsonObject();
		json.addProperty("curriculum", curr.toString());
		
		int status = RestAssured.given().contentType("application/json").body(curr).post(url).getStatusCode();
		
		assertEquals(201, status);
	}
	
	@Test
	public void canUpdateCurriculum() {
		Curriculum updatedCurr = new Curriculum(1, "Full-Stack Java", "version_1.0.1", 1, new Date(1531781274069L), 10);
		
		JsonObject json = new JsonObject();
		json.addProperty("curriculum", updatedCurr.toString());
		
		int status = RestAssured.given().contentType("application/json").body(updatedCurr).put(url).getStatusCode();
		
		assertEquals(200, status);
	}
	
	@Ignore
	public void canGetTopicsByCurriculumId() {
		List<Topic> testTopics = new ArrayList<>();
		testTopics.add(new Topic(1, "Core Java"));
		testTopics.add(new Topic(2, "SQL"));
		testTopics.add(new Topic(3, "JavaScript, HTML, CSS"));
		
		List<Topic> topics = RestAssured.get(url+"/topics/1").as(List.class);
		
		
		assertEquals(testTopics.size(), topics.size());
	}
	
	@Test
	public void canGetSubtopicsByCurriculumId() {
		List<Subtopic> testSubtopics = new ArrayList<>();
		testSubtopics.add(new Subtopic(10, "Node", 4));
		testSubtopics.add(new Subtopic(11, "Express APIs", 4));
		testSubtopics.add(new Subtopic(1, "Interfaces", 1));
		testSubtopics.add(new Subtopic(2, "Inheritance", 1));
		testSubtopics.add(new Subtopic(3, "Covariance", 1));
		testSubtopics.add(new Subtopic(4, "SQL Sublanguages", 2));
		testSubtopics.add(new Subtopic(5, "Normalization", 2));
		testSubtopics.add(new Subtopic(6, "Stored Procedures", 2));
		testSubtopics.add(new Subtopic(7, "HTML elements", 3));
		testSubtopics.add(new Subtopic(8, "JavaScript DOM manipulation", 3));
		testSubtopics.add(new Subtopic(9, "Inline, internal, and external CSS", 3));
		
		List<Subtopic> subtopics = RestAssured.get(url+"/subtopics/2").as(List.class);

		assertEquals(testSubtopics.size(), subtopics.size());
	}
	
	@Test
	public void canAddTopic() {
		Topic topic = new Topic(0, "Angular");
		
		JsonObject json = new JsonObject();
		json.addProperty("topic", topic.toString());
		
		int status = RestAssured.given().contentType("application/json").body(topic).post(url+"/topics/1/4").getStatusCode();
		
		assertEquals(201, status);
	}
	
	@Test
	public void canAddSubtopic() {
		Subtopic subtopic = new Subtopic("Exceptions", 1);
		
		JsonObject json = new JsonObject();
		json.addProperty("subtopic", subtopic.toString());
		
		int status = RestAssured.given().contentType("application/json").body(subtopic).post(url+"/subtopics").getStatusCode();
		
		assertEquals(201, status);
	}
	
	@Test
	public void canUpdateTopic() {
		Topic testTopic = new Topic(4, "Express Basics");
		
		JsonObject json = new JsonObject();
		json.addProperty("topic", testTopic.toString());
		
		Topic topic = RestAssured.given().contentType("application/json").body(testTopic).put(url+"/topics").as(Topic.class);
		
		assertEquals(testTopic, topic);
	}
	
	@Test
	public void canUpdateSubtopic() {
		Subtopic testSubtopic = new Subtopic(5, "Levels of Normalization", 2);
		
		JsonObject json = new JsonObject();
		json.addProperty("subtopic", testSubtopic.toString());
		
		Subtopic sub = RestAssured.given().contentType("application/json").body(testSubtopic).put(url+"/subtopics").as(Subtopic.class);
		
		assertEquals(testSubtopic.getId(), sub.getId());
		assertEquals(testSubtopic.getName(), sub.getName());
		assertEquals(testSubtopic.getParent_topic_id(), sub.getParent_topic_id());
	}
	
	@Ignore
	public void canUpdateTopicWeek() {
		CurriculumTopic testCt = new CurriculumTopic(7, 2, 3, 3);
		Topic topic = new Topic(3, "JavaScript, HTML, CSS");
		
		JsonObject json = new JsonObject();
		json.addProperty("topic", topic.toString());
		
		CurriculumTopic ct = RestAssured.given().contentType("application/json").body(topic).put(url+"/topics/2/3").as(CurriculumTopic.class);
		
		assertEquals(testCt, ct);
	}

}
