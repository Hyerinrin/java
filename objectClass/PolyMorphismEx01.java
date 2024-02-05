package objectClass;


//다형성
public class PolyMorphismEx01 {

	public static void main(String[] args) {
		
		
		//메서드의 다형성, 메서드는 new로 생성된 객체의 것이 실행
		Account chulsu = new CreditLineAccount();
		try {
			chulsu.withdraw(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//필드 다형성
		Car myCar = new Car();
		myCar.tire = new Tire();
		myCar.run();
		
		//생성된 HankookTire 객체를 myCar 인스턴스 객체에 장착, 
		myCar.tire = new HankookTier();
		myCar.run();
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}