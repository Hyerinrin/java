package statement;

import java.util.*;
public class ForStatement7 {

	public static void main(String[] args) {
//		for(int dan=2; dan<=9; dan++) {
//			System.out.println("**  " + dan + "단  **");
//			for(int num=1; num<=9; num++) {
//				System.out.println(dan + " X " + num + " = "+ dan*num);
//			}
//			System.out.println();
//		}
		for(int i=0; i<=10; i++) {
			for(int j=0;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========");
			
		for(int i=0; i<5; i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


