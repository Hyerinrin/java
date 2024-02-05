package objectClass;

public class CalculatorEx01 {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		int result = myCal.sum(145, 325);
		System.out.println("계산 결과는 : " + result );
		
		int result2 = myCal.sum(45,256,85);
		System.out.println("계산 결과 => " + result2 );
		
		int result3 = myCal.sum(45,256,178,96,85,42,71);
		System.out.println("계산 결과는 " + result3 );
		
		int[] values = {2,45,96,10,35};
		int result4 = myCal.sum(values);
		System.out.println("계산결과 = " + result4);
	}

}
