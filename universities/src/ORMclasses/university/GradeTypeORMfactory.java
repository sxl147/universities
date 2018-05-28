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

public class GradeTypeORMfactory 
{
	public static ArrayList<GradeTypeORM> intializeGradeTypes(String operId)
	{	
		ArrayList<GradeTypeORM> gradeTypes = new ArrayList<GradeTypeORM>();
		try {
			Date today = new Date();
			GradeTypeORM test =  new GradeTypeORM();
			test.setGradeTypeCode("TST");
			test.setGradeTypeDesc("tests");
			test.setEvntTmeStmp(today);
			test.setEvntOperId(operId);
			test.setId(GradeTypeORMfactory.addRecord(test));
			gradeTypes.add(test);
			GradeTypeORM homework =  new GradeTypeORM();
			homework.setGradeTypeCode("HWK");
			homework.setGradeTypeDesc("homework");
			homework.setEvntTmeStmp(today);
			homework.setEvntOperId(operId);
			homework.setId(GradeTypeORMfactory.addRecord(homework));
			gradeTypes.add(homework);
			GradeTypeORM labs =  new GradeTypeORM();
			labs.setGradeTypeCode("LAB");
			labs.setGradeTypeDesc("labs");
			labs.setEvntTmeStmp(today);
			labs.setEvntOperId(operId);
			labs.setId(GradeTypeORMfactory.addRecord(labs));
			gradeTypes.add(labs);
			GradeTypeORM papers =  new GradeTypeORM();
			papers.setGradeTypeCode("PAP");
			papers.setGradeTypeDesc("papers");
			papers.setEvntTmeStmp(today);
			papers.setEvntOperId(operId);
			papers.setId(GradeTypeORMfactory.addRecord(papers));
			gradeTypes.add(papers);
			GradeTypeORM finals =  new GradeTypeORM();
			finals.setGradeTypeCode("FIN");
			finals.setGradeTypeDesc("Final Exam");
			finals.setEvntTmeStmp(today);
			finals.setEvntOperId(operId);
			finals.setId(GradeTypeORMfactory.addRecord(finals));
			gradeTypes.add(finals);
			GradeTypeORM extraCredit =  new GradeTypeORM();
			extraCredit.setGradeTypeCode("EXT");
			extraCredit.setGradeTypeDesc("extra credit");
			extraCredit.setEvntTmeStmp(today);
			extraCredit.setEvntOperId(operId);
			extraCredit.setId(GradeTypeORMfactory.addRecord(extraCredit));
			gradeTypes.add(extraCredit);
			return gradeTypes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gradeTypes;
	}
	
	public static Long addRecord(GradeTypeORM updatedRecord) throws Exception
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

	public static boolean updateRecord(GradeTypeORM intialRecord) throws Exception
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
	
	public static List retrieveGradeTypeByCode(String gradeTypeCode)
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
	          criteria = session.createCriteria(GradeTypeORM.class);
	          criteria.add(Restrictions.eq("gradeTypeCode", gradeTypeCode));
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
}
