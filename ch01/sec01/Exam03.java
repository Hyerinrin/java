package ch01.sec01;

public class Exam03 {

	public static void main(String[] args) {
		
//		int num = 40000;
//		System.out.println(num);
		
		for(int i=1; i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("#");
		}
		System.out.println("---------");
		
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("^");
		}
		System.out.println("---------");
		for(int i=1;i<=10;i+=2) {
			for(int j=9;j>i;j-=2) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("#");
	}
}
}
