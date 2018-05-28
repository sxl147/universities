package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class MajorORMfactory 
{
	private static Map historyMajors = new HashMap();
	private static Map languaguMajors = new HashMap();
	private static Map scienceMajors = new HashMap();
	private static Map mathMajors = new HashMap();
	private static Map engineeringMajors = new HashMap();
	private static Map computerScienceMajors = new HashMap();
	private static Map artMajors = new HashMap();
	private static Map musicMajors = new HashMap();
	private static Map communicationsMajors = new HashMap();
	private static Map businessMajors = new HashMap();
	private static Map majorMap = new HashMap();
	
	private static void initializeList()
	{
		historyMajors.put("AMER","American History");
		historyMajors.put("WORL","World History");
		historyMajors.put("ECHST","History of Econimics");
		historyMajors.put("POLHST","Political History");
		
		languaguMajors.put("ENGL","English");
		languaguMajors.put("SPAN","Spanish");
		languaguMajors.put("FRNCH","French");
		languaguMajors.put("CHIN","Chinese");
		
		scienceMajors.put("PHYS","Physics");
		scienceMajors.put("CHEM","Chemistry");
		scienceMajors.put("BIOL","Biology");
		scienceMajors.put("METER","Metereology");
		scienceMajors.put("GEOL","Geology");
		scienceMajors.put("ANTH","Anthropology");
		
		mathMajors.put("APLM","Applied Mathematics");
		mathMajors.put("STAT","Statistical Methods");
		
		engineeringMajors.put("ELE","Electrical Engineering");
		engineeringMajors.put("MECH","Mechanical Engineering");
		engineeringMajors.put("CHENG","Chemical Engineering");
		engineeringMajors.put("CIVL","Civil Engineering");
		engineeringMajors.put("BIOENG","Biological Engineering");
		engineeringMajors.put("ENVE","Environmental Engineering");
		engineeringMajors.put("MATR","Materials Engineering");
		
		computerScienceMajors.put("CSVD","Video Game Programming");
		computerScienceMajors.put("CSUI","Web Development");
		computerScienceMajors.put("CSIS","Information Security");
		
		artMajors.put("SCUL","Sculpture & Painting");
		artMajors.put("ARTHST","Art History");
		artMajors.put("MEDI","Media Production");
		
		musicMajors.put("COND","Musical Conducting");
		musicMajors.put("MSCM","Media Musical Production");
		musicMajors.put("MSCH","Music History");
		
		communicationsMajors.put("INTR","Interpersonal Communication");
		communicationsMajors.put("INTA","Intrapersonal Communication");
		
		businessMajors.put("FIN","Finance");
		businessMajors.put("BUSA","Business Administration");
		businessMajors.put("ECON","Economics");
		
		majorMap.put("HIST", historyMajors);
		majorMap.put("LANG", languaguMajors);
		majorMap.put("SCI", scienceMajors);
		majorMap.put("MATH", mathMajors);
		majorMap.put("ENG", engineeringMajors);
		majorMap.put("CSC", computerScienceMajors);
		majorMap.put("ART", artMajors);
		majorMap.put("MUSC", musicMajors);
		majorMap.put("COMM", communicationsMajors);
		majorMap.put("BUS", businessMajors);
	}
	
	public static Long addRecord(MajorORM updatedRecord) throws Exception
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

	public static boolean updateRecord(MajorORM intialRecord) throws Exception
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
	
	public static List<MajorORM> getMajorsForDepartment(Long departmentId, String operId)
	{
		 List<MajorORM> majors = new ArrayList<MajorORM>();
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
	          criteria = session.createCriteria(MajorORM.class);
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
        	  majors.add((MajorORM)results.get(i));
          }
          return majors;
	}
	
	public static MajorORM getMajorById(Long majorId, String operId)
	{
		 MajorORM major = null;
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
	          criteria = session.createCriteria(MajorORM.class);
	          criteria.add(Restrictions.eq("Id", majorId.longValue()));
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
         major = (MajorORM)results.get(0);
		 return major;
	}
	
	public static void generateMajors(List<DepartmentORM> departments, String operId)
	{
		initializeList();
		Date today = new Date();
		for(DepartmentORM department : departments)
		{
			Map majorsMap = (HashMap)majorMap.get(department.getDepartmentCode());
			Set majors = majorsMap.keySet();
			for(Object key : majors)
			{
				MajorORM majorObject = new MajorORM();
				majorObject.setDepartmentId(department.getId());
				majorObject.setMajorCode((String)key);
				majorObject.setMajorDescription((String)majorsMap.get(key));
				majorObject.setMinorFlag("Y");
				majorObject.setEvntTmeStmp(today);
				majorObject.setEvntOperId(operId);
				try {
					addRecord(majorObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
