package main;

import java.util.List;

import ORMclasses.university.CityORM;
import ORMclasses.university.CountryORM;
import ORMclasses.university.DepartmentORM;
import ORMclasses.university.SemesterORM;
import ORMclasses.university.StateORM;
import ORMclasses.university.StudentORM;
import ORMclasses.university.UniversityORM;
import utility.university.generator.UniversityDataGenerator;

public class UniversityMain {

	public static final String OPER_ID = "test";
	public static final String STUD_CODE = "STUD";
	public static final String UNIV_CODE = "UNIV";
	public static final String SUB_CODE = "Primary";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AddressORMfactory.intializeStreetNames();
		/* main setup */
		CountryORM country = UniversityDataGenerator.retrieveCountryByCode("USA");
		
		List<StateORM> states = UniversityDataGenerator.generateStates(country,OPER_ID);
		List<CityORM> cities = UniversityDataGenerator.generateCities(states,OPER_ID);
		UniversityDataGenerator.generateAddressTypeIds(OPER_ID);
		List<UniversityORM> universities = UniversityDataGenerator.generateStateUniversities(states, OPER_ID);
		List<SemesterORM> semesters = UniversityDataGenerator.generateSemesters(OPER_ID);
		List<DepartmentORM> departments = UniversityDataGenerator.generateDepartments(universities, OPER_ID);
		UniversityDataGenerator.generateMajors(departments, OPER_ID);
		UniversityDataGenerator.generateCourses(departments, semesters, OPER_ID);
		// only making 1 student for each of the 100 universities
		List<StudentORM> students = UniversityDataGenerator.generateStudents(universities, OPER_ID, 1);
		UniversityDataGenerator.generateStudentMajors(students, OPER_ID);
		UniversityDataGenerator.generateStudentCourses(students, OPER_ID);
		
		/* old - we now do this as we make each student
//		AddressTypeORM primaryStudentAddressType = UniversityDataGenerator.retrieveStudentPrimaryAddressType(STUD_CODE, SUB_CODE);
//		UniversityDataGenerator.generateAddressesForStudents(students, primaryStudentAddressType, OPER_ID);
		*/
		
		/*
		 * make some more students for a couple of universities, just so we have more than one student to work with in our Hive queries
		*/ 
		List<UniversityORM> carolina = UniversityDataGenerator.getUniversityByCode("UNC");
		List<StudentORM> carolinaStudents = UniversityDataGenerator.generateStudents(carolina, OPER_ID, 10);
		UniversityDataGenerator.generateStudentMajors(carolinaStudents, OPER_ID);
		UniversityDataGenerator.generateStudentCourses(carolinaStudents, OPER_ID);
		List<UniversityORM> ncstate = UniversityDataGenerator.getUniversityByCode("NCSU");
		List<StudentORM> ncstateStudents = UniversityDataGenerator.generateStudents(ncstate, OPER_ID, 10);
		UniversityDataGenerator.generateStudentMajors(ncstateStudents, OPER_ID);
		UniversityDataGenerator.generateStudentCourses(ncstateStudents, OPER_ID);
		
		/*
		 * initially make grade_types and course_grading records - not finished
		 */
	//	ArrayList<GradeTypeORM> gradeTypes = UniversityDataGenerator.initializeGradeTypes(OPER_ID);
		System.out.println("here!");
	}

}
