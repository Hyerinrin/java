package ch01.sec01;

import java.util.*;
public class VariableEx05 {

	public static void main(String[] args) {
		
//		System.out.print("원하는 시간을 입력하세요.>>");
//		Scanner sc = new Scanner(System.in);
//		int hour = sc.nextInt();
//		
//		int min = hour * 60;
//		System.out.println(hour+"시간은 총 "+ min +"분입니다." );
		
		System.out.print("총 걸린 시간을 분으로 입력하십시오.>>");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		
		int hour = min / 60;
		int rate_min = min % 60;
		
		//System.out.println("총 걸린 시간은 "+ hour+ "시간 "+rate_min+"분입니다.");
		System.out.printf("총 걸린 시간은 %d시간 %d분입니다.", hour, rate_min);
	}

}
