package lab;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class TimeZone {

	private static final ZoneId ZoneId = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zone("Europe/London");
		zone("America/New_York");
		
	}
	public static void zone(String id) {

	    ZoneId zone1 = ZoneId.of(id);
	    LocalTime now1 = LocalTime.now(zone1);
	    LocalDateTime date1=LocalDateTime.now(zone1);
	    LocalDate datee=LocalDate.now(zone1);
	    System.out.println("Time: "+now1);
	    System.out.println("Date: "+datee);
	    System.out.println("Date and Time: "+date1);
	    
		
		
	}

}
