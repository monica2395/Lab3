package lab;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class WarrantyExpire {

	public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2018-11-13"); 
        LocalDate d1=expireyear(date,3);
        LocalDate d2=expiremonth(d1,4);
        System.out.println("Expire Date: "+d2);

	}
	public static LocalDate expireyear(LocalDate pd,long pdd) {
		   LocalDate yadd = pd.plusYears(pdd); 
		   return yadd; 
	}
	public static LocalDate expiremonth(LocalDate pd,long m) {
		  LocalDate yadd = pd.plusMonths(m); 
		   return yadd;
		
	}

}
