package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Larry Maxwell - ljmaxwell1
 * CIS175 - Spring 2022
 * Jan 22, 2022
 */
public class StuBusinessLogic {
	private int gradYear;
	
	public int calculateStudentAge(Student student) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(student.getBirthYear(), student.getBirthMonth(), student.getBirthDay());
		Period p = Period.between(birthday, today);
		return p.getYears();
	}
	
	public int calculateGraduationYear(Student student) {
		gradYear = student.getBirthYear()+18;
		return gradYear;
	}
	
	public boolean isGraduated(Student student) {
		gradYear = student.getBirthYear()+18;
		boolean isAfter = LocalDate.now().isAfter(LocalDate.of(gradYear, 5,  1));
		return isAfter;
			
	}
}