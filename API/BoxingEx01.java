package API;

public class BoxingEx01 {

	public static void main(String[] args) {
		int num1 = 10; //일반 type 변수
		System.out.println(num1);
		//박싱
		Integer num2=20; //객체 type 변수로 주소값을 따라가 값 20을 찾음
		System.out.println(num2.intValue());
		//언박싱
		int value = num2;
		int num3 = 50;
		int num4=50;
		System.out.println(num3==num4);
		Integer num5 = 50;
		Integer num6 = 50;
		System.out.println(num5.equals(num6));
	}

}
