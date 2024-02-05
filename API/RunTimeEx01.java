package API;

public class RunTimeEx01 {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		long sum = 0;
		for(int i=1; i<=100000; i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		System.out.println("100,000까지의 총합 : " + sum);
		System.out.println("100,000까지의 합을 계산하는데 걸린 시간 : " + (time2-time1));
	}

}
