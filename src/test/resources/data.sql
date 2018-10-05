
merge into topic (id, name)
values(1, 'Core Java');
merge into topic (id, name)
values(2, 'SQL');
merge into topic (id, name)
values(3, 'Client-Side Technologies');
merge into topic (id, name)
values(4, 'Servlets');
merge into topic (id, name)
values(5, 'Angular');
merge into topic (id, name)
values(6, 'DevOps');
merge into topic (id, name)
values(7, 'Hibernate');
merge into topic (id, name)
values(8, 'Spring');
merge into topic (id, name)
values(9, 'Web Services');
merge into topic (id, name)
values(10, 'Microservices');
merge into topic (id, name)
values(11, '.NET');


/* Java subtopiocs */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (1, 'Introduction to Java: Why Java?', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (2, 'OOP Concepts in Depth: Polymorphism, Encapsulation, Inheritance, and Abstraction', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (3, 'Constructors', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (4, 'Methods and Parameters', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(5, 'Scopes of a Variable in Java', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(6, 'Array', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(7, 'Access Modifiers', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(8, 'String API', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(9, 'StringBuilder and StringBuffer', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(10, 'Exception Handling - try, catch, finally', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(11, 'Reflection', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(12, 'Inheritance', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(13, 'File I/O: FileInputStream, FileReader, FileWriter', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(14, 'Methods and Parameters', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(15, 'Serialization', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(16, 'Collection Framework', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(17, 'Object Class', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(18, 'String API', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(19, 'Equals and Hashcode', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(20, 'Thread model', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(21, 'Creational Design Patterns: Singleton and Factory', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(22, 'Introduction to Unit Testing', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(23, 'Introduction to Maven', 1);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(24, 'Maven Project Object Model (POM)', 1);
/* SQL subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(25, 'Relational Database Service (RDS)', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(26, 'Introduction to DBMS', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(27, 'DML, DDL, DQL', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(28, 'Simple and Prepared Statements', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(29, 'Basic SQL Queries', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(30, 'Introduction to JDBC', 2);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(31, 'Connection Interface', 2);
/* Client-side Technologies subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(32, 'HTML 5', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(33, 'JavaScript Overview', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(34, 'DOM Selection', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(35, 'AJAX Introduction', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(36, 'Introduction to XML', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(37, 'Design Patterns: MVC, Front Controllers, Business Delegate', 3);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(38, 'Servlet Introduction', 4);
/* Angular subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(39, 'Introduction to TypeScript', 5);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(40, 'Components', 5);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(41, 'RxJS Promises vs ObservableL', 5);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(42, 'AngularJS vs Angular 4', 5);
/* DevOps subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(43, 'Amazon Web Services Introduction', 6);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(44, 'Continuous Integration (CI)', 6);
/* Hibernate subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(45, 'Hibernate Object States', 7);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(46, 'DAO Implementation', 7);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(47, 'Hibernate Criteria API', 7);
/* Spring subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(48, 'Introduction to Spring', 8);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(49, 'Bean Lifecycle', 8);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(50, 'Annotations', 8);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(51, '@Component, @Repository, @Service, @Inject, @Autowired', 8);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(52, 'Aspect-Oriented Programming (AOP)', 8);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(53, 'Spring Data', 8);
/* Web Services subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(54, 'Overview of Web Services', 9);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(55, 'Why We use Web Services', 9);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(56, 'REST (Spring)', 9);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(57, 'Exposing/Consuming REST', 9);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(58, 'WSDL', 9);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(59, 'Contract First/Contract Last', 9);
/* Microservices subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(60, 'Microservices-(Discovery)', 10);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(61, 'Microservices Architecture', 10);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(62, 'API Gateway-Zuul/MS Web API', 10);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(63, 'Service Discovery & Registry-Eureka', 10);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(64, 'Deployment Environment', 10);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(65, 'Containerization-Docker', 10);
/* .NET subtopics */
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (66, 'Introduction to C#: Why C#?', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (67, 'OOP Concepts in Depth: Polymorphism, Encapsulation, Inheritance, and Abstraction', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (68, 'Introduction to C#: Why C#?', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (69, 'Constructors', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (70, 'Methods and Parameters', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(71, 'Scopes of a Variable in C#', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(72, 'Arrays', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(73, 'Access Modifiers', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(74, 'Active Server Pages (ASP)', 11);
merge into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(75, 'Datatypes', 11);


merge into curriculum values (1,'Java', 1, 3, '2018-09-27', 10, '1', '2');
merge into curriculum values (2,'Java', 2, 1, '2018-09-29', 10, '1', '2');
merge into curriculum values (3,'.NET', 1, 1, '2018-09-30', 10, '1', '2');
merge into curriculum values (4,'SDET', 1, 1, '2018-09-30', 10, '1', '2');

/* Mock data for Java Curriculum 1 weeks */
merge into curriculum_week values (1, 1, 1);
merge into curriculum_week values (2, 1, 2);
merge into curriculum_week values (3, 1, 3);
merge into curriculum_week values (4, 1, 4);
merge into curriculum_week values (5, 1, 5);
merge into curriculum_week values (6, 1, 6);
merge into curriculum_week values (7, 1, 7);
merge into curriculum_week values (8, 1, 8);
merge into curriculum_week values (9, 1, 9);
merge into curriculum_week values (10, 1, 10);

/* Mock data for Java Curriculum 2 Weeks */
merge into curriculum_week values (11, 2, 1);
merge into curriculum_week values (12, 2, 2);
merge into curriculum_week values (13, 2, 3);
merge into curriculum_week values (14, 2, 4);
merge into curriculum_week values (15, 2, 5);
merge into curriculum_week values (16, 2, 6);
merge into curriculum_week values (17, 2, 7);
merge into curriculum_week values (18, 2, 8);
merge into curriculum_week values (19, 2, 9);
merge into curriculum_week values (20, 2, 10);

/* Mock data for .NET Curriculum 1 Weeks */
merge into curriculum_week values (21, 3, 1);
merge into curriculum_week values (22, 3, 2);
merge into curriculum_week values (23, 3, 3);
merge into curriculum_week values (24, 3, 4);
merge into curriculum_week values (25, 3, 5);
merge into curriculum_week values (26, 3, 6);
merge into curriculum_week values (27, 3, 7);
merge into curriculum_week values (28, 3, 8);
merge into curriculum_week values (29, 3, 9);
merge into curriculum_week values (30, 3, 10);

/* Mock data for SDET Curriculum 1 Weeks */
merge into curriculum_week values (31, 4, 1);
merge into curriculum_week values (32, 4, 2);
merge into curriculum_week values (33, 4, 3);
merge into curriculum_week values (34, 4, 4);
merge into curriculum_week values (35, 4, 5);
merge into curriculum_week values (36, 4, 6);
merge into curriculum_week values (37, 4, 7);
merge into curriculum_week values (38, 4, 8);
merge into curriculum_week values (39, 4, 9);
merge into curriculum_week values (40, 4, 10);


/* Mock data for Java Curriculum 1 week 1 days */
merge into CURRICULUM_DAY values (1, 1, 1);
merge into CURRICULUM_DAY values (2, 1, 2);
merge into CURRICULUM_DAY values (3, 1, 3);
merge into CURRICULUM_DAY values (4, 1, 4);
merge into CURRICULUM_DAY values (5, 1, 5);

/* Mock data for Java Curriculum 1 week 2 days */
merge into CURRICULUM_DAY values (6, 2, 1);
merge into CURRICULUM_DAY values (7, 2, 2);
merge into CURRICULUM_DAY values (8, 2, 3);
merge into CURRICULUM_DAY values (9, 2, 4);
merge into CURRICULUM_DAY values (10, 2, 5);

/* Mock data for Java Curriculum 1 week 3 days */
merge into CURRICULUM_DAY values (11, 3, 1);
merge into CURRICULUM_DAY values (12, 3, 2);
merge into CURRICULUM_DAY values (13, 3, 3);
merge into CURRICULUM_DAY values (14, 3, 4);
merge into CURRICULUM_DAY values (15, 3, 5);

/* Mock data for Java Curriculum 1 week 4 days */
merge into CURRICULUM_DAY values (16, 4, 1);
merge into CURRICULUM_DAY values (17, 4, 2);
merge into CURRICULUM_DAY values (18, 4, 3);
merge into CURRICULUM_DAY values (19, 4, 4);
merge into CURRICULUM_DAY values (20, 4, 5);

/* Mock data for Java Curriculum 1 week 5 days */
merge into CURRICULUM_DAY values (21, 5, 1);
merge into CURRICULUM_DAY values (22, 5, 2);
merge into CURRICULUM_DAY values (23, 5, 3);
merge into CURRICULUM_DAY values (24, 5, 4);
merge into CURRICULUM_DAY values (25, 5, 5);

/* Mock data for Java Curriculum 1 week 6 days */
merge into CURRICULUM_DAY values (26, 6, 1);
merge into CURRICULUM_DAY values (27, 6, 2);
merge into CURRICULUM_DAY values (28, 6, 3);
merge into CURRICULUM_DAY values (29, 6, 4);
merge into CURRICULUM_DAY values (30, 6, 5);

/* Mock data for Java Curriculum 1 week 7 days */
merge into CURRICULUM_DAY values (31, 7, 1);
merge into CURRICULUM_DAY values (32, 7, 2);
merge into CURRICULUM_DAY values (33, 7, 3);
merge into CURRICULUM_DAY values (34, 7, 4);
merge into CURRICULUM_DAY values (35, 7, 5);

/* Mock data for Java Curriculum 1 week 8 days */
merge into CURRICULUM_DAY values (36, 8, 1);
merge into CURRICULUM_DAY values (37, 8, 2);
merge into CURRICULUM_DAY values (38, 8, 3);
merge into CURRICULUM_DAY values (39, 8, 4);
merge into CURRICULUM_DAY values (40, 8, 5);

/* Mock data for Java Curriculum 1 week 9 days */
merge into CURRICULUM_DAY values (41, 9, 1);
merge into CURRICULUM_DAY values (42, 9, 2);
merge into CURRICULUM_DAY values (43, 9, 3);
merge into CURRICULUM_DAY values (44, 9, 4);
merge into CURRICULUM_DAY values (45, 9, 5);

/* Mock data for Java Curriculum 1 week 10 days */
merge into CURRICULUM_DAY values (46, 10, 1);
merge into CURRICULUM_DAY values (47, 10, 2);
merge into CURRICULUM_DAY values (48, 10, 3);
merge into CURRICULUM_DAY values (49, 10, 4);
merge into CURRICULUM_DAY values (50, 10, 5);

/* Mock data for Java Curriculum 2 week 1 days */
merge into CURRICULUM_DAY values (51, 11, 1);
merge into CURRICULUM_DAY values (52, 11, 2);
merge into CURRICULUM_DAY values (53, 11, 3);
merge into CURRICULUM_DAY values (54, 11, 4);
merge into CURRICULUM_DAY values (55, 11, 5);

/* Mock data for Java Curriculum 2 week 2 days */
merge into CURRICULUM_DAY values (56, 12, 1);
merge into CURRICULUM_DAY values (57, 12, 2);
merge into CURRICULUM_DAY values (58, 12, 3);
merge into CURRICULUM_DAY values (59, 12, 4);
merge into CURRICULUM_DAY values (60, 12, 5);

/* Mock data for Java Curriculum 2 week 3 days */
merge into CURRICULUM_DAY values (61, 13, 1);
merge into CURRICULUM_DAY values (62, 13, 2);
merge into CURRICULUM_DAY values (63, 13, 3);
merge into CURRICULUM_DAY values (64, 13, 4);
merge into CURRICULUM_DAY values (65, 13, 5);

/* Mock data for Java Curriculum 2 week 4 days */
merge into CURRICULUM_DAY values (66, 14, 1);
merge into CURRICULUM_DAY values (67, 14, 2);
merge into CURRICULUM_DAY values (68, 14, 3);
merge into CURRICULUM_DAY values (69, 14, 4);
merge into CURRICULUM_DAY values (70, 14, 5);

/* Mock data for Java Curriculum 2 week 5 days */
merge into CURRICULUM_DAY values (71, 15, 1);
merge into CURRICULUM_DAY values (72, 15, 2);
merge into CURRICULUM_DAY values (73, 15, 3);
merge into CURRICULUM_DAY values (74, 15, 4);
merge into CURRICULUM_DAY values (75, 15, 5);

/* Mock data for Java Curriculum 2 week 6 days */
merge into CURRICULUM_DAY values (76, 16, 1);
merge into CURRICULUM_DAY values (77, 16, 2);
merge into CURRICULUM_DAY values (78, 16, 3);
merge into CURRICULUM_DAY values (79, 16, 4);
merge into CURRICULUM_DAY values (80, 16, 5);

/* Mock data for Java Curriculum 2 week 7 days */
merge into CURRICULUM_DAY values (81, 17, 1);
merge into CURRICULUM_DAY values (82, 17, 2);
merge into CURRICULUM_DAY values (83, 17, 3);
merge into CURRICULUM_DAY values (84, 17, 4);
merge into CURRICULUM_DAY values (85, 17, 5);

/* Mock data for Java Curriculum 2 week 8 days */
merge into CURRICULUM_DAY values (86, 18, 1);
merge into CURRICULUM_DAY values (87, 18, 2);
merge into CURRICULUM_DAY values (88, 18, 3);
merge into CURRICULUM_DAY values (89, 18, 4);
merge into CURRICULUM_DAY values (90, 18, 5);

/* Mock data for Java Curriculum 2 week 9 days */
merge into CURRICULUM_DAY values (91, 19, 1);
merge into CURRICULUM_DAY values (92, 19, 2);
merge into CURRICULUM_DAY values (93, 19, 3);
merge into CURRICULUM_DAY values (94, 19, 4);
merge into CURRICULUM_DAY values (95, 19, 5);

/* Mock data for Java Curriculum 2 week 10 days */
merge into CURRICULUM_DAY values (96, 20, 1);
merge into CURRICULUM_DAY values (97, 20, 2);
merge into CURRICULUM_DAY values (98, 20, 3);
merge into CURRICULUM_DAY values (99, 20, 4);
merge into CURRICULUM_DAY values (100, 20, 5);

/* Mock data for .NET Curriculum 1 Week 1 days*/
merge into CURRICULUM_DAY values (101, 21, 1);
merge into CURRICULUM_DAY values (102, 21, 2);
merge into CURRICULUM_DAY values (103, 21, 3);
merge into CURRICULUM_DAY values (104, 21, 4);
merge into CURRICULUM_DAY values (105, 21, 5);

/* Mock data for .NET Curriculum 1 week 2 days */
merge into CURRICULUM_DAY values (106, 22, 1);
merge into CURRICULUM_DAY values (107, 22, 2);
merge into CURRICULUM_DAY values (108, 22, 3);
merge into CURRICULUM_DAY values (109, 22, 4);
merge into CURRICULUM_DAY values (110, 22, 5);

/* Mock data for .NET Curriculum 1 week 3 days */
merge into CURRICULUM_DAY values (111, 23, 1);
merge into CURRICULUM_DAY values (112, 23, 2);
merge into CURRICULUM_DAY values (113, 23, 3);
merge into CURRICULUM_DAY values (114, 23, 4);
merge into CURRICULUM_DAY values (115, 23, 5);

/* Mock data for .NET Curriculum 1 week 4 days */
merge into CURRICULUM_DAY values (116, 24, 1);
merge into CURRICULUM_DAY values (117, 24, 2);
merge into CURRICULUM_DAY values (118, 24, 3);
merge into CURRICULUM_DAY values (119, 24, 4);
merge into CURRICULUM_DAY values (120, 24, 5);

/* Mock data for .NET Curriculum 1 week 5 days */
merge into CURRICULUM_DAY values (121, 25, 1);
merge into CURRICULUM_DAY values (122, 25, 2);
merge into CURRICULUM_DAY values (123, 25, 3);
merge into CURRICULUM_DAY values (124, 25, 4);
merge into CURRICULUM_DAY values (125, 25, 5);

/* Mock data for .NET Curriculum 1 week 6 days */
merge into CURRICULUM_DAY values (126, 26, 1);
merge into CURRICULUM_DAY values (127, 26, 2);
merge into CURRICULUM_DAY values (128, 26, 3);
merge into CURRICULUM_DAY values (129, 26, 4);
merge into CURRICULUM_DAY values (130, 26, 5);

/* Mock data for .NET Curriculum 1 week 7 days */
merge into CURRICULUM_DAY values (131, 27, 1);
merge into CURRICULUM_DAY values (132, 27, 2);
merge into CURRICULUM_DAY values (133, 27, 3);
merge into CURRICULUM_DAY values (134, 27, 4);
merge into CURRICULUM_DAY values (135, 27, 5);

/* Mock data for .NET Curriculum 1 week 8 days */
merge into CURRICULUM_DAY values (136, 28, 1);
merge into CURRICULUM_DAY values (137, 28, 2);
merge into CURRICULUM_DAY values (138, 28, 3);
merge into CURRICULUM_DAY values (139, 28, 4);
merge into CURRICULUM_DAY values (140, 28, 5);

/* Mock data for .NET Curriculum 1 week 9 days */
merge into CURRICULUM_DAY values (141, 29, 1);
merge into CURRICULUM_DAY values (142, 29, 2);
merge into CURRICULUM_DAY values (143, 29, 3);
merge into CURRICULUM_DAY values (144, 29, 4);
merge into CURRICULUM_DAY values (145, 29, 5);

/* Mock data for .NET Curriculum 1 week 10 days */
merge into CURRICULUM_DAY values (146, 30, 1);
merge into CURRICULUM_DAY values (147, 30, 2);
merge into CURRICULUM_DAY values (148, 30, 3);
merge into CURRICULUM_DAY values (149, 30, 4);
merge into CURRICULUM_DAY values (150, 30, 5);

/* Day subtopics for Java Curriculum 1 Week 1 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(1, 1, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID,INDEX, subtopic_name_id)
values(2, 1, 2, 2);

/* Day subtopics for Java Curriculum 1 Week 1 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(3, 2, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(4, 2, 2, 4);

/* Day subtopics for Java Curriculum 1 Week 1 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(5, 3, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(6, 3, 2, 2);

/* Day subtopics for Java Curriculum 1 Week 1 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(7, 4, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(8, 4, 2, 4);

/* Day subtopics for Java Curriculum 1 Week 1 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(9, 5, 1, 5);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(10, 5, 2, 6);

/* Day subtopics for Java Curriculum 1 Week 2 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(11, 6, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(12, 6, 2, 8);

/* Day subtopics for Java Curriculum 1 Week 2 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(13, 7, 1, 9);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(14, 7, 2, 10);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(15, 7, 3, 11);

/* Day subtopics for Java Curriculum 1 Week 2 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(16, 8, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(17, 8, 2, 13);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(18, 8, 3, 14);

/* Day subtopics for Java Curriculum 1 Week 2 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(19, 9, 1, 15);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(20, 9, 2, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(21, 9, 3, 17);

/* Day subtopics for Java Curriculum 1 Week 2 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(22, 10, 1, 18);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(23, 10, 2, 19);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(24, 10, 3, 20);

/* Day subtopics for Java Curriculum 1 Week 3 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(25, 11, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(26, 11, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(27, 11, 3, 23);

/* Day subtopics for Java Curriculum 1 Week 3 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(28, 12, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(29, 12, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(30, 12, 3, 26);

/* Day subtopics for Java Curriculum 1 Week 3 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(31, 13, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(32, 13, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(33, 13, 3, 29);

/* Day subtopics for Java Curriculum 1 Week 3 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(34, 14, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(35, 14, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(36, 14, 3, 32);

/* Day subtopics for Java Curriculum 1 Week 3 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(37, 15, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(38, 15, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(39, 15, 3, 35);

/* Day subtopics for Java Curriculum 1 Week 4 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(40, 16, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(41, 16, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(42, 16, 3, 38);

/* Day subtopics for Java Curriculum 1 Week 4 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(43, 17, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(44, 17, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(45, 17, 3, 41);

/* Day subtopics for Java Curriculum 1 Week 4 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(46, 18, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(47, 18, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(48, 18, 3, 44);

/* Day subtopics for Java Curriculum 1 Week 4 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(49, 19, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(50, 19, 2, 46);

/* Day subtopics for Java Curriculum 1 Week 4 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(51, 20, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(52, 20, 2, 48);

/* Day subtopics for Java Curriculum 1 Week 5 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(53, 21, 1, 49);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(54, 21, 2, 50);

/* Day subtopics for Java Curriculum 1 Week 5 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(55, 22, 1, 51);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(56, 22, 2, 52);

/* Day subtopics for Java Curriculum 1 Week 5 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(57, 23, 1, 53);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(58, 23, 2, 54);

/* Day subtopics for Java Curriculum 1 Week 5 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(59, 24, 1, 55);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(60, 24, 2, 56);

/* Day subtopics for Java Curriculum 1 Week 5 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(61, 25, 1, 57);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(62, 25, 2, 58);

/* Day subtopics for Java Curriculum 1 Week 6 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(63, 26, 1, 59);

/* Day subtopics for Java Curriculum 1 Week 6 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(64, 27, 1, 60);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(65, 27, 2, 61);

/* Day subtopics for Java Curriculum 1 Week 6 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(66, 28, 1, 62);

/* Day subtopics for Java Curriculum 1 Week 6 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(67, 29, 1, 63);

/* Day subtopics for Java Curriculum 1 Week 6 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(68, 30, 1, 64);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(69, 30, 2, 65);

/* Day subtopics for Java Curriculum 1 Week 7 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(70, 31, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID,INDEX, subtopic_name_id)
values(71, 31, 2, 2);

/* Day subtopics for Java Curriculum 1 Week 7 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(72, 32, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(73, 32, 2, 4);

/* Day subtopics for Java Curriculum 1 Week 7 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(74, 33, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(75, 33, 2, 2);

/* Day subtopics for Java Curriculum 1 Week 7 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(76, 34, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(77, 34, 2, 4);

/* Day subtopics for Java Curriculum 1 Week 7 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(78, 35, 1, 5);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(79, 35, 2, 6);

/* Day subtopics for Java Curriculum 1 Week 8 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(80, 36, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(81, 36, 2, 8);

/* Day subtopics for Java Curriculum 1 Week 8 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(82, 37, 1, 9);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(83, 37, 2, 10);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(84, 37, 3, 11);

/* Day subtopics for Java Curriculum 1 Week 8 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(85, 38, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(86, 38, 2, 13);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(87, 38, 3, 14);

/* Day subtopics for Java Curriculum 1 Week 8 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(88, 39, 1, 15);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(89, 39, 2, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(90, 39, 3, 17);

/* Day subtopics for Java Curriculum 1 Week 8 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(91, 40, 1, 18);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(92, 40, 2, 19);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(93, 40, 3, 20);

/* Day subtopics for Java Curriculum 1 Week 9 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(94, 41, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(95, 41, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(96, 41, 3, 23);

/* Day subtopics for Java Curriculum 1 Week 9 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(97, 42, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(98, 42, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(99, 42, 3, 26);

/* Day subtopics for Java Curriculum 1 Week 9 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(100, 43, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(101, 43, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(102, 43, 3, 29);

/* Day subtopics for Java Curriculum 1 Week 9 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(103, 44, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(104, 44, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(105, 44, 3, 32);

/* Day subtopics for Java Curriculum 1 Week 9 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(106, 45, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(107, 45, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(108, 45, 3, 35);


/* Day subtopics for Java Curriculum 1 Week 10 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(109, 46, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(110, 46, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(111, 46, 3, 38);

/* Day subtopics for Java Curriculum 1 Week 10 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(112, 47, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(113, 47, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(114, 47, 3, 41);

/* Day subtopics for Java Curriculum 1 Week 10 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(115, 48, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(116, 48, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(117, 48, 3, 44);

/* Day subtopics for Java Curriculum 1 Week 10 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(118, 49, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(119, 49, 2, 46);

/* Day subtopics for Java Curriculum 1 Week 10 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(120, 50, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(121, 50, 2, 48);

/* Day subtopics for Java Curriculum 2 Week 1 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(122, 51, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(123, 51, 2, 2);

/* Day subtopics for Java Curriculum 2 Week 1 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(124, 52, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(125, 52, 2, 4);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(126, 52, 3, 5);

/* Day subtopics for Java Curriculum 2 Week 1 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(127, 53, 2, 6);

/* Day subtopics for Java Curriculum 2 Week 1 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(128, 54, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(129, 54, 2, 8);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(130, 54, 3, 9);

/* Day subtopics for Java Curriculum 2 Week 1 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(131, 55, 2, 10);

/* Day subtopics for Java Curriculum 2 Week 2 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(132, 56, 1, 11);

/* Day subtopics for Java Curriculum 2 Week 2 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(133, 57, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(134, 57, 2, 13);

/* Day subtopics for Java Curriculum 2 Week 2 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(135, 58, 1, 14);

/* Day subtopics for Java Curriculum 2 Week 2 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(136, 59, 1, 15);

/* Day subtopics for Java Curriculum 2 Week 2 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(137, 60, 1, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(138, 60, 2, 17);

/* Day subtopics for Java Curriculum 2 Week 3 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(139, 61, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(140, 61, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(141, 61, 3, 23);

/* Day subtopics for Java Curriculum 2 Week 3 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(142, 62, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(143, 62, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(144, 62, 3, 26);

/* Day subtopics for Java Curriculum 2 Week 3 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(145, 63, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(146, 63, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(147, 63, 3, 29);

/* Day subtopics for Java Curriculum 2 Week 3 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(148, 64, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(149, 64, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(150, 64, 3, 32);

/* Day subtopics for Java Curriculum 2 Week 3 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(151, 65, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(152, 65, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(153, 65, 3, 35);

/* Day subtopics for Java Curriculum 2 Week 4 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(154, 66, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(155, 66, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(156, 66, 3, 38);

/* Day subtopics for Java Curriculum 2 Week 4 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(157, 67, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(158, 67, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(159, 67, 3, 41);

/* Day subtopics for Java Curriculum 2 Week 4 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(160, 68, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(161, 68, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(162, 68, 3, 44);

/* Day subtopics for Java Curriculum 2 Week 4 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(163, 69, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(164, 69, 2, 46);

/* Day subtopics for Java Curriculum 2 Week 4 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(165, 70, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(166, 70, 2, 48);

/* Day subtopics for Java Curriculum 2 Week 5 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(167, 71, 1, 49);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(168, 71, 2, 50);

/* Day subtopics for Java Curriculum 2 Week 5 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(169, 72, 1, 51);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(170, 72, 2, 52);

/* Day subtopics for Java Curriculum 2 Week 5 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(171, 73, 1, 53);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(172, 73, 2, 54);

/* Day subtopics for Java Curriculum 2 Week 5 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(173, 74, 1, 55);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(174, 74, 2, 56);

/* Day subtopics for Java Curriculum 2 Week 5 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(175, 75, 1, 57);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(176, 75, 2, 58);

/* Day subtopics for Java Curriculum 2 Week 6 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(177, 76, 1, 59);

/* Day subtopics for Java Curriculum 2 Week 6 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(178, 77, 1, 60);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(179, 77, 2, 61);

/* Day subtopics for Java Curriculum 2 Week 6 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(180, 78, 1, 62);

/* Day subtopics for Java Curriculum 2 Week 6 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(181, 79, 1, 63);

/* Day subtopics for Java Curriculum 2 Week 6 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(182, 80, 1, 64);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(183, 80, 2, 65);

/* Day subtopics for Java Curriculum 2 Week 7 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(184, 81, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID,INDEX, subtopic_name_id)
values(185, 81, 2, 2);

/* Day subtopics for Java Curriculum 2 Week 7 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(186, 82, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(187, 82, 2, 4);

/* Day subtopics for Java Curriculum 2 Week 7 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(188, 83, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(189, 83, 2, 2);

/* Day subtopics for Java Curriculum 2 Week 7 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(190, 84, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(245, 84, 2, 4);

/* Day subtopics for Java Curriculum 2 Week 7 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(191, 85, 1, 5);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(192, 85, 2, 6);

/* Day subtopics for Java Curriculum 2 Week 8 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(193, 86, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(194, 86, 2, 8);

/* Day subtopics for Java Curriculum 2 Week 8 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(195, 87, 1, 9);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(196, 87, 2, 10);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(197, 87, 3, 11);

/* Day subtopics for Java Curriculum 2 Week 8 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(198, 88, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(199, 88, 2, 13);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(200, 88, 3, 14);

/* Day subtopics for Java Curriculum 2 Week 8 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(201, 89, 1, 15);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(202, 89, 2, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(203, 89, 3, 17);

/* Day subtopics for Java Curriculum 2 Week 8 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(204, 90, 1, 18);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(205, 90, 2, 19);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(206, 90, 3, 20);

/* Day subtopics for Java Curriculum 2 Week 9 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(207, 91, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(208, 91, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(209, 91, 3, 23);

/* Day subtopics for Java Curriculum 2 Week 9 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(210, 92, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(211, 92, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(212, 92, 3, 26);

/* Day subtopics for Java Curriculum 2 Week 9 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(213, 93, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(214, 93, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(215, 93, 3, 29);

/* Day subtopics for Java Curriculum 2 Week 9 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(216, 94, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(217, 94, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(218, 94, 3, 32);

/* Day subtopics for Java Curriculum 2 Week 9 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(219, 95, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(220, 95, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(221, 95, 3, 35);


/* Day subtopics for Java Curriculum 2 Week 10 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(222, 96, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(223, 96, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(224, 96, 3, 38);

/* Day subtopics for Java Curriculum 2 Week 10 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(225, 97, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(226, 97, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(227, 97, 3, 41);

/* Day subtopics for Java Curriculum 2 Week 10 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(228, 98, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(229, 98, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(230, 98, 3, 44);

/* Day subtopics for Java Curriculum 2 Week 10 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(231, 99, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(232, 99, 2, 46);

/* Day subtopics for Java Curriculum 2 Week 10 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(233, 100, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(234, 100, 2, 48);

/* Day subtopics for .NET Curriculum 1 Week 1 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(235, 101, 1, 66);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(236, 101, 2, 68);

/* Day subtopics for .NET Curriculum 1 Week 1 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(237, 102, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(238, 102, 2, 4);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(239, 102, 3, 5);

/* Day subtopics for .NET Curriculum 1 Week 1 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(240, 103, 2, 6);

/* Day subtopics for .NET Curriculum 1 Week 1 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(241, 104, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(242, 104, 2, 8);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(243, 104, 3, 9);

/* Day subtopics for .NET Curriculum 1 Week 1 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(244, 105, 1, 10);

/* Day subtopics for .NET Curriculum 1 Week 2 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(246, 106, 1, 11);

/* Day subtopics for .NET Curriculum 1 Week 2 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(247, 107, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(248, 107, 2, 13);

/* Day subtopics for .NET Curriculum 1 Week 2 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(249, 108, 1, 14);

/* Day subtopics for .NET Curriculum 1 Week 2 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(250, 109, 1, 15);

/* Day subtopics for .NET Curriculum 1 Week 2 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(251, 110, 1, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(252, 110, 2, 17);

/* Day subtopics for Java Curriculum 2 Week 3 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(253, 111, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(254, 111, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(255, 111, 3, 23);

/* Day subtopics for Java Curriculum 2 Week 3 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(256, 112, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(257, 112, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(258, 112, 3, 26);

/* Day subtopics for Java Curriculum 2 Week 3 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(259, 113, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(260, 113, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(261, 113, 3, 29);

/* Day subtopics for Java Curriculum 2 Week 3 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(262, 114, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(263, 114, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(264, 114, 3, 32);

/* Day subtopics for Java Curriculum 2 Week 3 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(265, 115, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(266, 115, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(267, 115, 3, 35);

/* Day subtopics for Java Curriculum 2 Week 4 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(268, 116, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(269, 116, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(270, 116, 3, 38);

/* Day subtopics for Java Curriculum 2 Week 4 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(271, 117, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(272, 117, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(273, 117, 3, 41);

/* Day subtopics for Java Curriculum 2 Week 4 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(274, 118, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(275, 118, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(276, 118, 3, 44);

/* Day subtopics for Java Curriculum 2 Week 4 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(277, 119, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(278, 119, 2, 46);

/* Day subtopics for Java Curriculum 2 Week 4 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(279, 120, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(280, 120, 2, 48);

/* Day subtopics for Java Curriculum 2 Week 5 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(281, 121, 1, 49);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(282, 121, 2, 50);

/* Day subtopics for Java Curriculum 2 Week 5 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(283, 122, 1, 51);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(284, 122, 2, 52);

/* Day subtopics for Java Curriculum 2 Week 5 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(285, 123, 1, 53);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(286, 123, 2, 54);

/* Day subtopics for Java Curriculum 2 Week 5 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(287, 124, 1, 55);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(288, 124, 2, 56);

/* Day subtopics for Java Curriculum 2 Week 5 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(289, 125, 1, 57);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(290, 125, 2, 58);

/* Day subtopics for Java Curriculum 2 Week 6 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(291, 126, 1, 59);

/* Day subtopics for Java Curriculum 2 Week 6 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(292, 127, 1, 60);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(293, 127, 2, 61);

/* Day subtopics for Java Curriculum 2 Week 6 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(294, 128, 1, 62);

/* Day subtopics for Java Curriculum 2 Week 6 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(295, 129, 1, 63);

/* Day subtopics for Java Curriculum 2 Week 6 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(296, 130, 1, 64);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(297, 130, 2, 65);

/* Day subtopics for Java Curriculum 2 Week 7 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(298, 131, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID,INDEX, subtopic_name_id)
values(299, 131, 2, 2);

/* Day subtopics for Java Curriculum 2 Week 7 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(300, 132, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(301, 132, 2, 4);

/* Day subtopics for Java Curriculum 2 Week 7 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(302, 133, 1, 1);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(303, 133, 2, 2);

/* Day subtopics for Java Curriculum 2 Week 7 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(304, 134, 1, 3);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(305, 134, 2, 4);

/* Day subtopics for Java Curriculum 2 Week 7 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(306, 135, 1, 5);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(307, 135, 2, 6);

/* Day subtopics for Java Curriculum 2 Week 8 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(308, 136, 1, 7);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(309, 136, 2, 8);

/* Day subtopics for Java Curriculum 2 Week 8 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(310, 137, 1, 9);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(311, 137, 2, 10);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(312, 137, 3, 11);

/* Day subtopics for Java Curriculum 2 Week 8 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(313, 138, 1, 12);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(314, 138, 2, 13);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(315, 138, 3, 14);

/* Day subtopics for Java Curriculum 2 Week 8 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(316, 139, 1, 15);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(317, 139, 2, 16);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(318, 139, 3, 17);

/* Day subtopics for Java Curriculum 2 Week 8 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(319, 140, 1, 18);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(320, 140, 2, 19);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(321, 140, 3, 20);

/* Day subtopics for Java Curriculum 2 Week 9 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(322, 141, 1, 21);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(323, 141, 2, 22);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(324, 141, 3, 23);

/* Day subtopics for Java Curriculum 2 Week 9 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(325, 142, 1, 24);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(326, 142, 2, 25);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(327, 142, 3, 26);

/* Day subtopics for Java Curriculum 2 Week 9 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(328, 143, 1, 27);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(329, 143, 2, 28);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(330, 143, 3, 29);

/* Day subtopics for Java Curriculum 2 Week 9 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(331, 144, 1, 30);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(332, 144, 2, 31);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(333, 144, 3, 32);

/* Day subtopics for Java Curriculum 2 Week 9 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(334, 145, 1, 33);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(335, 145, 2, 34);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(336, 145, 3, 35);


/* Day subtopics for Java Curriculum 2 Week 10 Day 1 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(337, 146, 1, 36);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(338, 146, 2, 37);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(339, 146, 3, 38);

/* Day subtopics for Java Curriculum 2 Week 10 Day 2 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(340, 147, 1, 39);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(341, 147, 2, 40);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(342, 147, 3, 41);

/* Day subtopics for Java Curriculum 2 Week 10 Day 3 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(343, 148, 1, 42);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(344, 148, 2, 43);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(345, 148, 3, 44);

/* Day subtopics for Java Curriculum 2 Week 10 Day 4 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(346, 149, 1, 45);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(347, 149, 2, 46);

/* Day subtopics for Java Curriculum 2 Week 10 Day 5 */
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(348, 150, 1, 47);
merge into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(349, 150, 2, 48);