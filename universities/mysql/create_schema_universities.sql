# first file to execute
GRANT ALL PRIVILEGES ON * . * TO 'root'@'localhost' ;
create schema if not exists universities ;
drop table if exists grades;
drop table if exists course_grading;
drop table if exists grade_types;
drop table if exists student_majors;
drop table if exists student_courses;
drop table if exists majors;
drop table if exists courses;
drop table if exists semesters;
drop table if exists department;
drop table if exists professor;
drop table if exists administrator;
drop table if exists graduate_student; 
drop table if exists student;
drop table if exists employee;
drop table if exists university;
drop table if exists address;
drop table if exists address_type;
drop table if exists city;
drop table if exists state;
drop table if exists country;
drop table if exists binary_field;
	
create table country(country_id mediumint not null auto_increment primary key, 
					country_code varchar(6) not null, 
                    country_name varchar(100) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
insert into country(country_code,country_name,evnt_tmestmp,evnt_oper_id) values('USA','United States of America', sysdate(), 'admin');
create table state(state_id mediumint not null auto_increment primary key, 
					country_id mediumint not null, foreign key FK_1(country_id) references country(country_id) on update cascade on delete cascade,
					state_code varchar(2) not null, state_name varchar(30) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table city(city_id mediumint not null auto_increment primary key, state_id mediumint not null, 
					foreign key state_fk_1(state_id) references state(state_id) on update cascade on delete cascade,
					city_name varchar(40) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table address_type(address_type_id mediumint not null auto_increment primary key, address_type_code varchar(10) not null, 
					address_type_subcode varchar(20) not null, address_type_name varchar(50) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table university(university_id mediumint not null auto_increment primary key, university_code varchar(10), unique key(university_code), 
					university_name varchar(100) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table address(address_id mediumint not null auto_increment primary key, address_type_id mediumint not null, foreign key address_type_fk_1(address_type_id) references address_type(address_type_id) 
					on update cascade on delete cascade, connector_id mediumint,					
					full_street_name varchar(100) not null, city_id mediumint,
					foreign key city_fk_1(city_id) references city(city_id) on update cascade on delete set null,
					state_id mediumint, foreign key state_fk_2(state_id) references state(state_id) on update cascade on delete set null,
					zip_code varchar(15) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table department(department_id mediumint not null auto_increment primary key, university_id mediumint not null, foreign key 
					university_fk_1(university_id) references university(university_id) on update cascade on delete cascade,
					department_code varchar(10) not null, department_name varchar(100) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table student(student_id mediumint not null auto_increment primary key,university_id mediumint not null, 
					foreign key universtiy_fk_1(university_id) references university(university_id) on update cascade on delete cascade,
					firstname varchar(40), lastname varchar(40), social_security_number varchar(9), evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table majors(major_id mediumint not null auto_increment primary key, department_id mediumint not null, foreign key 
					department_fk_1(department_id) references department(department_id) on update cascade on delete cascade,
					major_code varchar(6) not null, major_description varchar(40) not null, minor_flag varchar(1) not null, 
					evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table student_majors(student_major_id mediumint not null auto_increment primary key, student_id mediumint not null, 
					foreign key student_fk_1(student_id) references student(student_id) on update cascade on delete cascade,
					major_id mediumint not null, foreign key major_fk_1(major_id) references majors(major_id) 
					on update cascade on delete cascade, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table semesters(semester_id mediumint not null auto_increment primary key, school_year varchar(4) not null,
					season varchar(10) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table courses(course_id mediumint not null auto_increment primary key, department_id mediumint not null, 
					foreign key department_fk_2(department_id) references department(department_id) on update cascade on delete cascade,
					semester_id mediumint not null, foreign key semester_fk_1(semester_id) references semesters(semester_id) 
					on update cascade on delete cascade, course_code varchar(10) not null, course_name varchar(100) not null, 
					max_enrollment smallint not null, non_majors varchar(1), evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table student_courses(student_course_id mediumint not null auto_increment primary key, student_id mediumint not null, 
					foreign key student_fk_2(student_id) references student(student_id) on update cascade on delete cascade,
					course_id mediumint not null, foreign key course_fk_1(course_id) references courses(course_id) 
					on update cascade on delete cascade, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table grade_types(grade_type_id mediumint not null auto_increment primary key, grade_type_code varchar(3) not null,
					grade_type_desc varchar(25) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table course_grading(course_grading_id mediumint not null auto_increment primary key, course_id mediumint not null, 
					foreign key course_fk_2(course_id) references courses(course_id) on update cascade on delete cascade, 
					grade_type_id mediumint not null, foreign key grade_type_fk_1(grade_type_id) references grade_types(grade_type_id) 
					on update cascade on delete cascade, point_value decimal(5,2) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
create table grades(grade_id mediumint not null auto_increment primary key, course_id mediumint not null, foreign key course_fk_2(course_id) 
					references courses(course_id) on update cascade on delete cascade, student_id mediumint not null, foreign key student_fk_3(student_id) 
					references student(student_id) on update cascade on delete cascade, course_grading_id mediumint not null, 
					foreign key course_grading_fk_1(course_grading_id) references course_grading(course_grading_id) on update cascade on delete cascade,
					grade_value decimal(5,2) , actv_ind varchar(1) not null, evnt_tmestmp DATETIME(2), evnt_oper_id varchar(10));
CREATE TABLE binary_field (binary_field_id mediumint(9) NOT NULL AUTO_INCREMENT, binary_field_bits varbinary(64000) DEFAULT NULL,
					PRIMARY KEY(binary_field_id));

commit;
