package statement;

import java.util.*;
public class WhileStatement2 {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int num;
		boolean run = true;
		while(run) {
			System.out.print("로또 자동번호를 생성하려면 c를 입력, 그만하려면 q를 입력>>");
			String choice = sc.nextLine();
			if(choice.equals("c")) {
				for(int i=1; i<=6; i++) {
			    	num = (int)(Math.random()*45)+1;
					System.out.println(i + "번 째 숫자 = " + num);
			    }
				
			}else if(choice.equals("q")) {
				run = false;
			}else {
				System.out.println("입력 오류 다시 입력하세요");
			}
			
		}
	    System.out.println("**프로그램 종료**");
	}

}
