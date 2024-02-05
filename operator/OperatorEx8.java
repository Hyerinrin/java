package operator;

public class OperatorEx8 {

	public static void main(String[] args) {
		
		//논리 연산자
		/*
		 * && : and
		 * || : or
		 * !: not
		 * */
		
		int num1=20;
		int num2=10;
		System.out.println(num1>=10 && num2>=10);
		char ch1='C';
		if(ch1>= 65 && ch1<=90) {
			System.out.println("대문자군요");
		}
		if(ch1>=97 && ch1<=122) {
			System.out.println("소문자군요");
		}
	}

}
