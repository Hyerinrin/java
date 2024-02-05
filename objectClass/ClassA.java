package objectClass;

public class ClassA {
	int memberA1;
	
	public ClassA(){
		System.out.println("ClassA의 생성자 수행");
	}
	
	
	//내부 클래스
	class ClassB{
		
		//field
		int memberB1=20;
		
		//생성자
		public ClassB() {
			// TODO Auto-generated constructor stub
			System.out.println("ClassB의 생성자 수행");
		}
		//메소드
		void methodB1() {
			System.out.println("ClassB의 메서드 실행");
		}
	}
	
	
	//메서드
	void methodA1() {
		System.out.println("ClassA의 메서드 수행");
	}
}
