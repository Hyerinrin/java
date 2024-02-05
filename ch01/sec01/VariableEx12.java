package ch01.sec01;

public class VariableEx12 {

	public static void main(String[] args) {
			
		int value = 457762;
		byte bValue = (byte)value;
		System.out.println(bValue);
		
		double dValue = 45.36;
		int num=(int)dValue;
		System.out.println(num);
		
		byte x =50;
		byte y =10;
		int result = x+y; //숫자 기억장치 디폴트는 int라 x+y의 값이 int로 저장되어 옴
		System.out.println(result);
		

		/***<if문 형식>
		 * if(조건) {
		 * 		명령문;
		 * 		명령문;
		 * 
		 * }
		 * else {
		 * 	명령문;
		 * }
		 * 
		 * 
		 *** String은 객체
		 * */
	}

}
