/*
insert mock data into the curriculum table
*/
insert into curriculum (id, name, version, creator_id, date_created, number_of_weeks)
values(1, 'Full-stack Java', 'version_1.0.1', 1, {ts '2018-07-16 18:47:54.69'}, 10);
insert into curriculum (id, name, version, creator_id, date_created, number_of_weeks)
values(2, 'Spark Full-stack Java', 'version_1.0.0', 3, {ts '2018-08-17 10:40:52.00'}, 14);
/*
insert into curriculum (id, name, version, creator_id, date_created, number_of_weeks)
values((SELECT curriculum_seq.nextVal FROM dual), 'Pega', 'version_1.1.2', 3, {ts '2018-04-17 11:40:52.00'}, 10);
*/

/*
insert mock data into the topic and subtopic lookup tables
*/
/*topic*/
/*full-stack java topics*/
insert into topic (id, name)
values(1, 'Core Java');
insert into topic (id, name)
values(2, 'SQL');
insert into topic (id, name)
values(3, 'JavaScript, HTML, CSS');
/*spark batch topics*/
insert into topic (id, name)
values(4, 'Express');

/*subtopic*/
/*core java subtopics*/
insert into subtopic (id, name, parent_topic_id)
values(1, 'Interfaces', 1);
insert into subtopic (id, name, parent_topic_id)
values(2, 'Inheritance', 1);
insert into subtopic (id, name, parent_topic_id)
values(3, 'Covariance', 1);
/*sql topics*/
insert into subtopic (id, name, parent_topic_id)
values(4, 'SQL Sublanguages', 2);
insert into subtopic (id, name, parent_topic_id)
values(5, 'Normalization', 2);
insert into subtopic (id, name, parent_topic_id)
values(6, 'Stored Procedures', 2);
/*html, css and javascript subtopics*/
insert into subtopic (id, name, parent_topic_id)
values(7, 'HTML elements', 3);
insert into subtopic (id, name, parent_topic_id)
values(8, 'JavaScript DOM manipulation', 3);
insert into subtopic (id, name, parent_topic_id)
values(9, 'Inline, internal, and external CSS', 3);
/*express subtopics*/
insert into subtopic (id, name, parent_topic_id)
values(10, 'Node', 4);
insert into subtopic (id, name, parent_topic_id)
values(11, 'Express APIs', 4);

/*Full-stack Java curriculum topics*/
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(1, 1, 1, 1);
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(2, 1, 2, 2);
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(3, 1, 3, 3);

/*Spark full-stack Java curriculum topics*/
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(4, 2, 4, 1);
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(5, 2, 1, 2);
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(6, 2, 2, 3);
insert into curriculum_topics (id, curriculum_id, topic_id, week_number)
values(7, 2, 3, 4);
