
merge into topic (id, name)
values(1, 'Core Java');
merge into topic (id, name)
values(2, 'SQL');
merge into topic (id, name)
values(3, 'JavaScript, HTML, CSS');
/*spark batch topics*/
merge into topic (id, name)
values(4, 'Express');

insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (1, 'For Loops', 1);

insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (2, 'While Loops', 2);

insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (3, 'Do While', 3);

insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (4, 'If statments', 4);

insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(5, 'Normalization', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(6, 'Stored Procedures', 2);
/*html, css and javascript subtopics*/
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(7, 'HTML elements', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(8, 'JavaScript DOM manipulation', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(9, 'Inline, internal, and external CSS', 3);
/*express subtopics*/
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(10, 'Node', 4);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(11, 'Express APIs', 4);

insert into curriculum values (1,'java',1, 1, '2018-09-27', 10, 1, 2);
insert into curriculum values (2,'java',2, 1, '2018-09-29', 10, 1, 2);

insert into curriculum_week values (1, 1, 1);
insert into curriculum_week values (2, 2, 1);

insert into CURRICULUM_DAY values (1, 1, 1);
insert into CURRICULUM_DAY values (2, 1, 2);
insert into CURRICULUM_DAY values (5, 1, 3);
insert into CURRICULUM_DAY values (6, 1, 4);
insert into CURRICULUM_DAY values (7, 1, 5);
insert into CURRICULUM_DAY values (3, 2, 1);
insert into CURRICULUM_DAY values (4, 2, 2);




insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(1, 1, 1);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(2, 1, 2);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)   
values(3, 2, 3);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(4, 2, 4);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(5, 3, 1);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(6, 3, 2);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)   
values(7, 4, 3);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(8, 4, 4);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(9, 5, 5);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(10, 5, 6);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)   
values(11, 6, 7);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(12, 6, 8);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(13, 7, 9);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)
values(14, 7, 10);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, subtopic_name_id)   
values(15, 7, 11);


