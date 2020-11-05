package lab;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
	public static void main(String[] args) {
		duration(LocalDate.of(2012, 01, 01),LocalDate.of(2016, 07, 23));	
	}
	public static void duration(LocalDate d1,LocalDate d2) {
        Period diff = Period.between(d1,d2);
        System.out.printf("Difference is %d years, %d months and %d days old\n\n", 
                diff.getYears(), diff.getMonths(), diff.getDays());

		
	}
}
