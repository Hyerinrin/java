package operator;

public class OperatorEx03 {

	public static void main(String[] args) {
//		int num = 10;
//		num++; // 증감 연산자 (++ , --)
//		System.out.println(num);
		
		int a=2, b=3, result;
		++a;
		--b;
		result = a+ a*b;
		//result =++a + --b*a--; // 이렇게 하지 말 것
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);

	}

}
