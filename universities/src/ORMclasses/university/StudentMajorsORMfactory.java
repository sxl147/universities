package ORMclasses.university;

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

public class StudentMajorsORMfactory 
{
	public static Long addRecord(StudentMajorsORM updatedRecord) throws Exception
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

	public static boolean updateRecord(StudentMajorsORM intialRecord) throws Exception
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
	
	public static StudentMajorsORM getStudentMajorByStudentId(Long studentId, String operId)
	{
		 StudentMajorsORM studentMajor = null;
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
	          criteria = session.createCriteria(StudentMajorsORM.class);
	          criteria.add(Restrictions.eq("studentId", studentId.longValue()));
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
         studentMajor = (StudentMajorsORM)results.get(0);
		 return studentMajor;
	}
	
	public static void generateStudentMajors(List<StudentORM> students, String operId)
	{
		Date today = new Date();
		for(StudentORM student : students)
		{
			List<DepartmentORM> departments = (List<DepartmentORM>)DepartmentORMfactory.getDepartmentsForUniversity(student.getUniversityId(), operId);
			int departmentSize = departments.size();
			DepartmentORM randomDepartment = departments.get(generateRandomNum(0,departmentSize));
			List<MajorORM> majors = MajorORMfactory.getMajorsForDepartment(randomDepartment.getId(), operId);
			int majorsSize = majors.size();
			MajorORM randomMajor = majors.get(generateRandomNum(0,majorsSize));
			StudentMajorsORM studentMajor = new StudentMajorsORM();
			studentMajor.setStudentId(student.getId());
			studentMajor.setMajorId(randomMajor.getId());
			studentMajor.setEvntTmeStmp(today);
			studentMajor.setEvntOperId(operId);
			try {
				addRecord(studentMajor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static int generateRandomNum(int min, int max)
	{
		String word = "";
		Random r = new Random();
		int  n = r.nextInt(max) + min;
	    return n;
	}
}
