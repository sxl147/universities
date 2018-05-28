# After I run my Java program to insert my initial set of university data into my mysql tables,
# I run this script to perform imports for the following tables: 
# country
# state
# city
# adddress_type
# university
# address
# department
# student
# majors
# student_majors
# semesters
# courses, and
# student_courses
#
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table country \
--target-dir /user/cloudera/sqoop/universities/university/country/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table state \
--target-dir /user/cloudera/sqoop/universities/university/state/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table city \
--target-dir /user/cloudera/sqoop/universities/university/city/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table address_type \
--target-dir /user/cloudera/sqoop/universities/university/address_type/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table university \
--target-dir /user/cloudera/sqoop/universities/university/university/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table address \
--target-dir /user/cloudera/sqoop/universities/university/address/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table department \
--target-dir /user/cloudera/sqoop/universities/university/department/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student \
--target-dir /user/cloudera/sqoop/universities/university/student/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table majors \
--target-dir /user/cloudera/sqoop/universities/university/majors/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student_majors \
--target-dir /user/cloudera/sqoop/universities/university/student_majors/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table semesters \
--target-dir /user/cloudera/sqoop/universities/university/semesters/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table courses \
--target-dir /user/cloudera/sqoop/universities/university/courses/

sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student_courses \
--target-dir /user/cloudera/sqoop/universities/university/student_courses/

echo "creating hive tables"

hive -f university_hive_tables.hql

###daily incremental import after adding new students
# this script uses an alternate way of finding the --last-value for future incremental imports
# these --last-value values are held in text files:
# student_max.txt, 
# address_max.txt, 
# student_majors_max.txt, and 
# student_courses_max.txt
# after the incremental import for a table, I run a sqoop evel on the table to get the new
# maximum primary key, and save it to another file called:
# student_temp.txt
# address_temp.txt
# student_majors_temp.txt, and
# student_coures_temp.txt
# then I run a Java program TextFileProcessor that will take the temp file, parse out the new primary key,
# and overwrite the *_max.txt file with the new value(for next time)
# not super kosher, but it works
echo "initializing primary key files for future incremental imports"
echo ""
echo "determining new student_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_id) from student" > student_temp.txt
echo "regenerating new student_max.txt"
java TextFileProcessor student_temp.txt student_max.txt student_id

echo "determining new address_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(address_id) from address" > address_temp.txt
echo "regenerating new address_max.txt"
java TextFileProcessor address_temp.txt address_max.txt address_id

echo "determining new student_major_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_major_id) from student_majors" > student_majors_temp.txt
echo "regenerating new student_majors_max.txt"
java TextFileProcessor student_majors_temp.txt student_majors_max.txt student_major_id

echo "determining new student_course_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_course_id) from student_courses" > student_courses_temp.txt
echo "regenerating new student_courses_max.txt"
java TextFileProcessor student_courses_temp.txt student_courses_max.txt student_course_id