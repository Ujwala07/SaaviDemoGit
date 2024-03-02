import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdd=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(sdd.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));		
	}

}
