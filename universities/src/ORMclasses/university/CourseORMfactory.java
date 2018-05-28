package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class CourseORMfactory 
{
	private static Map historyCourses = new HashMap();
	private static Map languaguCourses = new HashMap();
	private static Map scienceCourses = new HashMap();
	private static Map mathCourses = new HashMap();
	private static Map engineeringCourses = new HashMap();
	private static Map computerScienceCourses = new HashMap();
	private static Map artCourses = new HashMap();
	private static Map musicCourses = new HashMap();
	private static Map communicationsCourses = new HashMap();
	private static Map businessCourses = new HashMap();
	private static Map courseMap = new HashMap();
	
	private static void initializeMaps()
	{
		historyCourses.put("AMER100","Early American History");
		historyCourses.put("AMER200","Revolutionary War History");
		historyCourses.put("AMER300","History of the Civil War");
		historyCourses.put("AMER400","Modern American History");
		historyCourses.put("WORL100","Early World History");
		historyCourses.put("WORL200","Middle Age History");
		historyCourses.put("WORL300","History or the Rennaisance");
		historyCourses.put("WORL400","History or WWII");
		historyCourses.put("ECHST100","History of Econimics 100");
		historyCourses.put("POLHST100","Political History 100");
		
		languaguCourses.put("ENGL100","English, Level 1");
		languaguCourses.put("SPAN100","Spanish, Level 1");
		languaguCourses.put("FRNCH100","French, Level 1");
		languaguCourses.put("CHIN100","Chinese, Level 1");
		languaguCourses.put("ENGL200","English, Level 2");
		languaguCourses.put("SPAN200","Spanish, Level 2");
		languaguCourses.put("FRNCH200","French, Level 2");
		languaguCourses.put("CHIN200","Chinese, Level 2");
		languaguCourses.put("ENGL300","English, Level 3");
		languaguCourses.put("SPAN300","Spanish, Level 3");
		languaguCourses.put("FRNCH300","French, Level 3");
		languaguCourses.put("CHIN300","Chinese, Level 3");
		languaguCourses.put("ENGL400","English, Level 4");
		languaguCourses.put("SPAN400","Spanish, Level 4");
		languaguCourses.put("FRNCH400","French, Level 4");
		languaguCourses.put("CHIN400","Chinese, Level 4");
		
		scienceCourses.put("PHYS101","Physics 101");
		scienceCourses.put("CHEM101","Chemistry 101");
		scienceCourses.put("BIOL101","Biology 101");
		scienceCourses.put("METER101","Metereology 101");
		scienceCourses.put("GEOL101","Geology 101");
		scienceCourses.put("ANTH101","Anthropology 101");
		scienceCourses.put("PHYS101","Physics 101");
		scienceCourses.put("CHEM101","Chemistry 101");
		scienceCourses.put("BIOL101","Biology 101");
		scienceCourses.put("METER101","Metereology 101");
		scienceCourses.put("GEOL101","Geology 101");
		scienceCourses.put("ANTH101","Anthropology 101");
		scienceCourses.put("PHYS201","Physics 201");
		scienceCourses.put("CHEM201","Chemistry 201");
		scienceCourses.put("BIOL201","Biology 201");
		scienceCourses.put("METER201","Metereology 201");
		scienceCourses.put("GEOL201","Geology 201");
		scienceCourses.put("ANTH201","Anthropology 201");
		scienceCourses.put("PHYS301","Physics 301");
		scienceCourses.put("CHEM301","Chemistry 301");
		scienceCourses.put("BIOL301","Biology 301");
		scienceCourses.put("METER301","Metereology 301");
		scienceCourses.put("GEOL301","Geology 301");
		scienceCourses.put("ANTH301","Anthropology 301");
		
		mathCourses.put("MATH101","Applied Mathematics I");
		mathCourses.put("MATH102","Statistical Methods I");
		mathCourses.put("MATH201","Applied Mathematics");
		mathCourses.put("MATH301","Probability");
		
		engineeringCourses.put("ELE100","Electrical Circuits I");
		engineeringCourses.put("MEC100","Mechanical Engineering 100");
		engineeringCourses.put("CHE100","Chemical Engineering 100");
		engineeringCourses.put("CIVL100","Statics and Dynamics");
		engineeringCourses.put("BIOEN100","Biological Engineering 100");
		engineeringCourses.put("ENV100","Environmental Engineering 100");
		engineeringCourses.put("MAT100","Materials Engineering 100");
		engineeringCourses.put("ELE200","Digital Circuits I");
		engineeringCourses.put("MEC200","Thermodynamics");
		engineeringCourses.put("CHEN200","Chemical Engineering 200");
		engineeringCourses.put("CIVL200","Statics and Dynamics II");
		engineeringCourses.put("BIOEN200","Biological Engineering 200");
		engineeringCourses.put("ENV200","Environmental Engineering 200");
		engineeringCourses.put("MAT200","Structure of Polymers");
		
		computerScienceCourses.put("CSC100","Video Game Programming");
		computerScienceCourses.put("CSC200","Web Development");
		computerScienceCourses.put("CSC300","Information Security");
		
		artCourses.put("ART100","Sculpture");
		artCourses.put("ART200","Early Art History");
		artCourses.put("ART300","Media Production I");
		artCourses.put("ART400","Impressionist Painting");
		artCourses.put("ART500","Modern Art History");
		artCourses.put("ART600","Media Production II");
		
		musicCourses.put("MUS101","Musical Conducting");
		musicCourses.put("MUS102","Media Musical Production");
		musicCourses.put("MUS103","Music History");
		musicCourses.put("MUS201","Concert Band I");
		musicCourses.put("MUS202","Concert Band II");
		musicCourses.put("MUS203","Concert Band III");
		
		communicationsCourses.put("COM101","Interpersonal Communication I");
		communicationsCourses.put("COM102","Intrapersonal Communication I");
		communicationsCourses.put("COM201","Interpersonal Communication II");
		communicationsCourses.put("COM202","Intrapersonal Communication II");
		
		businessCourses.put("FIN101","Intro to Finance");
		businessCourses.put("BUS102","Intro to Business Administration");
		businessCourses.put("ECON101","Economics 101");
		businessCourses.put("FIN201","Intermediate Finance");
		businessCourses.put("BUS201","Intermediate Business Administration");
		businessCourses.put("ECON201","Macroeconomics");
		businessCourses.put("FIN301","International Finance");
		businessCourses.put("BUS301","Advanced Business Administration");
		businessCourses.put("ECON301","Microeconomics");
		businessCourses.put("ECON401","Principals of Financial Markets");
		
		courseMap.put("HIST", historyCourses);
		courseMap.put("LANG", languaguCourses);
		courseMap.put("SCI", scienceCourses);
		courseMap.put("MATH", mathCourses);
		courseMap.put("ENG", engineeringCourses);
		courseMap.put("CSC", computerScienceCourses);
		courseMap.put("ART", artCourses);
		courseMap.put("MUSC", musicCourses);
		courseMap.put("COMM", communicationsCourses);
		courseMap.put("BUS", businessCourses);
	}
	public static Long addRecord(CourseORM updatedRecord) throws Exception
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

	public static boolean updateRecord(CourseORM intialRecord) throws Exception
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
	
	public static List<CourseORM> getCoursesForDepartment(Long departmentId, String operId)
	{
		 List<CourseORM> courses = new ArrayList<CourseORM>();
		 SessionFactory sessionFactory = null;
         Session session = null;
         Criteria criteria = null;
         Transaction tx = null;
         List results = null;
         try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(CourseORM.class);
	          criteria.add(Restrictions.eq("departmentId", departmentId.longValue()));
	          results = criteria.list();
	          tx.commit();
	      }
	      catch (HibernateException e) {
	             if (tx!=null) tx.rollback();
	             e.printStackTrace();
	      }
	          finally {
	                session.close();
	      }
         for(int i = 0 ; i < results.size() ; i++)
         {
        	 courses.add((CourseORM)results.get(i));
         }
         return courses;
	}
	
	public static List<CourseORM> getCoursesForAllDepartments()
	{
		 List<CourseORM> courses = new ArrayList<CourseORM>();
		 SessionFactory sessionFactory = null;
         Session session = null;
         Criteria criteria = null;
         Transaction tx = null;
         List results = null;
         try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(CourseORM.class);
	          results = criteria.list();
	          tx.commit();
	      }
	      catch (HibernateException e) {
	             if (tx!=null) tx.rollback();
	             e.printStackTrace();
	      }
	          finally {
	                session.close();
	      }
         for(int i = 0 ; i < results.size() ; i++)
         {
        	 courses.add((CourseORM)results.get(i));
         }
         return courses;
	}
	
	public static CourseORM getCourseByPk(Long courseId)
	{
		 CourseORM course = null;
		 SessionFactory sessionFactory = null;
         Session session = null;
         Criteria criteria = null;
         Transaction tx = null;
         List results = null;
         try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(CourseORM.class);
	          criteria.add(Restrictions.eq("courseId", courseId.longValue()));
	          results = criteria.list();
	          tx.commit();
	      }
	      catch (HibernateException e) {
	             if (tx!=null) tx.rollback();
	             e.printStackTrace();
	      }
	          finally {
	                session.close();
	      }
          course = (CourseORM)results.get(0);
          return course;
	}
	
	public static void generateCourses(List<DepartmentORM> departments, List<SemesterORM> semesters, String operId)
	{
		SemesterORM currentSemester = SemesterORMfactory.getCurrentSemester();
		initializeMaps();
		Date today = new Date();
		for(DepartmentORM department : departments)
		{
			Map coursesMap = (HashMap)courseMap.get(department.getDepartmentCode());
			Set courses = coursesMap.keySet();
			for(Object key : courses)
			{
				CourseORM courseObject = new CourseORM();
				courseObject.setDepartmentId(department.getId());
				courseObject.setSemesterId(currentSemester.getId().longValue());
				courseObject.setCourseCode((String)key);
				courseObject.setCourseName((String)coursesMap.get(key));
				courseObject.setMaxEnrollment(((Integer)getCourseEnrollmentMax()).longValue());
				courseObject.setNonMajors(canCourseBeTakenByNonMajors());
				courseObject.setEvntTmeStmp(today);
				courseObject.setEvntOperId(operId);
				try {
					addRecord(courseObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String canCourseBeTakenByNonMajors()
	{
		String result = "N";
		int num = generateRandomNum(1,10);
		if(num>7)	// 20% chance to be Y
		{
			result = "Y";
		}
		return result;
	}
	
	public static int getCourseEnrollmentMax()
	{
		return generateRandomNum(10,91);
	}
	
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
}
