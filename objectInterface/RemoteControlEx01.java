package objectInterface;

public class RemoteControlEx01 {
	public static void main(String[] args) {
//		Televison lgtv = new Televison();
//		lgtv.turnOn();
//		lgtv.setVolume(5);
//		
		RemoteControl rc; //인터페이스 선언
		rc= new Televison(); // rc로 Televison 객체 사용
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	
		System.out.println();
		rc = new Audio(); //rc으로 Audio 객체 사용
		rc.turnOn();
		rc.setVolume(3);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();	
	}
}
