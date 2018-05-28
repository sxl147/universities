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

public class SemesterORMfactory 
{
	private static List<String> years = new ArrayList<String>();
	private static List<String> seasons = new ArrayList<String>();
	
	public static void initializeLists()
	{
		years.add("2018");
		years.add("2017");
		years.add("2016");
		years.add("2015");
		seasons.add("spring");
		seasons.add("summer");
		seasons.add("fall");
	}
	
	public static Long addRecord(SemesterORM updatedRecord) throws Exception
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

	public static boolean updateRecord(SemesterORM intialRecord) throws Exception
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
	
	public static SemesterORM semesterSearch(String year, String season)
	{
		SemesterORM semester = null;
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
	          criteria = session.createCriteria(SemesterORM.class);
	          criteria.add(Restrictions.eq("schoolYear", year));
	          criteria.add(Restrictions.eq("season", season));
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
		if(results.size()>0)
		{
			semester = (SemesterORM)results.get(0);
		}
		return semester;
	}
	
	public static List<SemesterORM> populateSemesters(String operId)
	{
		List<SemesterORM> semesters = new ArrayList<SemesterORM>();
		Date today = new Date();
		try {
			initializeLists();
			for(String item1 : years)
			{
				for(String item2 : seasons)
				{
					SemesterORM semester = new SemesterORM();
					semester.setSchoolYear(item1);
					semester.setSeason(item2);
					semester.setEvntTmeStmp(today);
					semester.setEvntOperId(operId);
					semester.setId(addRecord(semester));
					semesters.add(semester);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return semesters;
	}
	
	public static SemesterORM getCurrentSemester()
	{
		SemesterORM currentSemester = null;
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
	          criteria = session.createCriteria(SemesterORM.class);
	          criteria.add(Restrictions.eq("schoolYear", "2017"));
	          criteria.add(Restrictions.eq("season", "spring"));
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
        currentSemester = (SemesterORM)results.get(0);
		return currentSemester;
	}
}
