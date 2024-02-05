package objectClass;


/*싱글톤(Singleton) -> 다 똑같은 객체*/

public class Singleton {
	
	//정적 필드 선언과 초기화
	private static Singleton sington = new Singleton() ; 
	
	//생성자
	private Singleton() {
		
	}
	
	//method
	static Singleton getInstance() {
		return sington;
	}
	
}
/*static 인스턴스 객체가 아닌 클래스 객체를 지칭할 때*
 * 
 * ex) 은행이 직접 일을 할 경우, 예금 같이 사용자와 하는 게 아닌
 * /
 */