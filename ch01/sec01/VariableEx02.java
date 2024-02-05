package ch01.sec01;

import java.util.Scanner;

public class VariableEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.>> ");
		int score = sc.nextInt();
		System.out.println("시험점수는 = " + score);
		if(score>=80) {
			System.out.println("합격하셨습니다.");
		}
		else {
			System.out.println("다음에 도전해주세요.");
		}

	}

}

//_ 과 $ 는 변수로 사용 가능
