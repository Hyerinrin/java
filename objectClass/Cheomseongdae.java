package objectClass;

public class Cheomseongdae {
	private static Cheomseongdae cheom = new Cheomseongdae();
	
	//생성자
	public Cheomseongdae() {

	}
	
	//메서드
	//싱글톤 정보를 가져오는 메서드
	public static Cheomseongdae getInstance() {
		return Cheomseongdae.cheom;
	}
	//천문관측 메서드
	public static void show(String name) {
		System.out.println(name+ "(가)이 천문을 관측합니다.");
	}
}
