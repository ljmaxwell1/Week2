package tests;
import model.StuBusinessLogic;
import model.Student;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Larry Maxwell - ljmaxwell1
 * CIS175 - Spring 2022
 * Jan 22, 2022
 */
public class TestStudentLogic {
	StuBusinessLogic stuBL = new StuBusinessLogic();
	Student student = new Student("Larry", 12, 14, 1970, 12);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testCalculateStudentAge() {
	int age = stuBL.calculateStudentAge(student);
	assertEquals(51.0, age, 51.0);
	}
	
	@Test
	public void testcalculateGraduationYear() {
	int year = stuBL.calculateGraduationYear(student);
	assertEquals(1988, year, 1988.0);
	}
	
	@Test
	public void testisGraduated() {
		stuBL.isGraduated(student);
		assertTrue(stuBL.isGraduated(student));
	}
	
	
}
