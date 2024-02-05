package application;

public class CalculableEx02 {

	public static void main(String[] args) {
		
		Calculable calcu; //선언
		
		//람다식 표현(익명 함수 표현) : 인터페이스에 추상메서드가 단 '하나'!!! 여야지만 가능
		calcu = (x,y) -> {
			System.out.println("두 수의 합 : " + (x+y));
		};
		
		calcu.calculate(10, 30);
		
		calcu = (x,y) -> {
			System.out.println("두 수의 차 : " + (x-y));
		};
		
		calcu.calculate(50, 30);

	}

}
