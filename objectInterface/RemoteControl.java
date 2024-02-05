package objectInterface;

//인터페이스는 상수와 추상 메서드,디폴트 메서드, 정적 메서드를 가질 수 있음
public interface RemoteControl {

	//상수 필드
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//추상 메소드 -> 본체가 없는 메소드(내용이 없음)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메서드
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
			
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지 교환");
	}
}
