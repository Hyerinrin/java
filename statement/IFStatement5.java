package statement;

import java.util.*;
public class IFStatement5 {

	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		//조건식이 참일 때 수행할 명령문 나열
		 * }
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.>> ");
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		System.out.println("수고");
		
	}

}
