package lab1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		
	}
	public static void calculateAge(LocalDate pd) {
		LocalDate now = LocalDate.now();
        Period diff = Period.between(pd, now);
        System.out.printf("Age is: %d ",+diff.getYears());
	}
	public static String getFullName(String firstName, String lastName) {
		String fullname=firstName+" "+lastName;
		return fullname;
	}
}
