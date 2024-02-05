package application;

public class SumThreadEx01 {

	public static void main(String[] args) {
		
		SumThread sThread = new SumThread();
		sThread.start();
	
		try {
			sThread.join(); //join 메소드 : join메서드를 가진 쓰레드(여기선 sThread)가 끝나기 전까진 다른 작업은 대기
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("우리 모두 파이텅");
	
		System.out.println("총 합 : " + sThread.getSum());

	}

}
