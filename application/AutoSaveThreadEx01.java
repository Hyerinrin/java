package application;

public class AutoSaveThreadEx01 {

	public static void main(String[] args) {
		
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);//보조 쓰레드로 만듬
		autoSave.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
		int sum=0;
		for(int i=1; i<=100;i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합= " + sum);

	}//메인 쓰레드 끝

}
