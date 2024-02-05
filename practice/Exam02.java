package practice;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print("정수를 입력하세요. : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		double pow = Math.pow(num, 2);
//		System.out.println(num + "제곱은 " + (int)pow);
		
		
		
		///////////////////////////////////////////////////
		
//		final double pie = 3.14;
//		System.out.print("원기둥 밑면 반지름 : ");
//		Scanner sc1 = new Scanner(System.in);
//		int num1 = sc1.nextInt();
//		System.out.print("원기둥 높이 : ");
//		Scanner sc2 = new Scanner(System.in);
//		int num2 = sc2.nextInt();
//		
//		double bu = pie *  Math.pow(num1, 2) * num2;
//		System.out.println("원기둥 부피 : " + bu);
		
		////////////////////////////////////////////////////////
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		Scanner num = new Scanner(System.in);
		int sec = num.nextInt();
		
		int min = sec/60;
		int hour = min/60;
		
		System.out.println(hour + "시간 " + min + "분 " + sec%min + "초");
	}

}
