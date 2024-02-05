package practice;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f_undo = 100;
		double c_undo = 5*(f_undo)/9;
		System.out.println("섭씨 온도 : " + Math.round(c_undo*100)/100.0);
		
		
	    int fahrenheit = 100;
	    float celcius = 5f/ 9f*(fahrenheit - 32f);
	    
	    System.out.println("Fahrenheit : " + fahrenheit);
	    System.out.println(celcius);
	    System.out.printf("Celcius : %.2f", celcius);
	
		/*================================================================*/
	
	
//		System.out.print("정수를 입력하세요.>> ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		if(num%4==0 || num%5==0) {
//			System.out.println("true1");
//		}else {
//			System.out.println("false1");
//		}
//		
//		if(num%4==0 && num%5==0) {
//			System.out.println("true2");
//		}else {
//			System.out.println("false2");
//		}
//		
//		if((num%4==0 || num%5==0)&&(num%4!=0 && num%5!=0)) {
//			System.out.println("true3");
//		}else {
//			System.out.println("false3");
//		}
	}

}

