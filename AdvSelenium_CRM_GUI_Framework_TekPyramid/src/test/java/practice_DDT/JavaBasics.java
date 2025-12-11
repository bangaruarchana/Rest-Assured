package practice_DDT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics {

	public static void main(String[] args) {
		Date dateObj=new Date();
		
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String actDate = sim.format(dateObj);
		System.out.println("Actual date:" +actDate);
		
		
		Calendar calender = sim.getCalendar();
		calender.add(calender.DAY_OF_MONTH,30);
	    String dateRequire = sim.format(calender.getTime());
	    System.out.println("After Date: " +dateRequire);
		
		
		
	
	
	
	}
}
