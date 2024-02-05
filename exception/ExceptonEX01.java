package exception;

public class ExceptonEX01 {

	public static void main(String[] args) {
		int num =10;
		int num2=4;
		try {
			int result = num/num2;
			System.out.println("연산결과=" + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}
		

	}

}
