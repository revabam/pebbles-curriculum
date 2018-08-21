CREATE SEQUENCE curriculum_seq
INCREMENT BY 1;

CREATE TABLE curriculum
(id INTEGER NOT NULL,
name VARCHAR(25),
version VARCHAR(25),
creator_id INTEGER,
date_created TIMESTAMP,
number_of_weeks INTEGER,
PRIMARY KEY(id));

CREATE SEQUENCE topic_seq
INCREMENT BY 1;

CREATE TABLE topic
(id INTEGER NOT NULL,
name VARCHAR(25),
PRIMARY KEY(id));

CREATE SEQUENCE subtopic_seq
INCREMENT BY 1;

CREATE TABLE subtopic
(id INTEGER NOT NULL,
name VARCHAR(50),
parent_topic_id INTEGER,
PRIMARY KEY(id),
FOREIGN KEY (parent_topic_id) references topic(id));

/*
create curriculum_topics linking table
*/
CREATE SEQUENCE curriculum_topics_seq
INCREMENT BY 1;

CREATE TABLE curriculum_topics
(id INTEGER NOT NULL,
curriculum_id INTEGER,
topic_id INTEGER,
week_number INTEGER,
PRIMARY KEY (id),
FOREIGN KEY (curriculum_id) references curriculum(id),
FOREIGN KEY (topic_id) references topic(id));
