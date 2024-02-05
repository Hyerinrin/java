package statement;

import java.util.*;
public class IFStatement6 {

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
		
		if(score<=100 && score>=0) {
			if(score>=90) {
				System.out.println("A");
			}else if(score >=80) { 
				System.out.println("B");
			}else if(score >=70) {
				System.out.println("C");
			}else if(score >=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		else {
			System.out.println("점수입력오류");
		}
			
		
	}

}
