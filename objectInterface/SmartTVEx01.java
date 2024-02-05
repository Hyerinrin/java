package objectInterface;

public class SmartTVEx01 {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTV();
		
		rc.turnOn();
		rc.setVolume(5);
		Searchable sa = new SmartTV();
		sa.search("http://www.naver.com");

	}

}
