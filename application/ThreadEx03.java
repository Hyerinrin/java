package application;

import java.awt.Toolkit;
import java.lang.*;

public class ThreadEx03 {

	public static void main(String[] args) {
		//Muti Thread(멀티쓰레드) -> 여러 작업을 동시에 하도록 함
		//작업 ->쓰레드
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit tool = Toolkit.getDefaultToolkit();
				for(int i=1;i<=5;i++) {
					tool.beep();
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			}
		}).start();
		
	
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //1000미리초-> 1초
			}catch (Exception e){
				
			}
		}
		
	}

}
