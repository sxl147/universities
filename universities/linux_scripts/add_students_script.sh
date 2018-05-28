# whenever I run my Java program to insert additional students into my mysql tables,
# I run this script to perform incremental imports for the following tables: 
# student
# address
# student_majors
# student_courses
#
# this script uses an alternate way of finding the --last-value for each incremental import
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
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student \
--incremental append \
--options-file /home/cloudera/student_max.txt \
--target-dir /user/cloudera/sqoop/universities/university/student/
echo "determining new student_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_id) from student" > student_temp.txt
echo "regenerating new student_max.txt"
java TextFileProcessor student_temp.txt student_max.txt student_id

echo "running address incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table address \
--incremental append \
--options-file /home/cloudera/address_max.txt \
--target-dir /user/cloudera/sqoop/universities/university/address/
echo "determining new address_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(address_id) from address" > address_temp.txt
echo "regenerating new address_max.txt"
java TextFileProcessor address_temp.txt address_max.txt address_id

echo "running student_majors incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student_majors \
--incremental append \
--options-file /home/cloudera/student_majors_max.txt \
--target-dir /user/cloudera/sqoop/universities/university/student_majors/
echo "determining new student_major_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_major_id) from student_majors" > student_majors_temp.txt
echo "regenerating new student_majors_max.txt"
java TextFileProcessor student_majors_temp.txt student_majors_max.txt student_major_id

echo "running student_courses incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--fields-terminated-by '^' \
--table student_courses \
--incremental append \
--options-file /home/cloudera/student_courses_max.txt \
--target-dir /user/cloudera/sqoop/universities/university/student_courses/
echo "determining new student_course_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=root \
--password-file file://sqoop.password \
--query "select max(student_course_id) from student_courses" > student_courses_temp.txt
echo "regenerating new student_courses_max.txt"
java TextFileProcessor student_courses_temp.txt student_courses_max.txt student_course_id

