package ORMclasses.university;

import java.util.ArrayList;
import java.util.Date;
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
import utility.university.generator.UniversityDataGenerator;

public class StudentORMfactory 
{
	public static final String STUD_CODE = "STUD";
	public static final String UNIV_CODE = "UNIV";
	public static final String SUB_CODE = "Primary";
	private static List<String> firstNameList = new ArrayList<String>();
	private static List<String> lastNameList = new ArrayList<String>();
	
	public static void intializeStreetNames()
	{
		lastNameList.add("Smith");
		lastNameList.add("Jones");
		lastNameList.add("Brown");
		lastNameList.add("Johnson");
		lastNameList.add("Williams");
		lastNameList.add("Miller");
		lastNameList.add("Taylor");
		lastNameList.add("Wilson");
		lastNameList.add("Davis");
		firstNameList.add("James");
		firstNameList.add("John");
		firstNameList.add("Robert");
		firstNameList.add("Michal");
		firstNameList.add("Andy");
		firstNameList.add("David");
		firstNameList.add("Richard");
		firstNameList.add("Charles");
		firstNameList.add("Joe");
		firstNameList.add("Daniel");
		firstNameList.add("Paul");
		firstNameList.add("Mark");
		firstNameList.add("Mary");
		firstNameList.add("Patricia");
		firstNameList.add("Elizabeth");
		firstNameList.add("Barbara");
		firstNameList.add("Jennifer");
		firstNameList.add("Maria");
		firstNameList.add("Susan");
		firstNameList.add("Margaret");
		firstNameList.add("Dorothy");
		firstNameList.add("Lisa");
		firstNameList.add("Karen");
		firstNameList.add("Betty");
	}
	public static Long addRecord(StudentORM updatedRecord) throws Exception
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
	
	public static boolean updateRecord(StudentORM intialRecord) throws Exception
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
	
	public static List<StudentORM> makeStudentsForEachUniversity(List<UniversityORM> universities, String operId, int numberOfStudents)
	{
		intializeStreetNames();
		List<StudentORM> students = new ArrayList<StudentORM>();
		Date today = new Date();
		AddressTypeORM primaryStudentAddressType = AddressTypeORMfactory.retrieveAddressTypeByCodeAndSubcode(STUD_CODE, SUB_CODE);
		AddressTypeORM primaryUniversityAddressType = AddressTypeORMfactory.retrieveAddressTypeByCodeAndSubcode(UNIV_CODE, SUB_CODE);
		StateORM univesrsityState = null;
		StateORM outOfStateState = null;
		for(UniversityORM university : universities)
		{
			for(int i = 0 ; i<numberOfStudents ; i++)
			{
				StudentORM student = new StudentORM();
				student.setFirstName(generateRandomFirstName());
				student.setLastName(generateRandomLastName());
				student.setSocialSecurityNumber(UniversityDataGenerator.generateRandomSSN());
				student.setUniversityId(university.getId());
				student.setEvntTmeStmp(today);
				student.setEvntOperId(operId);
				try {
					student.setId(addRecord(student));
					students.add(student);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// then make addresses for each student here
				// 90% will be in state, 10% out of state
				AddressORM universityAddress = AddressORMfactory.retrieveAddressByTypeAndConnectorIds(primaryUniversityAddressType.getId(), university.getId());
				univesrsityState = StateORMfactory.retrieveStateById(universityAddress.getStateId());
				int randomNumber = generateRandomNum(1,10);
				if(randomNumber<10)
				{
					// in state
					List<CityORM> cities = CityORMfactory.retrieveCitiesPerStateId(univesrsityState.getId());
					int citiesList = cities.size();
					int randomCityNum = 0;
					if(citiesList>1)
					{
						randomCityNum = generateRandomNum(0,citiesList-1);
					}
					CityORM currentCity = cities.get(randomCityNum);
					AddressORMfactory.generateRandomAddressForStudent(student, primaryStudentAddressType, univesrsityState, currentCity, operId);
				}
				else
				{
					// out of state
					ArrayList<StateORM> outOfStates = StateORMfactory.retrieveOutOfStateStatesByIds(univesrsityState.getId(), univesrsityState.getCountryId());
					int statesList = outOfStates.size();
					int randomStateNum = 0;
					if(statesList>1)
					{
						randomStateNum = generateRandomNum(0,statesList-1);
					}
					StateORM currentState = outOfStates.get(randomStateNum);
					List<CityORM> cities = CityORMfactory.retrieveCitiesPerStateId(currentState.getId());
					int citiesList = cities.size();
					int randomCityNum = 0;
					if(citiesList>1)
					{
						randomCityNum = generateRandomNum(0,citiesList-1);
					}
					CityORM currentCity = cities.get(randomCityNum);
					AddressORMfactory.generateRandomAddressForStudent(student, primaryStudentAddressType, currentState, currentCity, operId);
				}
			}
		}
		return students;
	}
	
	public static String generateRandomFirstName()
	{
		String firstName = "";
		int firstList = firstNameList.size();
		int randomNameNum = 0;
		if (firstList > 1) {
			randomNameNum = generateRandomNum(0, firstList - 1);
		}
		firstName = firstNameList.get(randomNameNum);
		return firstName;
	}
	
	public static String generateRandomLastName()
	{
		String lastName = "";
		int firstList = lastNameList.size();
		int randomNameNum = 0;
		if (firstList > 1) {
			randomNameNum = generateRandomNum(0, firstList - 1);
		}
		lastName = lastNameList.get(randomNameNum);
		return lastName;
	}
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
}