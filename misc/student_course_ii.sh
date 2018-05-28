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
