/*
merge mock data into the curriculum table
*/
-- merge into curriculum (id, name, version, creator_id, date_created, number_of_weeks,)
-- values(1, 'Full-stack Java', 'version_1.0.1', 1, {ts '2018-07-16 18:47:54.69'}, 10);
-- merge into curriculum (id, name, version, creator_id, date_created, number_of_weeks)
-- values(2, 'Spark Full-stack Java', 'version_1.0.0', 3, {ts '2018-08-17 10:40:52.00'}, 14);
/*
merge into curriculum (id, name, version, creator_id, date_created, number_of_weeks)
values((SELECT curriculum_seq.nextVal FROM dual), 'Pega', 'version_1.1.2', 3, {ts '2018-04-17 11:40:52.00'}, 10);
*/

/*
merge mock data into the topic and subtopic lookup tables
*/
/*topic*/
/*full-stack java topics*/

merge into topic (id, name)
values(1, 'Core Java');
merge into topic (id, name)
values(2, 'SQL');
merge into topic (id, name)
values(3, 'JavaScript, HTML, CSS');
/*spark batch topics*/
merge into topic (id, name)
values(4, 'Express');


-- /*subtopic*/
/*core java subtopics*/

--merge into subtopic_name (id, name)
--values(1, 'Interfaces');
--merge into subtopic_name (id, name)
--values(2, 'Inheritance');
--merge into subtopic_name (id, name)
--values(3, 'Covariance');
--/*spark batch topics*/
--merge into subtopic_name (id, name)
--values(4, 'SQL Sublanguages');
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values (1, 'For Loops', 1,1);

insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values (2, 'While Loops', 1,2);

insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values (3, 'Do While', 1, 3 );

insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values (4, 'If statments', 1,4);

insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(5, 'Normalization', 2,2);
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(6, 'Stored Procedures', 2,2);
/*html, css and javascript subtopics*/
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(7, 'HTML elements', 2,3);
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(8, 'JavaScript DOM manipulation', 3,3);
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(9, 'Inline, internal, and external CSS', 3,3);
/*express subtopics*/
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(10, 'Node', 4,4);
insert into day_subtopic (subtopic_id, SUBTOPIC_NAME, CURRICULUM_DAY_ID, PARENT_TOPIC_ID)
values(11, 'Express APIs', 4,4);

insert into curriculum values (1,'java',1, 1, '2018-09-27', 10, 1, 2);
insert into curriculum values (2,'java',2, 1, '2018-09-29', 10, 1, 2);

insert into curriculum_week values (1, 1, 1);
insert into curriculum_week values (2, 2, 1);

insert into CURRICULUM_DAY values (1, 1, 1);
insert into CURRICULUM_DAY values (2, 1, 2);
insert into CURRICULUM_DAY values (3, 2, 1);
insert into CURRICULUM_DAY values (4, 2, 2);




-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(1, 1, 1);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(2, 1, 2);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)   
-- values(3, 2, 3);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(4, 2, 4);

-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(5, 3, 1);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(6, 3, 2);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)   
-- values(7, 4, 3);
-- insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, name_ID)
-- values(8, 4, 4);

-- insert into DaySubtopic_SubtopicName values (1, 1);
-- insert into DaySubtopic_SubtopicName values (2, 2);
-- insert into DaySubtopic_SubtopicName values (3, 3);
-- insert into DaySubtopic_SubtopicName values (4, 4);
-- insert into DaySubtopic_SubtopicName values (5, 1);
-- insert into DaySubtopic_SubtopicName values (6, 2);
-- insert into DaySubtopic_SubtopicName values (7, 3);
-- insert into DaySubtopic_SubtopicName values (8, 4);




