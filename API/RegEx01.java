package API;

import java.util.Scanner;
import java.util.regex.Pattern;

//정규화
public class RegEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 >> ");
		String phoneNumber = sc.next();
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		boolean result = Pattern.matches(regExp, phoneNumber);
		if(result) {
			System.out.println("올바른 전화번호");
		}else {
			System.out.println("전화전호 형식이 아닙니다.");
		}
		
		System.out.print("이메일 입력>>");
		String email = sc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("올바른 이메일");
		}else {
			System.out.println("이메일 주소 형식이 아닙니다.");
		}
		
		//System.out.println("전화번호 : " + phoneNumber);
	}

}
