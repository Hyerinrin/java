package application;

import java.awt.Toolkit;

public class WorkerThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		
	}
	
}
}