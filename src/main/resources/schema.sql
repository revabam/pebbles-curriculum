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

DROP SEQUENCE IF EXISTS subtopic_seq;
CREATE SEQUENCE IF NOT EXISTS subtopic_seq
INCREMENT BY 1
START WITH 12;

-- DROP TABLE IF EXISTS subtopic CASCADE;
-- DROP TABLE IF EXISTS topic CASCADE;
-- ALTER TABLE subtopic
-- DROP CONSTRAINT FKN59K91C6XDUUKIJFEJ2IVN5AD;

--CREATE TABLE IF NOT EXISTS subtopic_name
--(subtopic_name_id INTEGER NOT NULL,
--name INTEGER NOT NULL,
--PRIMARY KEY(subtopic_name_id));

DROP TABLE IF EXISTS day_subtopic CASCADE;
CREATE TABLE IF NOT EXISTS day_subtopic
(subtopic_id INTEGER NOT NULL,
subtopic_name varchar(50),
CURRICULUM_DAY_ID INTEGER,
PARENT_TOPIC_ID INTEGER,
PRIMARY KEY(subtopic_id));

DROP TABLE IF EXISTS subtopic_names CASCADE;
-- CREATE TABLE IF NOT EXISTS subtopic_names
-- (name_id INTEGER NOT NULL,
-- subtopic_name VARCHAR(50),
-- topic_id INTEGER NOT NULL,
-- PRIMARY KEY(name_id));

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
--FOREIGN KEY(curriculum_week_id) REFERENCES curriculum_week(curriculum_week_id));

DROP TABLE IF EXISTS CURRICULUM_WEEK CASCADE;
CREATE TABLE IF NOT EXISTS CURRICULUM_WEEK
(CURRICULUM_WEEK_ID INTEGER NOT NULL,
ID INTEGER,
WEEK_NUM INTEGER,
PRIMARY KEY(CURRICULUM_WEEK_ID));
--FOREIGN KEY(curriculum_day_id) REFERENCES CURRICULUM_DAY(curriculum_day_id));

DROP TABLE IF EXISTS CURRICULUM_DAY CASCADE;
CREATE TABLE IF NOT EXISTS CURRICULUM_DAY
(CURRICULUM_DAY_ID INTEGER NOT NULL,
CURRICULUM_WEEK_ID INTEGER,
DAY_NUM INTEGER,
PRIMARY KEY(CURRICULUM_DAY_ID));
--FOREIGN KEY(subtopic_id) REFERENCES subtopic(subtopic_id));

DROP TABLE IF EXISTS DaySubtopic_SubtopicName CASCADE;
DROP TABLE IF EXISTS Day_Subtopic_Subtopic_Name CASCADE;
DROP TABLE IF EXISTS Day_Subtopic_SubtopicName CASCADE;
DROP TABLE IF EXISTS DaySubtopic_Subtopic_Name CASCADE;
DROP TABLE IF EXISTS DaySubtopic_SubtopicNames CASCADE;
-- CREATE TABLE IF NOT EXISTS DaySubtopic_SubtopicName
-- (SUBTOPIC_ID INTEGER NOT NULL,
-- NAME_ID INTEGER NOT NULL,
-- PRIMARY KEY(SUBTOPIC_ID , NAME_ID));
-- FOREIGN KEY(NAME_ID) REFERENCES subtopic_names(name_id),
-- FOREIGN KEY(SUBTOPIC_ID) REFERENCES day_subtopic(subtopic_id));

