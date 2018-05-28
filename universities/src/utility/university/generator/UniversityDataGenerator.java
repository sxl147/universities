package utility.university.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ORMclasses.university.AddressORMfactory;
import ORMclasses.university.AddressTypeORM;
import ORMclasses.university.AddressTypeORMfactory;
import ORMclasses.university.CityORM;
import ORMclasses.university.CityORMfactory;
import ORMclasses.university.CountryORM;
import ORMclasses.university.CountryORMfactory;
import ORMclasses.university.CourseGradingORMfactory;
import ORMclasses.university.CourseORM;
import ORMclasses.university.CourseORMfactory;
import ORMclasses.university.DepartmentORM;
import ORMclasses.university.DepartmentORMfactory;
import ORMclasses.university.GradeTypeORM;
import ORMclasses.university.GradeTypeORMfactory;
import ORMclasses.university.MajorORMfactory;
import ORMclasses.university.SemesterORM;
import ORMclasses.university.SemesterORMfactory;
import ORMclasses.university.StateORM;
import ORMclasses.university.StateORMfactory;
import ORMclasses.university.StudentCoursesORMfactory;
import ORMclasses.university.StudentMajorsORMfactory;
import ORMclasses.university.StudentORM;
import ORMclasses.university.StudentORMfactory;
import ORMclasses.university.UniversityORM;
import ORMclasses.university.UniversityORMfactory;

public class UniversityDataGenerator 
{
	public static String generateCountry()
	{
		String countryId = null;
		return countryId;
	}
	public static CountryORM retrieveCountryByCode(String countryCode)
	{
		List<CountryORM> countries = CountryORMfactory.retrieveCountryByCode(countryCode);
		return countries.get(0);
	}
	public static List<StateORM> generateStates(CountryORM country, String operId)
	{
		return StateORMfactory.createStatesPerCountry(country, operId);
	}
	
	public static List<CityORM> generateCities(List<StateORM> states, String operId)
	{
		return CityORMfactory.createCitiesPerState(states, operId);
	}
	
	public static List<UniversityORM> generateStateUniversities(List<StateORM> states, String operId)
	{
		return UniversityORMfactory.makeTwoUniversitiesPerState(states, operId);
	}
	
	public static List<UniversityORM> getUniversityByCode(String universityCode)
	{
		return UniversityORMfactory.retrieveUniversityByCode(universityCode);
	}
	
	public static List<DepartmentORM> generateDepartments(List<UniversityORM> universities, String operId)
	{
		return DepartmentORMfactory.generateDepartments(universities, operId);
	}
	
//	public static List<DepartmentORM> retrieveDepartmentsForUniversity(UniversityORM university, String operId)
//	{
//		return DepartmentORMfactory.getDepartmentsForUniversity(university, operId);
//	}
	
	public static void generateMajors(List<DepartmentORM> departments, String operId)
	{
		MajorORMfactory.generateMajors(departments, operId);
	}
	
	public static void generateCourses(List<DepartmentORM> departments, List<SemesterORM> semesters, String operId)
	{
		CourseORMfactory.generateCourses(departments, semesters, operId);
	}
	
	public static void generateStudentMajors(List<StudentORM> students, String operId)
	{
		StudentMajorsORMfactory.generateStudentMajors(students, operId);
	}
	
	public static void generateStudentCourses(List<StudentORM> students, String operId)
	{
		StudentCoursesORMfactory.generateStudentCourses(students, operId);
	}
	
	public static List<SemesterORM> generateSemesters(String operId)
	{
		return SemesterORMfactory.populateSemesters(operId);
	}
	
	public static String generateAddress(String countryId, String connectorCode)
	{
		// gonna call generateAddressMapper from here
		// which will reference addressTypeIds based on what the connectorCode is
		return null;
	}
	public static String generateAddressTypeIds(String operId)
	{
		AddressTypeORMfactory.createAddressTypes(operId);
		// these are hardcoded into the database, values are:
//		1	UNIV	Primary	Primary University address type	2017-02-09 18:29:55.00	admin
//		2	UNIV	Departmental	Departmental University address type	2017-02-09 18:29:55.00	admin
//		3	UNIV	Secondary	Secondary University address type	2017-02-09 18:29:55.00	admin
//		4	STUD	Primary	Primary Student address type	2017-02-09 18:29:55.00	admin
//		5	STUD	Secondary	Secondary Student address type	2017-02-09 18:29:55.00	admin
//		6	PROF	Primary	Primary Professor address type	2017-02-09 18:29:55.00	admin
//		7	PROF	Secondary	Secondary Professor address type	2017-02-09 18:29:55.00	admin
//		8	ADMN	Primary	Primary Administrator address type	2017-02-09 18:29:55.00	admin
//		9	ADMN	Secondary	Secondary Administrator address type	2017-02-09 18:29:55.00	admin
		return null;
	}
//	public static AddressTypeORM retrieveStudentPrimaryAddressType(String code, String subcode)
//	{
//		List<AddressTypeORM> addressTypes = AddressTypeORMfactory.retrieveAddressTypeByCodeAndSubcode(code, subcode);
//		return addressTypes.get(0);
//	}
	public static List<StudentORM> generateStudents(List<UniversityORM> universities, String operId, int numberOfStudents)
	{
		return StudentORMfactory.makeStudentsForEachUniversity(universities, operId, numberOfStudents);
	}
//	public static void generateAddressesForStudents(List<StudentORM> students, AddressTypeORM primaryStudentAddressType, String operId)
//	{
//		for(StudentORM student : students)
//		{
//			StateORM randomState = StateORMfactory.retrieveRandomUSstate();
//			AddressORMfactory.generateRandomAddressForStudent(student,primaryStudentAddressType,randomState,operId);
//		}
//	}
	
	public static ArrayList<GradeTypeORM> initializeGradeTypes(String operId)
	{
		return GradeTypeORMfactory.intializeGradeTypes(operId);
	}
	
	public static void createCourseGradings(ArrayList<GradeTypeORM> gradeTypes, ArrayList<CourseORM> courses, String operId)
	{
		CourseGradingORMfactory.createCourseGradings(gradeTypes, courses, operId);
	}
	public static String generateRandomWord(int length, String prepender)
	{
		String word = "";
		if(null!=prepender)
		{
			word = prepender;
		}
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    final int N = alphabet.length();
	    Random r = new Random();
	    for (int i = 0; i < length; i++) {
	    	word += alphabet.charAt(r.nextInt(N));
	    }
		return word;
	}
	
	public static String generateRandomSSN()
	{
		String word = "";
		final String alphabet = "0123456789";
	    final int N = alphabet.length();
	    Random r = new Random();
	    for (int i = 0; i < 9; i++) {
	    	word += alphabet.charAt(r.nextInt(N));
	    }
		return word;
	}
}
