
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

/* Java subtopiocs */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (1, 'Introduction to Java: Why Java?', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (2, 'OOP Concepts in Depth: Polymorphism, Encapsulation, Inheritance, and Abstraction', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (3, 'Constructors', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values (4, 'Methods and Parameters', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(5, 'Scopes of a Variable in Java', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(6, 'Array', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(7, 'Access Modifiers', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(8, 'String API', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(9, 'StringBuilder and StringBuffer', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(10, 'Exception Handling - try, catch, finally', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(11, 'Reflection', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(12, 'Inheritance', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(13, 'File I/O: FileInputStream/FileReader/FileWriter', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(14, 'Methods and Parameters', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(15, 'Serialization', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(16, 'Collection Framework', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(17, 'Object Class', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(18, 'String API', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(19, 'Equals and Hashcode', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(20, 'Thread model', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(21, 'Creational Design Patterns: Singleton and Factory', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(22, 'Introduction to Unit Testing', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(23, 'Introduction to Maven', 1);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(24, 'Maven Project Object Model (POM)', 1);
/* SQL subtopics */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(25, 'Relational Database Service (RDS)', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(26, 'Introduction to DBMS', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(27, 'DML, DDL, DQL', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(28, 'Simple and Prepared Statements', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(29, 'Basic SQL Queries', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(30, 'Introduction to JDBC', 2);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(31, 'Connection Interface', 2);
/* Client-side Technologies */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(32, 'HTML 5', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(33, 'JavaScript Overview', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(34, 'DOM Selection', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(35, 'AJAX Introduction', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(36, 'Introduction to XML', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(37, 'Design Patterns: MVC, Front Controllers, Business Delegate', 3);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(38, 'Servlet Introduction', 4);
/* Angular */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(39, 'Introduction to TypeScript', 5);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(40, 'Components', 5);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(41, 'RxJS Promises vs ObservableL', 5);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(42, 'AngularJS vs Angular 4', 5);
/* DevOps */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(43, 'Amazon Web Services Introduction', 6);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(44, 'Continuous Integration (CI)', 6);
/* Hibernate */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(45, 'Hibernate Object States', 7);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(46, 'DAO Implementation', 7);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(47, 'Hibernate Criteria API', 7);
/* Spring */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(48, 'Introduction to Spring', 8);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(49, 'Bean Lifecycle', 8);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(50, 'Annotations', 8);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(51, '@Component, @Repository, @Service, @Inject, @Autowired', 8);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(52, 'Aspect-Oriented Programming (AOP)', 8);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(53, 'Spring Data', 8);
/* Web Services */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(54, 'Overview of Web Services', 9);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(55, 'Why We use Web Services', 9);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(56, 'REST (Spring)', 9);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(57, 'Exposing/Consuming REST', 9);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(58, 'WSDL', 9);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(59, 'Contract First/Contract Last', 9);
/* Microservices */
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(60, 'Microservices-(Discovery)', 10);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(61, 'Microservices Architecture', 10);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(62, 'API Gateway-Zuul/MS Web API', 10);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(63, 'Service Discovery & Registry-Eureka(Ribbon)/Consul', 10);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(64, 'Deployment Environment', 10);
insert into SUBTOPIC_NAMES (subtopic_name_id, SUBTOPIC_NAME, TOPIC_ID)
values(65, 'Containerization-Docker', 10);

insert into curriculum values (1,'Java',1, 1, '2018-09-27', 10, '1', '2');
insert into curriculum values (2,'Java',2, 1, '2018-09-29', 10, '1', '2');

insert into curriculum_week values (1, 1, 1);
insert into curriculum_week values (2, 2, 1);

insert into CURRICULUM_DAY values (1, 1, 1);
insert into CURRICULUM_DAY values (2, 1, 2);
insert into CURRICULUM_DAY values (5, 1, 3);
insert into CURRICULUM_DAY values (6, 1, 4);
insert into CURRICULUM_DAY values (7, 1, 5);
insert into CURRICULUM_DAY values (3, 2, 1);
insert into CURRICULUM_DAY values (4, 2, 2);




insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(1, 1, 1, 1);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID,INDEX, subtopic_name_id)
values(2, 1, 2, 2);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(3, 2, 1, 3);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(4, 2, 2, 4);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(5, 3, 1, 1);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(6, 3, 2, 2);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(7, 4, 1, 3);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(8, 4, 2, 4);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(9, 5, 1, 5);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(10, 5, 2, 6);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(11, 6, 1, 7);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(12, 6, 2, 8);

insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(13, 7, 1, 9);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)
values(14, 7, 2, 10);
insert into day_subtopic (subtopic_id, CURRICULUM_DAY_ID, INDEX, subtopic_name_id)   
values(15, 7, 3, 11);


