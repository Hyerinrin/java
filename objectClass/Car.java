package objectClass;

public class Car {
	
	public Tire tire; //tire 클래스를 필드로
	
	public void run() {
		tire.roll();
	}
}
