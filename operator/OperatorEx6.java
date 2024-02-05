package operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		int result;
		try {
			result = num1/num2;
			System.out.println("결과= " + result);
		}catch (Exception e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
		
		
		
		/*
		int pencils =534;
		int student=30;

		//학생 한명이 가지는 연필 수
		
		System.out.println("학생 한 명이 가지는 연필 수=> "+ pencils/student);
		//남은 연필수
		System.out.println("남은 연필 수=> "+ pencils%student);
		*/
		
		
	}

}
