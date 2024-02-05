package statement;

import java.util.*;
public class IFStatement3 {

	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		//조건식이 참일 때 수행할 명령문 나열
		 * }
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("구입할 수량을 입력하세요.>>");
		int amount = sc.nextInt();
		System.out.print("단가를 입력하세요.>>");
		int price = sc.nextInt();
		
		if(amount>=10 && price >=1000) {
			price *= 0.8;
		}
		int salesPrice= amount*price;
		System.out.println("구입 금액은 "+salesPrice);
		
	}

}
