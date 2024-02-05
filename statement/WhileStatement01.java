package statement;

public class WhileStatement01 {

	public static void main(String[] args) {
		int sum =0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++; // while은 증감식을 따로 만들어야 함
		}
		System.out.println(sum);
	}

}
