package operator;

public class OperatorEx9 {

	public static void main(String[] args) {
		//비트 논리 연산자
		System.out.println(45 & 25); //and
		System.out.println(45 | 25); //or
		System.out.println(45 ^ 25); //nor <- 논리 값이 다를 때만 참
		
		//비트 이동 연산자
		int num=13;
		System.out.println(num << 2);
		int num2=8;
		System.out.println(num2 >> 2);
		
	}

}
