package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class CourseGradingORMfactory 
{
	public static Long addRecord(CourseGradingORM updatedRecord) throws Exception
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

	public static boolean updateRecord(CourseGradingORM intialRecord) throws Exception
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
	
	public static List retrieveGradingsByCourseId(Long courseId)
    {
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
	          criteria = session.createCriteria(CourseGradingORM.class);
	          criteria.add(Restrictions.eq("courseId", courseId));
	//          criteria.add(Restrictions.lt("numAttmpts", new Integer(5)));
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
	      return results;
    }
	
	public static void createCourseGradings(ArrayList<GradeTypeORM> gradeTypes, ArrayList<CourseORM> courses, String operId)
	{
		Date today = new Date();
		ArrayList<String> humanities = new ArrayList<String>();
		humanities.add("");
		humanities.add("");
		humanities.add("");
		humanities.add("");
		humanities.add("");
		ArrayList<String> sciences = new ArrayList<String>();
		sciences.add("");
		sciences.add("");
		sciences.add("");
		sciences.add("");
		sciences.add("");
		sciences.add("");
		ArrayList<String> business = new ArrayList<String>();
		business.add("");
		business.add("");
		business.add("");
		business.add("");
		business.add("");
		business.add("");
		for(CourseORM course : courses)
		{
			DepartmentORM department = DepartmentORMfactory.getDepartmentByPk(course.getDepartmentId().longValue());
			String departmentCode = department.getDepartmentCode();
			if("HIST".equals(departmentCode)||"LANG".equals(departmentCode))
			{
				// papers, no labs
			}
			if("MATH".equals(departmentCode)||"SCI".equals(departmentCode)||"CSC".equals(departmentCode)||"ENG".equals(departmentCode))
			{
				// labs, no papers
			}
			if("BUS".equals(departmentCode)||"COMM".equals(departmentCode)||"MUSC".equals(departmentCode)||"ART".equals(departmentCode))
			{
				//  no papers, no labs
			}
		}
	}
}
