package yuan;

import java.util.Calendar;

public class byte_short_int_long {
	
	public static void main(String args[]) {
		
		byte b = 127;
		System.out.println(b);
		
		short s = 32767;
		System.out.println(s);
		
		long l = 1000000;
		System.out.println(l);
		
		int age_current = 24; 
		int age_retired = 65;
		
		Calendar calendar = Calendar.getInstance();
		int year_current = calendar.get(Calendar.YEAR);
		
		int year_retired = year_current + (age_retired - age_current);
		
		System.out.println("I'll retire in " + year_retired);
	}

}
