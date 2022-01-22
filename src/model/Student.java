package model;

/**
 * @author Larry Maxwell - ljmaxwell1
 * CIS175 - Spring 2022
 * Jan 22, 2022
 */
public class Student {

	private String name;
	private int BirthMonth;
	private int BirthDay;
	private int BirthYear;
	private int currGrade;
	
	public Student () {
		// prevent default constructor
	}
	
	public Student(String name, int birthMonth, int birthDay, int birthYear, int currGrade) {
		super();
		this.name = name;
		BirthMonth = birthMonth;
		BirthDay = birthDay;
		BirthYear = birthYear;
		this.currGrade = currGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthMonth() {
		return BirthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		BirthMonth = birthMonth;
	}

	public int getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(int birthDay) {
		BirthDay = birthDay;
	}

	public int getBirthYear() {
		return BirthYear;
	}

	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

	public int getCurrGrade() {
		return currGrade;
	}

	public void setCurrGrade(int currGrade) {
		this.currGrade = currGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", BirthMonth=" + BirthMonth + ", BirthDay=" + BirthDay + ", BirthYear="
				+ BirthYear + ", currGrade=" + currGrade + "]";
	}



	
}
