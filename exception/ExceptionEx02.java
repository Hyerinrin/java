package exception;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"100","200","ko"};
		int sum=0;
		try {
			for(int i=0; i<=str.length;i++) {
				int value = Integer.parseInt(str[i]);
				sum += value;
			}
			System.out.println("총 합 : " + sum);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과");
		}catch(NumberFormatException e) {
			System.out.println("문자 데이터는 숫자로 변환할 수 없음");
		}catch(Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}finally {
			System.out.println("무조건 실행");
		}
		
	}

}
