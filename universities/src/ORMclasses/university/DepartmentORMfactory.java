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

public class DepartmentORMfactory 
{
	private static Map departmentList = new HashMap();
	
	private static void initializeList()
	{
		departmentList.put("HIST","Department of History");
		departmentList.put("LANG","Department of Languages");
		departmentList.put("SCI","Department of Science");
		departmentList.put("MATH","Department of Mathematics");
		departmentList.put("ENG","Department of Engineering");
		departmentList.put("CSC","Department of Computer Science");
		departmentList.put("ART","Department of Art");
		departmentList.put("MUSC","Department of Music");
		departmentList.put("COMM","Department of Communications");
		departmentList.put("BUS","Department of Business");
	}
	
	public static Long addRecord(DepartmentORM updatedRecord) throws Exception
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

	public static boolean updateRecord(DepartmentORM intialRecord) throws Exception
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
	
	public static List getDepartmentsForUniversity(Long universityId, String operId)
	{
		 List<DepartmentORM> departments = null;
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
	          criteria = session.createCriteria(DepartmentORM.class);
	          criteria.add(Restrictions.eq("universityId", universityId.longValue()));
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
	
	public static DepartmentORM getDepartmentByPk(long departmentId)
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
	          criteria = session.createCriteria(DepartmentORM.class);
	          criteria.add(Restrictions.eq("departmentId", departmentId));
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
		  return (DepartmentORM)results.get(0);
	}
	
	public static List<DepartmentORM> getNonMajorDepartmentsForUniversity(Long universityId, Long departmentId, String operId)
	{
		 List<DepartmentORM> departments = new ArrayList<DepartmentORM>();
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
	          criteria = session.createCriteria(DepartmentORM.class);
	          criteria.add(Restrictions.eq("universityId", universityId.longValue()));
	          criteria.add(Restrictions.ne("Id", departmentId.longValue()));
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
        	 departments.add((DepartmentORM)results.get(i));
         }
		  return departments;
	}
	
	public static List<DepartmentORM> generateDepartments(List<UniversityORM> universities, String operId)
	{
		initializeList();
		List<DepartmentORM> departments = new ArrayList<DepartmentORM>();
		Date today = new Date();
		for(UniversityORM university : universities)
		{
			Set departmentKeys = departmentList.keySet();
			for(Object key : departmentKeys)
			{
				DepartmentORM departmentObject = new DepartmentORM();
				departmentObject.setUniversityId(university.getId());
				departmentObject.setDepartmentCode((String)key);
				departmentObject.setDepartmentName((String)departmentList.get(key));
				departmentObject.setEvntTmeStmp(today);
				departmentObject.setEvntOperId(operId);
				try {
					departmentObject.setId(addRecord(departmentObject));
					departments.add(departmentObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return departments;
	}
}
