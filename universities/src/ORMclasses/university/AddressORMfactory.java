package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class AddressORMfactory 
{
	private static List<String> randomStreets1 = new ArrayList<String>();
	private static List<String> randomStreets2 = new ArrayList<String>();
	
	public static void intializeStreetNames()
	{
		randomStreets2.add("Lane");
		randomStreets2.add("Street");
		randomStreets2.add("Road");
		randomStreets2.add("Avenue");
		randomStreets2.add("Way");
		randomStreets2.add("Circle");
		randomStreets2.add("Trail");
		randomStreets2.add("Drive");
		randomStreets2.add("Boulevard");
		randomStreets1.add("Apple Orchard");
		randomStreets1.add("Lucky Pass");
		randomStreets1.add("State");
		randomStreets1.add("Laramy");
		randomStreets1.add("Apple Blossom");
		randomStreets1.add("Acadia");
		randomStreets1.add("Winding");
		randomStreets1.add("Snow Crest");
		randomStreets1.add("Parkwood");
		randomStreets1.add("Martin Luther King");
		randomStreets1.add("Wall");
		randomStreets1.add("Riverbend");
		randomStreets1.add("Country");
		randomStreets1.add("St. Charles");
		randomStreets1.add("St. Abbey");
		randomStreets1.add("Blatham");
	}
	
	public static Long addRecord(AddressORM updatedRecord) throws Exception
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

	public static boolean updateRecord(AddressORM intialRecord) throws Exception
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
	
	public static void generateRandomAddressForStudent(StudentORM student, AddressTypeORM addressType, StateORM state, CityORM city, String operId)
	{
		AddressORM address = new AddressORM();
		Date today = new Date();
		address.setAddressTypeId(addressType.getId().longValue());
		address.setConnectorId(student.getId().longValue());
		address.setFullStreetName(generateRandomAddress());
		address.setCityId(city.getId().longValue());
		address.setStateId(state.getId().longValue());
		address.setZipCode(generateRandomZipCode());
		address.setEvntTmeStmp(today);
		address.setEvntOperId(operId);
		try {
			addRecord(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generateRandomAddressForUniversity(UniversityORM university, AddressTypeORM addressType, StateORM state, CityORM city, String operId)
	{
		AddressORM address = new AddressORM();
		Date today = new Date();
		address.setAddressTypeId(addressType.getId().longValue());
		address.setConnectorId(university.getId().longValue());
		address.setFullStreetName(generateRandomAddress());
		address.setCityId(city.getId().longValue());
		address.setStateId(state.getId().longValue());
		address.setZipCode(generateRandomZipCode());
		address.setEvntTmeStmp(today);
		address.setEvntOperId(operId);
		try {
			addRecord(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static AddressORM retrieveAddressByTypeAndConnectorIds(Long typeId, Long connectorId)
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
	          criteria = session.createCriteria(AddressORM.class);
	          criteria.add(Restrictions.eq("addressTypeId", typeId.longValue()));
	          criteria.add(Restrictions.eq("connectorId", connectorId.longValue()));
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
        	  return (AddressORM)results.get(0);
          }
	      return null;
    }
	
	public static String generateRandomAddress()
	{
		String address = "";
		int prepender = generateRandomNum(0,99);
		int firstList = randomStreets1.size();
		int randomStreet1Num = 0;
		if (firstList > 1) {
			randomStreet1Num = generateRandomNum(0, firstList - 1);
		}
		String street1 = randomStreets1.get(randomStreet1Num);
		
		int secondList = randomStreets2.size();
		int randomStreet2Num = 0;
		if (secondList > 1) {
			randomStreet2Num = generateRandomNum(0, secondList - 1);
		}
		String street2 = randomStreets2.get(randomStreet2Num);
		
		address += prepender + " " + street1 + " " + street2;
		return address;
	}
	
	public static String generateRandomZipCode()
	{
		String word = "";
		final String alphabet = "0123456789";
	    final int N = alphabet.length();
	    Random r = new Random();
	    for (int i = 0; i < 5; i++) {
	    	word += alphabet.charAt(r.nextInt(N));
	    }
		return word;
	}
	
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
	
	public static void generateRecord()
	{
		AddressORM thing = new AddressORM();
	}
}
