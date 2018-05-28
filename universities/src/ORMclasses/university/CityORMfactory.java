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

public class CityORMfactory 
{
	private static HashMap usStates = new HashMap();
	private static List<String> alabamaCities = new ArrayList<String>();
	private static List<String> alaskaCities = new ArrayList<String>();
	private static List<String> arizonaCities = new ArrayList<String>();
	private static List<String> arkansasCities = new ArrayList<String>();
	private static List<String> californiaCities = new ArrayList<String>();
	private static List<String> colorodoCities = new ArrayList<String>();
	private static List<String> connecticutCities = new ArrayList<String>();
	private static List<String> delawareCities = new ArrayList<String>();
	private static List<String> floridaCities = new ArrayList<String>();
	private static List<String> georgiaCities = new ArrayList<String>();
	private static List<String> hawaiiCities = new ArrayList<String>();
	private static List<String> idahoCities = new ArrayList<String>();
	private static List<String> illinoisCities = new ArrayList<String>();
	private static List<String> indianaCities = new ArrayList<String>();
	private static List<String> iowaCities = new ArrayList<String>();
	private static List<String> kansasCities = new ArrayList<String>();
	private static List<String> kentuckyCities = new ArrayList<String>();
	private static List<String> louisianaCities = new ArrayList<String>();
	private static List<String> maineCities = new ArrayList<String>();
	private static List<String> marylandCities = new ArrayList<String>();
	private static List<String> massachusettsCities = new ArrayList<String>();
	private static List<String> michiganCities = new ArrayList<String>();
	private static List<String> minnesotaCities = new ArrayList<String>();
	private static List<String> mississippiCities = new ArrayList<String>();
	private static List<String> missouriCities = new ArrayList<String>();
	private static List<String> montanaCities = new ArrayList<String>();
	private static List<String> nebraskaCities = new ArrayList<String>();
	private static List<String> nevadaCities = new ArrayList<String>();
	private static List<String> newHampshireCities = new ArrayList<String>();
	private static List<String> newJerseyCities = new ArrayList<String>();
	private static List<String> newMexicoCities = new ArrayList<String>();
	private static List<String> newYorkCities = new ArrayList<String>();
	private static List<String> northCarolinaCities = new ArrayList<String>();
	private static List<String> northDakotaCities = new ArrayList<String>();
	private static List<String> ohioCities = new ArrayList<String>();
	private static List<String> oklahomaCities = new ArrayList<String>();
	private static List<String> oregonCities = new ArrayList<String>();
	private static List<String> pennsylvaniaCities = new ArrayList<String>();
	private static List<String> rhodeIslandCities = new ArrayList<String>();
	private static List<String> southCarolinaCities = new ArrayList<String>();
	private static List<String> southDakotaCities = new ArrayList<String>();
	private static List<String> tennesseeCities = new ArrayList<String>();
	private static List<String> texasCities = new ArrayList<String>();
	private static List<String> utahCities = new ArrayList<String>();
	private static List<String> vermontCities = new ArrayList<String>();
	private static List<String> virginiaCities = new ArrayList<String>();
	private static List<String> washingtonCities = new ArrayList<String>();
	private static List<String> westVirginiaCities = new ArrayList<String>();
	private static List<String> wisconsinCities = new ArrayList<String>();
	private static List<String> wyomingCities = new ArrayList<String>();
	
	public static void intializeUScities()
	{
		alabamaCities.add("Birmingham");
		alabamaCities.add("Montgomery");
		alaskaCities.add("Nome");
		alaskaCities.add("Anchorage");
		alaskaCities.add("Juneau");
		arizonaCities.add("Pheonix");
		arizonaCities.add("Tuscon");
		arkansasCities.add("Little Rock");
		arkansasCities.add("Fayetteville");
		californiaCities.add("Los Angeles");
		californiaCities.add("San Fransisco");
		californiaCities.add("Sacramento");
		californiaCities.add("San Diego");
		californiaCities.add("Oakland");
		californiaCities.add("Riverside");
		colorodoCities.add("Denver");
		colorodoCities.add("Colorodo Springs");
		colorodoCities.add("Boulder");
		connecticutCities.add("Hartford");
		connecticutCities.add("New Haven");
		delawareCities.add("Dover");
		delawareCities.add("Newark");
		delawareCities.add("Wilmington");
		floridaCities.add("Miami");
		floridaCities.add("Orlando");
		floridaCities.add("Tampa Bay");
		floridaCities.add("Boca Raton");
		georgiaCities.add("Atlanta");
		georgiaCities.add("Savannah");
		georgiaCities.add("Augusta");
		hawaiiCities.add("Hilo");
		hawaiiCities.add("Honolulu");
		idahoCities.add("Boise");
		idahoCities.add("Idaho Falls");
		illinoisCities.add("Chicago");
		illinoisCities.add("Springfield");
		illinoisCities.add("Peoria");
		indianaCities.add("Indianapolis");
		indianaCities.add("Fort Wayne");
		indianaCities.add("Bloomington");
		iowaCities.add("Des Moines");
		iowaCities.add("Iowa City");
		kansasCities.add("Wichita");
		kansasCities.add("Kansas City");
		kentuckyCities.add("Louisville");
		kentuckyCities.add("Lexington");
		louisianaCities.add("New Orleans");
		louisianaCities.add("Baton Rouge");
		maineCities.add("Portland");
		maineCities.add("Bangor");
		marylandCities.add("Baltimore");
		marylandCities.add("Annapolis");
		marylandCities.add("Ocean City");
		marylandCities.add("Silver Spring");
		massachusettsCities.add("Boston");
		massachusettsCities.add("Worchester");
		massachusettsCities.add("Salem");
		massachusettsCities.add("Newton");
		massachusettsCities.add("Lowell");
		michiganCities.add("Detroit");
		michiganCities.add("Lansing");
		michiganCities.add("East Lansing");
		michiganCities.add("Kalamazoo");
		minnesotaCities.add("minneapolis");
		minnesotaCities.add("Saint Paul");
		minnesotaCities.add("Duluth");
		mississippiCities.add("Jackson");
		mississippiCities.add("Biloxi");
		missouriCities.add("St. Louis");
		missouriCities.add("Kansas City");
		missouriCities.add("Springfield");
		montanaCities.add("Butte");
		montanaCities.add("Missoula");
		nebraskaCities.add("Lincoln");
		nebraskaCities.add("Omaha");
		nevadaCities.add("Las Vegas");
		nevadaCities.add("Reno");
		nevadaCities.add("Caron City");
		newHampshireCities.add("Portsmouth");
		newHampshireCities.add("Concord");
		newJerseyCities.add("Newark");
		newJerseyCities.add("Jersey City");
		newJerseyCities.add("Hoboken");
		newJerseyCities.add("Trenton");
		newJerseyCities.add("Princeton");
		newMexicoCities.add("Albuquerque");
		newMexicoCities.add("Santa Fe");
		newYorkCities.add("NYC");
		newYorkCities.add("Brooklyn");
		newYorkCities.add("Albany");
		newYorkCities.add("Buffalo");
		newYorkCities.add("Queens");
		northCarolinaCities.add("Raleigh");
		northCarolinaCities.add("Charlotte");
		northCarolinaCities.add("Durham");
		northCarolinaCities.add("Greensboro");
		northCarolinaCities.add("Chapel Hill");
		northDakotaCities.add("Fargo");
		northDakotaCities.add("Bismark");
		ohioCities.add("Cleveland");
		ohioCities.add("Cincinnati");
		ohioCities.add("Columbus");
		ohioCities.add("Dayton");
		oklahomaCities.add("Oklahoma Cty");
		oklahomaCities.add("Tulsa");
		oregonCities.add("Portland");
		oregonCities.add("Eugene");
		oregonCities.add("Salem");
		pennsylvaniaCities.add("Philadelphia");
		pennsylvaniaCities.add("Pittsburg");
		pennsylvaniaCities.add("Harrisburg");
		pennsylvaniaCities.add("Lancaster");
		rhodeIslandCities.add("Providence");
		rhodeIslandCities.add("Newport");
		southCarolinaCities.add("Charleston");
		southCarolinaCities.add("Columbia");
		southDakotaCities.add("SiouxFalls");
		southDakotaCities.add("Rapid City");
		tennesseeCities.add("Nashville");
		tennesseeCities.add("Memphis");
		tennesseeCities.add("Gatlinburg");
		tennesseeCities.add("Knoxville");
		texasCities.add("Austin");
		texasCities.add("Dallas");
		texasCities.add("San Antonio");
		texasCities.add("Houston");
		texasCities.add("Fort Worth");
		utahCities.add("Salt Lake City");
		utahCities.add("Provo");
		utahCities.add("Ogden");
		vermontCities.add("Burlington");
		vermontCities.add("Montpelier");
		virginiaCities.add("Richmond");
		virginiaCities.add("Norfolk");
		virginiaCities.add("Alexandria");
		virginiaCities.add("Charlottesville");
		virginiaCities.add("Blacksburg");
		washingtonCities.add("Seattle");
		washingtonCities.add("Takoma");
		washingtonCities.add("Sokane");
		washingtonCities.add("Olympia");
		washingtonCities.add("Redmond");
		westVirginiaCities.add("Charleston");
		westVirginiaCities.add("Huntington");
		westVirginiaCities.add("Clarksburg");
		wisconsinCities.add("Madison");
		wisconsinCities.add("Green Bay");
		wisconsinCities.add("Milwaukee");
		wyomingCities.add("Casper");
		wyomingCities.add("Cheyenne");
		wyomingCities.add("Jackson");
		
		usStates.put("AL", alabamaCities);
		usStates.put("AK", alaskaCities);
		usStates.put("AZ", arizonaCities);
		usStates.put("AR", arkansasCities);
		usStates.put("CA", californiaCities);
		usStates.put("CO", colorodoCities);
		usStates.put("CT", connecticutCities);
		usStates.put("DE", delawareCities);
		usStates.put("FL", floridaCities);
		usStates.put("GA", georgiaCities);
		usStates.put("HI", hawaiiCities);
		usStates.put("ID", idahoCities);
		usStates.put("IL", illinoisCities);
		usStates.put("IN", indianaCities);
		usStates.put("IA", iowaCities);
		usStates.put("KS", kansasCities);
		usStates.put("KY", kentuckyCities);
		usStates.put("LA", louisianaCities);
		usStates.put("ME", maineCities);
		usStates.put("MD", marylandCities);
		usStates.put("MA", massachusettsCities);
		usStates.put("MI", michiganCities);
		usStates.put("MN", minnesotaCities);
		usStates.put("MS", mississippiCities);
		usStates.put("MO", missouriCities);
		usStates.put("MT", montanaCities);
		usStates.put("NE", nebraskaCities);
		usStates.put("NV", nevadaCities);
		usStates.put("NH", newHampshireCities);
		usStates.put("NJ", newJerseyCities);
		usStates.put("NM", newMexicoCities);
		usStates.put("NY", newYorkCities);
		usStates.put("NC", northCarolinaCities);
		usStates.put("ND", northDakotaCities);
		usStates.put("OH", ohioCities);
		usStates.put("OK", oklahomaCities);
		usStates.put("OR", oregonCities);
		usStates.put("PA", pennsylvaniaCities);
		usStates.put("RI", rhodeIslandCities);
		usStates.put("SC", southCarolinaCities);
		usStates.put("SD", southDakotaCities);
		usStates.put("TN", tennesseeCities);
		usStates.put("TX", texasCities);
		usStates.put("UT", utahCities);
		usStates.put("VT", vermontCities);
		usStates.put("VA", virginiaCities);
		usStates.put("WA", washingtonCities);
		usStates.put("WV", westVirginiaCities);
		usStates.put("WI", wisconsinCities);
		usStates.put("WY", wyomingCities);
	}
	public static Long addRecord(CityORM updatedRecord) throws Exception
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

	public static boolean updateRecord(CityORM intialRecord) throws Exception
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
	          criteria = session.createCriteria(CityORM.class);
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
	
	public static List<CityORM> retrieveCitiesPerStateId(Long stateId)
    {
          SessionFactory sessionFactory = null;
          Session session = null;
          Criteria criteria = null;
          Transaction tx = null;
          List results = null;
          List<CityORM> cities = new ArrayList<CityORM>();
          try
	      {
	          sessionFactory = getSessionFactory();
	          session =  sessionFactory.openSession();
	          tx = session.beginTransaction();
	          criteria = session.createCriteria(CityORM.class);
	          criteria.add(Restrictions.eq("stateId", stateId.longValue()));
	          results = criteria.list();
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
          if(results.size()>0)
          {
        	  for(int i = 0 ; i < results.size() ; i++)
        	  {
        		  cities.add((CityORM)results.get(i));
        	  }
          }
          return cities;  
    }
	
	public static String getRandomStateCode()
	{
		List states = new ArrayList<String>(usStates.keySet());
		Random rand = new Random();
		int  n = rand.nextInt(50);
		return (String)states.get(n);
	}
	public static List<CityORM> createCitiesPerState(List<StateORM> states, String operId)
	{
		List<CityORM> cities = new ArrayList<CityORM>();
		intializeUScities();
		for(StateORM state : states)
		{
			Date today = new Date();
			List<String> citiesPerState = (ArrayList<String>)usStates.get((String)state.getStateCode());
			for(String city : citiesPerState)
			{
				CityORM oneCity = new CityORM();
				oneCity.setStateId(state.getId().longValue());
				oneCity.setCityName(city);
				oneCity.setEvntTmeStmp(today);
				oneCity.setEvntOperId(operId);
				try {
					oneCity.setId(addRecord(oneCity));
					cities.add(oneCity);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return cities;
	}
}
