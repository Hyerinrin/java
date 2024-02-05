package statement;

import java.util.*;
public class ForStatement2 {

	public static void main(String[] args) {
		System.out.println("원하는 단을 입력하세요.>> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("**"+num+"단**");
		for(int i=1;i<10;i++) {
			
			System.out.println(num+ "x"+i+"="+ num*i);
		}

	}

}
