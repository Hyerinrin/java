package objectClass;

public class ClassAEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		ClassA  clA= new ClassA(); 
		clA.memberA1=50;
		clA.methodA1();
		ClassA.ClassB b = clA.new ClassB(); //외부 class 객체 생성 후 내부 ClassB의 인스턴스 객체가 생성
	}

}
