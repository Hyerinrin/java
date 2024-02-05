package statement;

public class DoWhileStatement01 {
	
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do {
			sum+=i;
			i++;
		}while(i>=100);
		System.out.println("합 : "+ sum);
	}
	/*
	 * do {
	 *  수행할 내용.. <--무조건 한 번은 수행, 처음 수행 후에 조건을 따짐
	 * } while(조건식);
	 * */
	
	
}
