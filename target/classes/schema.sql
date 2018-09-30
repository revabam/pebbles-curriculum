DROP SEQUENCE IF EXISTS curriculum_seq;
CREATE SEQUENCE IF NOT EXISTS curriculum_seq
INCREMENT BY 1
START WITH 3;

DROP TABLE IF EXISTS curriculum CASCADE;
CREATE TABLE IF NOT EXISTS curriculum
(id INTEGER NOT NULL,
name VARCHAR(25) UNIQUE NOT NULL,
version VARCHAR(25) NOT NULL,
creator_id INTEGER NOT NULL,
date_created TIMESTAMP NOT NULL,
number_of_weeks INTEGER NOT NULL,
PRIMARY KEY(id));

DROP SEQUENCE IF EXISTS topic_seq;
CREATE SEQUENCE IF NOT EXISTS topic_seq
INCREMENT BY 1
START WITH 5;

DROP TABLE IF EXISTS topic CASCADE;
CREATE TABLE IF NOT EXISTS topic
(id INTEGER NOT NULL,
name VARCHAR(25),
PRIMARY KEY(id));

DROP SEQUENCE IF EXISTS subtopic_seq;
CREATE SEQUENCE IF NOT EXISTS subtopic_seq
INCREMENT BY 1
START WITH 12;

DROP TABLE IF EXISTS subtopic CASCADE;
CREATE TABLE IF NOT EXISTS subtopic
(id INTEGER NOT NULL,
name VARCHAR(50),
parent_topic_id INTEGER,
PRIMARY KEY(id),
FOREIGN KEY (parent_topic_id) references topic(id));

/*
create curriculum_topics linking table
*/
DROP SEQUENCE IF EXISTS curriculum_topics_seq;
CREATE SEQUENCE IF NOT EXISTS curriculum_topics_seq
INCREMENT BY 1
START WITH 12;

DROP TABLE IF EXISTS curriculum_topics CASCADE;
CREATE TABLE IF NOT EXISTS curriculum_topics
(id INTEGER NOT NULL,
curriculum_id INTEGER,
topic_id INTEGER,
week_number INTEGER,
PRIMARY KEY (id),
FOREIGN KEY (curriculum_id) references curriculum(id),
FOREIGN KEY (topic_id) references topic(id));
