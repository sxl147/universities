package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import utility.specific.HibernateUtil;

public class StateORMfactory 
{
	private static HashMap usStates = new HashMap();
	
	public static void intializeUSstates()
	{
		usStates.put("AL", "Alabama");
		usStates.put("AK", "Alaska");
		usStates.put("AZ", "Arizona");
		usStates.put("AR", "Arkansas");
		usStates.put("CA", "California");
		usStates.put("CO", "Colorodo");
		usStates.put("CT", "Connecticut");
		usStates.put("DE", "Delaware");
		usStates.put("FL", "Florida");
		usStates.put("GA", "Georgia");
		usStates.put("HI", "Hawaii");
		usStates.put("ID", "Idaho");
		usStates.put("IL", "Illinois");
		usStates.put("IN", "Indiana");
		usStates.put("IA", "Iowa");
		usStates.put("KS", "Kansas");
		usStates.put("KY", "Kentucky");
		usStates.put("LA", "Louisiana");
		usStates.put("ME", "Maine");
		usStates.put("MD", "Maryland");
		usStates.put("MA", "Massachusetts");
		usStates.put("MI", "Michigan");
		usStates.put("MN", "Minnesota");
		usStates.put("MS", "Mississippi");
		usStates.put("MO", "Missouri");
		usStates.put("MT", "Montana");
		usStates.put("NE", "Nebraska");
		usStates.put("NV", "Nevada");
		usStates.put("NJ", "New Jersey");
		usStates.put("NM", "New Mexico");
		usStates.put("NY", "New York");
		usStates.put("NC", "North Carolina");
		usStates.put("ND", "North Dakota");
		usStates.put("OH", "Ohio");
		usStates.put("OK", "Oklahoma");
		usStates.put("OR", "Oregon");
		usStates.put("PA", "Pennsylvania");
		usStates.put("RI", "Rhode Isand");
		usStates.put("SC", "South Carolina");
		usStates.put("SD", "South Dakota");
		usStates.put("TN", "Tennessee");
		usStates.put("TX", "Texas");
		usStates.put("UT", "Utah");
		usStates.put("VT", "Vermont");
		usStates.put("VA", "Virginia");
		usStates.put("WA", "Washington");
		usStates.put("WV", "West Virginia");
		usStates.put("WI", "Wisconsin");
		usStates.put("NH", "New Hampshire");
		usStates.put("WY", "Wyoming");
	}
	public static Long addRecord(StateORM updatedRecord) throws Exception
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

	public static boolean updateRecord(StateORM intialRecord) throws Exception
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
	
	public static List retrieveStatesByCountryId(Long countryId)
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
	          criteria = session.createCriteria(StateORM.class);
	          criteria.add(Restrictions.eq("countryId", countryId.longValue()));
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
	
	public static StateORM retrieveStateById(Long stateId)
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
	          criteria = session.createCriteria(StateORM.class);
	          criteria.add(Restrictions.eq("Id", stateId.longValue()));
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
        	  return (StateORM)results.get(0);
          }
	      return null;
    }
	
	public static ArrayList<StateORM> retrieveOutOfStateStatesByIds(Long stateId, Long countryId)
    {
          SessionFactory sessionFactory = null;
          Session session = null;
          Criteria criteria = null;
          Transaction tx = null;
          List results = null;
          List<StateORM> outOfStates = new ArrayList<StateORM>();
          try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(StateORM.class);
	          criteria.add(Restrictions.eq("countryId", countryId.longValue()));
	          criteria.add(Restrictions.ne("Id", stateId.longValue()));
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
        	  for(int i = 0 ; i < results.size() ; i++)
        	  {
        		  outOfStates.add((StateORM)results.get(i));
        	  }
          }
          return (ArrayList<StateORM>) outOfStates;
    }
	
	public static StateORM retrieveRandomUSstate()
    {
          SessionFactory sessionFactory = null;
          Session session = null;
          Criteria criteria = null;
          Transaction tx = null;
          List results = null;
          CountryORM unitedStatesObj = null;
          StateORM stateObj = null;
          try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(CountryORM.class);
	          criteria.add(Restrictions.eq("countryCode", "USA"));
	          results = criteria.list();
	          unitedStatesObj = (CountryORM)results.get(0);
	          results = null;
	          criteria = session.createCriteria(StateORM.class);
	          criteria.add(Restrictions.eq("countryId", unitedStatesObj.getId().longValue()));
	          criteria.add(Restrictions.eq("stateCode", getRandomStateCode()));
	          results = criteria.list();
	          stateObj = (StateORM)results.get(0);
	          tx.commit();
	      }
	      catch (HibernateException e) 
	      {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace();
	      }
	      finally 
	      {
	          session.close();
	      }
          return stateObj;  
    }
	
//	public static StateORM retrieveUsStateByCode(String stateCode)
//    {
//          SessionFactory sessionFactory = null;
//          Session session = null;
//          Criteria criteria = null;
//          Transaction tx = null;
//          List results = null;
//          CountryORM unitedStatesObj = null;
//          StateORM stateObj = null;
//          try
//	      {
//	          sessionFactory = getSessionFactory();
//	          session =  sessionFactory.openSession();
//	          tx = session.beginTransaction();
//	          criteria = session.createCriteria(CountryORM.class);
//	          criteria.add(Restrictions.eq("countryCode", "USA"));
//	          results = criteria.list();
//	          unitedStatesObj = (CountryORM)results.get(0);
//	          results = null;
//	          criteria = session.createCriteria(StateORM.class);
//	          criteria.add(Restrictions.eq("countryId", unitedStatesObj.getId().longValue()));
//	          criteria.add(Restrictions.eq("stateCode", stateCode));
//	          results = criteria.list();
//	          stateObj = (StateORM)results.get(0);
//	          tx.commit();
//	      }
//	      catch (HibernateException e) 
//	      {
//	          if (tx!=null) tx.rollback();
//	          e.printStackTrace();
//	      }
//	      finally 
//	      {
//	          session.close();
//	      }
//          return stateObj;  
//    }
	
	public static String getRandomStateCode()
	{
		List states = new ArrayList<String>(usStates.keySet());
		Random rand = new Random();
		int  n = rand.nextInt(50);
		return (String)states.get(n);
	}
	public static List<StateORM> createStatesPerCountry(CountryORM country, String operId)
	{
		List<StateORM> states = new ArrayList<StateORM>();
		if("USA".equals(country.getCountryCode()))
		{
			Date today = new Date();
			intializeUSstates();
			Set stateCodes = usStates.keySet();
			for(Object key : stateCodes)
			{
				String stateCode = (String)key;
				String stateName = (String)usStates.get(stateCode);
				StateORM state = new StateORM();
				state.setCountryId(country.getId());
				state.setStateCode(stateCode);
				state.setStateName(stateName);
				state.setEvntTmeStmp(today);
				state.setEvntOperId(operId);
				try {
					state.setId(addRecord(state));
					states.add(state);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return states;
	}
}

