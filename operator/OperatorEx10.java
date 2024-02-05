package operator;

import java.util.*;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		System.out.print("상품의 가격을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		
		/*
		double discount;
		if(price>=10000) {
			discount = price*0.2;
			price = price - (int)discount;
		}else {
			discount = price*0.1;
			price = price -(int)discount;
		}
		*/
		
		int finPrice = (price>=10000) ? price - (int)(price*0.2) : price - (int)(price*0.1);
		
		System.out.println("상품의 가격은"+price+"원이고 할인율을 적용하여 "+ finPrice+"원에 구입가능합니다.");
		
		
	}

}

//삼항연산자
//int num1=70;
//int num2=30;
//int result= (num1>num2) ? num1 : num2 ;
//System.out.println("두 수 중에 큰 값은? "+ result +"입니다.");