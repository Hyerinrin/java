package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH : mm : ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 D번째 날입니다.");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이번 주는 MM월의 W번째 주입니다.");
		System.out.println(sdf.format(now));
		
	}

}
