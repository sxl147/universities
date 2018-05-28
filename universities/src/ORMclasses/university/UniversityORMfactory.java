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
import utility.university.generator.UniversityDataGenerator;

public class UniversityORMfactory 
{
	public static final String STUD_CODE = "STUD";
	public static final String UNIV_CODE = "UNIV";
	public static final String SUB_CODE = "Primary";
	
	public static Long addRecord(UniversityORM updatedRecord) throws Exception
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

	public static boolean updateRecord(UniversityORM intialRecord) throws Exception
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
	
	public static List<UniversityORM> makeTwoUniversitiesPerState(List<StateORM> states, String operId)
	{
		List<UniversityORM> universities = new ArrayList<UniversityORM>();
		Date today = new Date();
		AddressTypeORM primaryUniversityAddressType = AddressTypeORMfactory.retrieveAddressTypeByCodeAndSubcode(UNIV_CODE, SUB_CODE);
		for(StateORM state : states)
		{
			
				List<CityORM> citiesPerState = (ArrayList<CityORM>) CityORMfactory
						.retrieveCitiesPerStateId(state.getId());
				UniversityORM liberalArtsCollege = new UniversityORM();
				liberalArtsCollege
						.setUniversityCode("U" + state.getStateCode());
				liberalArtsCollege.setUniversityName("University of "
						+ state.getStateName());
				liberalArtsCollege.setEvntTmeStmp(today);
				liberalArtsCollege.setEvntOperId(operId);
				try {
					liberalArtsCollege.setId(addRecord(liberalArtsCollege));
					universities.add(liberalArtsCollege);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// make the address for each university here
				int citiesList = citiesPerState.size();
				int randomCityNum = 0;
				if (citiesList > 1) {
					randomCityNum = generateRandomNum(0, citiesList - 1);
				}
				CityORM currentCity = citiesPerState.get(randomCityNum);
				AddressORMfactory.generateRandomAddressForUniversity(
						liberalArtsCollege, primaryUniversityAddressType,
						state, currentCity, operId);
				UniversityORM technicalCollege = new UniversityORM();
				technicalCollege.setUniversityCode(state.getStateCode() + "SU");
				technicalCollege.setUniversityName(state.getStateName()
						+ " State University");
				technicalCollege.setEvntTmeStmp(today);
				technicalCollege.setEvntOperId(operId);
				try {
					technicalCollege.setId(addRecord(technicalCollege));
					universities.add(technicalCollege);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// make the address for each university here
				if (citiesList > 1) {
					randomCityNum = generateRandomNum(0, citiesList - 1);
				}
				currentCity = citiesPerState.get(randomCityNum);
				AddressORMfactory.generateRandomAddressForUniversity(
						technicalCollege, primaryUniversityAddressType, state,
						currentCity, operId);
			
		}
		return universities;
	}
	
	public static List retrieveUniversityById(Long universityId)
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
	          criteria = session.createCriteria(UniversityORM.class);
	          criteria.add(Restrictions.eq("Id", universityId.longValue()));
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
	
	public static List retrieveUniversityByCode(String universityCode)
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
	          criteria = session.createCriteria(UniversityORM.class);
	          criteria.add(Restrictions.eq("universityCode", universityCode));
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
	
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
}
