package ch01.sec01;

import java.util.Scanner;

public class VariableEx06 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int manone = money/10000; //만원
		int ocheanone = (money%10000)/5000; //오천원 <= 전체 금액에서 만 원권을 제외한 나머지를 5000원으로 나누면 5천원짜리의 개수
		int cheanone = (money%5000)/1000; //천원 <= 나머지 금액에서 오천원 권을 제외한 나머지를 1000으로 나누면 1천원짜리 개수
		int obaeone = (money%1000)/500; //오백원
		int baekone = (money%500)/100; //백원
		int shipone = (money%100)/10; //십원
		
		System.out.println("만원권=>"+ manone + " 오천원권=>"+ ocheanone+" 천원권=>"+cheanone +
				" 오백원=>"+ obaeone +" 백원=>" +baekone+ " 십원=>"+shipone);

	}

}
