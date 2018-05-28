package utility.specific;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//import com.mysql.jdbc.Driver;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    public static void init()
    {
    	LogUtil logger = LogUtil.getMasterLogger();
        try
        {
//        	try {
//        		Driver dr = null;
//				Object o = Class.forName("com.mysql.jdbc.Driver");
//				if(o instanceof Driver)
//				{
//					dr = (Driver)o;
//				}
//				System.out.println("");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        	logger.dylanLoggerDEBUG("configuring Hibernate");
            Configuration configuration = new Configuration();
//            configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//            configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/schema1");
//            configuration.setProperty("hibernate.connection.username", "root");
//            configuration.setProperty("hibernate.connection.password", "jff88dxb77");
//            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//            configuration.setProperty("show_sql", "true");
            configuration.configure("hibernate.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            logger.dylanLoggerDEBUG("HibernateException");
            logger.dylanLoggerDEBUG(he.getMessage());
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
    	if(null==sessionFactory)
    	{
    		init();
    	}
    	return sessionFactory;
    } 
}
