package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class AddressTypeORMfactory 
{
	public static Long addRecord(AddressTypeORM updatedRecord) throws Exception
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

	public static boolean updateRecord(AddressTypeORM intialRecord) throws Exception
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
	
	public static AddressTypeORM retrieveAddressTypeByCodeAndSubcode(String code, String subcode)
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
          criteria = session.createCriteria(AddressTypeORM.class);
          criteria.add(Restrictions.eq("addressTypeCode", code));
          criteria.add(Restrictions.eq("addressTypeSubcode", subcode));
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
        if(results.size()>0)
        {
          return (AddressTypeORM)results.get(0);
        }
        return null;
    }
	
	public static void createAddressTypes(String operId)
	{
		Date today = new Date();
		AddressTypeORM record = new AddressTypeORM();
		record.setAddressTypeCode("UNIV");
		record.setAddressTypeSubcode("Primary");
		record.setAddressTypeName("Primary University address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("UNIV");
		record.setAddressTypeSubcode("Departmental");
		record.setAddressTypeName("Departmental University address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("UNIV");
		record.setAddressTypeSubcode("Secondary");
		record.setAddressTypeName("Secondary University address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("STUD");
		record.setAddressTypeSubcode("Primary");
		record.setAddressTypeName("Primary Student address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("STUD");
		record.setAddressTypeSubcode("Secondary");
		record.setAddressTypeName("Secondary Student address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("PROF");
		record.setAddressTypeSubcode("Primary");
		record.setAddressTypeName("Primary Professor address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("PROF");
		record.setAddressTypeSubcode("Secondary");
		record.setAddressTypeName("Secondary Professor address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("ADMN");
		record.setAddressTypeSubcode("Primary");
		record.setAddressTypeName("Primary Administrator address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record = new AddressTypeORM();
		record.setAddressTypeCode("ADMN");
		record.setAddressTypeSubcode("Secondary");
		record.setAddressTypeName("Secondary Administrator address type");
		record.setEvntTmeStmp(today);
		record.setEvntOperId(operId);
		try {
			addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
