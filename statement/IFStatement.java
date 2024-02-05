package statement;

import java.util.*;
public class IFStatement {

	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		//조건식이 참일 때 수행할 명령문 나열
		 * }
		 * 
		 * 
		 * */
		System.out.print("점수를 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>=80) {
			System.out.println("합격을 축하드립니다.");
		}
		System.out.println("수고하셨습니다");
	}

}
