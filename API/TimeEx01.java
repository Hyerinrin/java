package API;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeEx01 {

	public static void main(String[] args) {
	
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		Calendar now = Calendar.getInstance(tz);
		//System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		String ap;
		if(ampm == Calendar.AM) {
			ap="오전";
		} else {
			ap = "오후";
		}
		System.out.printf("현재 뉴욕 날짜는 %d년 %d월 %d일 ", year, month, day); 
		System.out.printf("현재 뉴욕 시간 %s %d년 %d월 %d일", ap, hour, min, sec);
	}

}
