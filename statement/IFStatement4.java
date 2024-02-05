package statement;

import java.util.*;
public class IFStatement4 {

	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		//조건식이 참일 때 수행할 명령문 나열
		 * }
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>> ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println(number +"는(은) 짝수");
		}else {
			System.out.println(number+ "는(은) 홀수");
		}
		
	}

}
