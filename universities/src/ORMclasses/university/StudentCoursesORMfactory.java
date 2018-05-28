package ORMclasses.university;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utility.specific.HibernateUtil;

public class StudentCoursesORMfactory 
{
	public static Long addRecord(StudentCoursesORM updatedRecord) throws Exception
    {
            Session session = null;
            Transaction tx = null;
            Long recordNumber = null;
          try
          {
           session =  getSessionFactory().openSession();
             tx = session.beginTransaction();
             recordNumber = (Long) session.save(updatedRecord);
             tx.commit();
          }catch (HibernateException e) {
             if (tx!=null) tx.rollback();
             e.printStackTrace();
             throw e;
          }finally {
              session.close();
          }
          return recordNumber;
    }

	public static boolean updateRecord(StudentCoursesORM intialRecord) throws Exception
    {
          Session session = null;
          Transaction tx = null;
          boolean success = false;  
          try
          {
             session =  getSessionFactory().openSession();
             tx = session.beginTransaction();
             session.update(intialRecord);
             tx.commit();
             success = true;
          }catch (HibernateException e) {
             if (tx!=null) tx.rollback();
             e.printStackTrace();
             throw e;
          }finally {
              session.close();
          }
          return success;
    }
	
	public static SessionFactory getSessionFactory()
    {
      SessionFactory sessionFactory = null;
      try
      {
          sessionFactory = HibernateUtil.getSessionFactory();
      }
      catch(Exception e)
      {
          ;
      }
      return sessionFactory;
    }
	
	public static void generateStudentCourses(List<StudentORM> students, String operId)
	{
		Date today = new Date();
		for(StudentORM student : students)
		{
			// each student takes between 1 - 5 courses
			int totalCourses = generateRandomNum(1,5);
			int totalMajorCourses = 0;
			int totalExtraCourses = 0;
			// the first 3 will be in their major, if they are taking more than 3,
			// the other 1 or 2 will be in a random department OTHER than their major
			if(totalCourses>3)
			{
				totalMajorCourses = 3;
				totalExtraCourses = totalCourses - 3;
			}
			else
			{
				totalMajorCourses = totalCourses;
			}
			// System.out.println("totalMajorCourses = " + totalMajorCourses);
			// System.out.println("totalExtraCourses = " + totalExtraCourses);
			// for the major courses -
			// we need to get the studentMajors object
			StudentMajorsORM studMaj = StudentMajorsORMfactory.getStudentMajorByStudentId(student.getId(), operId);
			// then use that to get the MajorORM object
			MajorORM major = MajorORMfactory.getMajorById(studMaj.getMajorId(), operId);	
			// save the departmentID for later
			Long departmentId = major.getDepartmentId();
			// then use the departmentId to get a list of courses
			List<CourseORM> majorCourses = CourseORMfactory.getCoursesForDepartment(departmentId, operId);
			for(int i = 0 ; i < totalMajorCourses ; i++)
			{
				int courseList = majorCourses.size();
				// System.out.println("majorCourses.size() = " + courseList);
				if(courseList>0)
				{
					StudentCoursesORM studentCourse = new StudentCoursesORM();
					// get a random course
					int randomCourseNum = 0;
					if(courseList>1)
					{
						randomCourseNum = generateRandomNum(0,courseList-1);
					}
					CourseORM currentCourse = majorCourses.get(randomCourseNum);
					// remove the course from the list of courses
					majorCourses.remove(randomCourseNum);
					studentCourse.setCourseId(currentCourse.getId().longValue());
					studentCourse.setStudentId(student.getId().longValue());
					studentCourse.setEvntTmeStmp(today);
					studentCourse.setEvntOperId(operId);
					try {
						addRecord(studentCourse);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			// now for the non-major courses
			if(totalExtraCourses>0)
			{
				List<DepartmentORM> departments = DepartmentORMfactory.getNonMajorDepartmentsForUniversity(student.getUniversityId(), departmentId, operId);
				for(int i = 0 ; i < totalExtraCourses ; i++)
				{
					int departmentList = departments.size();
					// System.out.println("departments.size() = " + departmentList);
					if(departmentList>0)
					{
						// get a random department
						int randomDepartmentNum = 0;
						if(departmentList>1)
						{
							randomDepartmentNum = generateRandomNum(0,departmentList-1);
						}
						DepartmentORM currentDepartment = departments.get(randomDepartmentNum);
						// remove the department from the list of departments
						departments.remove(randomDepartmentNum);
						List<CourseORM> extraCourses = CourseORMfactory.getCoursesForDepartment(currentDepartment.getId(), operId);
						int courseList = extraCourses.size();
						// System.out.println("extraCourses.size() = " + courseList);
						StudentCoursesORM studentCourse = new StudentCoursesORM();
						// get a random course
						int randomCourseNum = 0;
						if(courseList>1)
						{
							randomCourseNum = generateRandomNum(0,courseList-1);
						}
						CourseORM currentCourse = extraCourses.get(randomCourseNum);
						studentCourse.setCourseId(currentCourse.getId().longValue());
						studentCourse.setStudentId(student.getId().longValue());
						studentCourse.setEvntTmeStmp(today);
						studentCourse.setEvntOperId(operId);
						try {
							addRecord(studentCourse);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
}
