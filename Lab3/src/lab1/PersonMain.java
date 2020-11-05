package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Person obj=new Person("Monica","Panigrahy",'F');
		System.out.println("Using Parametrized Constructor:");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getGender());
		obj.calculateAge(LocalDate.of(1995, 01, 23));
		System.out.println("\nFull name is: "+obj.getFullName("Monica","Panigrahy"));
	}
}