package application;

public class SumThread extends Thread{

	//필드
	private int sum;

	//getter
	public int getSum() {
		return sum;
	}

	//method
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			sum +=i;
		}
	}
	
	
}
