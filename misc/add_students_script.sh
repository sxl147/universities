echo "running student incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--fields-terminated-by '^' \
--table student \
--incremental append \
--options-file /home/cloudera/student_max.txt \
--target-dir /user/cloudera/sqoop/universities/university_06172017_2/student/
echo "determining new student_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--query "select max(student_id) from student" > student_temp.txt
echo "regenerating new student_max.txt"
java TextFileProcessor student_temp.txt student_max.txt student_id

echo "running address incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--fields-terminated-by '^' \
--table address \
--incremental append \
--options-file /home/cloudera/address_max.txt \
--target-dir /user/cloudera/sqoop/universities/university_06172017_2/address/
echo "determining new address_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--query "select max(address_id) from address" > address_temp.txt
echo "regenerating new address_max.txt"
java TextFileProcessor address_temp.txt address_max.txt address_id

echo "running student_majors incremental import"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--fields-terminated-by '^' \
--table student_majors \
--incremental append \
--options-file /home/cloudera/student_majors_max.txt \
--target-dir /user/cloudera/sqoop/universities/university_06172017_2/student_majors/
echo "determining new student_major_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--query "select max(student_major_id) from student_majors" > student_majors_temp.txt
echo "regenerating new student_majors_max.txt"
java TextFileProcessor student_majors_temp.txt student_majors_max.txt student_major_id

echo "running student_courses inport"
sqoop import \
-m 4 \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--fields-terminated-by '^' \
--table student_courses \
--incremental append \
--options-file /home/cloudera/student_courses_max.txt \
--target-dir /user/cloudera/sqoop/universities/university_06172017_2/student_courses/
echo "determining new student_course_id"
sqoop eval \
--connect "jdbc:mysql://192.168.1.133:3306/universities" \
--username=dylan \
--password=schnarbies \
--query "select max(student_course_id) from student_courses" > student_courses_temp.txt
echo "regenerating new student_courses_max.txt"
java TextFileProcessor student_courses_temp.txt student_courses_max.txt student_course_id

