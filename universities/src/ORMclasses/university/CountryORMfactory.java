package ORMclasses.university;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class CountryORMfactory 
{
	public static Long addRecord(CountryORM updatedRecord) throws Exception
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

	public static boolean updateRecord(CountryORM intialRecord) throws Exception
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
	
	public static List retrieveCountryByCode(String countryCode)
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
          criteria = session.createCriteria(CountryORM.class);
          criteria.add(Restrictions.eq("countryCode", "USA"));
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
	public static CountryORM createCountry(String countryCode, String countryName, String admin)
	{
		CountryORM country = new CountryORM();
		country.setCountryCode(countryCode);
		country.setCountryName(countryName);
		Date today = new Date();
		country.setEvntTmeStmp(today);
		country.setEvntOperId(admin);
		try {
			country.setId(addRecord(country));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return country;
	}
}
