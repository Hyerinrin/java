package statement;

import java.util.*;
public class IFStatement2 {

	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 		//조건식이 참일 때 수행할 명령문 나열
		 * }
		 * 
		 * 
		 * */
		System.out.print("구입할 수량을 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int price=5000;
		int total = amount *price;
		String memo ="(정상가)";
		if(amount>=10) {
			
			total = (int)(total*0.8) ; // price *=0.8 <- 알아서 형변환 해줌
			memo = "(할인가)";
		}
		else {
			total= total;
		}
		System.out.println("구입 금액=> "+ total+ memo);
		
	}

}
