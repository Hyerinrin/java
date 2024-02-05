package practice;

import java.util.*;
public class Exam04 {
	public static void main(String[] args) {
		
		System.out.print("나이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >=19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		
		//====================================
		
		int rank =1;
		if(rank==1) {
			System.out.println("아주 잘했습니다.");
		}else if(rank==2 || rank ==3) {
			System.out.println("잘했습니다");
		}else if(rank==4||rank==5||rank==6) {
			System.out.println("보통입니다");
		}else {
			System.out.println("노력해야겠습니다.");
		}
	}
}
