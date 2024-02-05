package application;

public class AutoSaveThread extends Thread{

	//메서드1
	public void save() {
		System.out.println("작업 내용이 저장됨");
		
	}
	//메서드2

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
			save();
		}
	}
	
}
