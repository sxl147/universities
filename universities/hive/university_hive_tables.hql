create external table country(country_id INT, country_code varchar(6), country_name varchar(100), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/country/';

create external table state(state_id INT, country_id INT, state_code varchar(2), state_name varchar(30), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/state/';

create external table city(city_id INT, state_id INT, city_name varchar(40), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/city/';

create external table address_type(address_type_id INT, address_type_code varchar(10), address_type_subcode varchar(20), address_type_name varchar(50), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/address_type/';

create external table university(university_id INT, university_code varchar(10),university_name varchar(100), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/university/';

create external table address(address_id INT, address_type_id INT, connector_id INT,full_street_name varchar(100), city_id INT, state_id INT,
zip_code varchar(15), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/address/';

create external table department(department_id INT, university_id INT, department_code varchar(10), department_name varchar(100), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/department/';

create external table student(student_id INT, university_id INT, firstname varchar(40), lastname varchar(40), social_security_number varchar(9), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/student/';

create external table majors(major_id INT, department_id INT, major_code varchar(6), major_description varchar(40), minor_flag varchar(1), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/majors/';

create external table student_majors(student_major_id INT, student_id INT, major_id INT, evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/student_majors/';

create external table semesters(semester_id INT, school_year varchar(4), season varchar(10), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/semesters/';

create external table courses(course_id INT, department_id INT, semester_id INT, course_code varchar(10), course_name varchar(100), max_enrollment INT, 
non_majors varchar(1), evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/courses/';

create external table student_courses(student_course_id INT, student_id INT, course_id INT, evnt_tmestmp TIMESTAMP, evnt_oper_id varchar(10))
row format delimited fields terminated by '^' location '/user/cloudera/sqoop/universities/university/student_courses/';