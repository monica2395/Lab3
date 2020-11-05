package lab;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DateDuration {
	public static void main(String[] args) {
		duration(LocalDate.of(2012, 01, 01));	
	}
	public static void duration(LocalDate pd) {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pd, now);
        System.out.printf("Difference is %d years, %d months and %d days old\n\n", 
                diff.getYears(), diff.getMonths(), diff.getDays());

		
	}
}
