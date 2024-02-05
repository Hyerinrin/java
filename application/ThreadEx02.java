package application;

public class ThreadEx02 {

	public static void main(String[] args) {
		

		Thread bThread = new WorkerThread();
		bThread.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //1000미리초-> 1초
			}catch (Exception e){
				
			}
		}
	}

}
