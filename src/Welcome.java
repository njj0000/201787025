	import java.util.Calendar;
import java.util.Date;
public class Welcome {
	public static void main(String[] args) {
//		Date date = new Date();
//		int currentHour= date.getHours();
		Calendar cal = Calendar.getInstance();
		int currentHour=cal.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("���� �ð���"+ currentHour);
		if(currentHour<11) {
			System.out.println("Good Morning");
		}
		else if(currentHour<13) {
			System.out.println("Good Afternoon");
			
		}
		else if(currentHour<20) {
			System.out.println("Good Evening");
			
		}
		else {
			System.out.println("Good ninght");
			
		}
	}

}
