CREATE TABLE role
(id INTEGER NOT NULL,
role VARCHAR(25) UNIQUE,
PRIMARY KEY (id));

CREATE TABLE status
(id INTEGER NOT NULL,
status VARCHAR(25) UNIQUE,
PRIMARY KEY (id));

CREATE TABLE bam_user
(id INTEGER NOT NULL,
firstname VARCHAR(25) NOT NULL,
lastname VARCHAR(25) NOT NULL,
email VARCHAR(255) UNIQUE NOT NULL,
role_id INTEGER,
status_id INTEGER,
PRIMARY KEY (id),
foreign key (role_id) references role(id),
foreign key (status_id) references status(id));

CREATE SEQUENCE bam_user_seq START WITH 5;