package ch01.sec01;

public class Variable08 {

	public static void main(String[] args) {
		//변수의 타입 변수이름 = 초기값;
		long score =2147483648L; //맨 마지막 "L"은 이 변수가 long 타입이라는 것을 뜻함, 버퍼가 기본 int 크기 이기에...
		System.out.println(score);
		double num2 = 5.0/2;
		System.out.println(num2);
		float num3 = 45.23f;
		System.out.println(num3);
		double num4 = 2E5; //2 * 10의 5승
		System.out.println(num4);
		float num6 = 0.123456789123456789f;
		System.out.println(num6);
		double num7 = 0.123456789123456789;
		System.out.println(num7);
		
	}

}
