DROP SEQUENCE IF EXISTS curriculum_seq;
CREATE SEQUENCE IF NOT EXISTS curriculum_seq
INCREMENT BY 1
START WITH 3;

DROP SEQUENCE IF EXISTS topic_seq;
CREATE SEQUENCE IF NOT EXISTS topic_seq
INCREMENT BY 1
START WITH 5;

DROP TABLE IF EXISTS topic CASCADE;
CREATE TABLE IF NOT EXISTS topic
(id INTEGER NOT NULL,
name VARCHAR(25),
PRIMARY KEY(id));

DROP SEQUENCE IF EXISTS subtopic_seq_name;
CREATE SEQUENCE IF NOT EXISTS subtopic_seq_name
INCREMENT BY 1
START WITH 12;

DROP TABLE IF EXISTS subtopic_names CASCADE;
CREATE TABLE IF NOT EXISTS subtopic_names
(subtopic_name_id INTEGER NOT NULL,
subtopic_name VARCHAR(50),
TOPIC_ID INTEGER NOT NULL,
PRIMARY KEY(subtopic_name_id));

DROP TABLE IF EXISTS CURRICULUM CASCADE;
CREATE TABLE IF NOT EXISTS CURRICULUM
(ID INTEGER NOT NULL,
name varchar(25),
version integer,
creator_id integer,
date_created date,
number_of_weeks integer,
status integer,
approved_by_id integer,
PRIMARY KEY(ID));

DROP TABLE IF EXISTS CURRICULUM_WEEK CASCADE;
CREATE TABLE IF NOT EXISTS CURRICULUM_WEEK
(CURRICULUM_WEEK_ID INTEGER NOT NULL,
ID INTEGER,
WEEK_NUM INTEGER,
PRIMARY KEY(CURRICULUM_WEEK_ID));

DROP TABLE IF EXISTS CURRICULUM_DAY CASCADE;
CREATE TABLE IF NOT EXISTS CURRICULUM_DAY
(CURRICULUM_DAY_ID INTEGER NOT NULL,
CURRICULUM_WEEK_ID INTEGER,
DAY_NUM INTEGER,
PRIMARY KEY(CURRICULUM_DAY_ID));

DROP TABLE IF EXISTS DaySubtopic_SubtopicName CASCADE;
DROP TABLE IF EXISTS Day_Subtopic_Subtopic_Name CASCADE;
DROP TABLE IF EXISTS Day_Subtopic_SubtopicName CASCADE;
DROP TABLE IF EXISTS DaySubtopic_Subtopic_Name CASCADE;
DROP TABLE IF EXISTS DaySubtopic_SubtopicNames CASCADE;

DROP SEQUENCE IF EXISTS day_subtopic_seq_name;
CREATE SEQUENCE IF NOT EXISTS day_subtopic_seq_name
INCREMENT BY 1
START WITH 9;

DROP TABLE IF EXISTS day_subtopic CASCADE;
CREATE TABLE IF NOT EXISTS day_subtopic
(subtopic_id INTEGER NOT NULL,
CURRICULUM_DAY_ID INTEGER,
subtopic_name_id INTEGER,
PRIMARY KEY(subtopic_id));