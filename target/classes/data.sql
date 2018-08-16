insert into role (id, role)
values(1, 'manager');

insert into role (id, role)
values(2, 'trainer');

insert into role (id, role)
values(3, 'associate');

insert into status (id, status)
values(1, 'active');

insert into status (id, status)
values(2, 'inactive');

insert into bam_user (id, firstname, lastname, email, role_id, status_id)
values(1, 'Wezley', 'Singleton', 'wsingleton@revature.com', 2, 1);
insert into bam_user (id, firstname, lastname, email, role_id, status_id)
values(2, 'Blake', 'Lavla', 'blakel@revature.com', 2, 1);
insert into bam_user (id, firstname, lastname, email, role_id, status_id)
values(3, 'Steve', 'Sparky', 'steves@revature.com', 2, 1);
insert into bam_user (id, firstname, lastname, email, role_id, status_id)
values(4, 'Dillon', 'Qsee', 'dillonq@revature.com', 2, 1);