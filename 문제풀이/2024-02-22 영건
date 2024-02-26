package javaQuiz;

//
//- main 클래스에서 Employee, James, Tomas 클래스의 함수를 선언해서 출력
//ex) name 의 직책은 job 사원번호는 empNo
//ex) job 의 월급은 pay 입니다
//
//
//================================= 출력문 ==================================
//----직원 정보 ---
//
//손흥민의 직책은 과장 사원번호는 120입니다.
//프로젝트를 진행 하고있습니다.
//Java 개발을 하고 있습니다.
//Python 개발을 하고 있습니다.
//내년에 승진입니다.
//과장님의 월급은 3000000원 입니다.
//
//김민재의 직책은 대리 사원번호는 127입니다.
//프로젝트를 진행 하고있습니다.
//React 개발을 하고 있습니다.
//Java script 개발을 하고 있습니다.
//내년에 승진하지 못합니다.
//대리님의 월급은 2000000원 입니다.
//==========================================================================


//추상 부모 클래스
abstract class Employee {

	//매개변수
	public String name;
	public String job;
	public int empNo;
	public int pay;
	
	
	//생성자
	public Employee(String name, String job, int empNo, int pay) {
		this.name = name;
		this.job = job;
		this.empNo = empNo;
		this.pay = pay;
	}

	//일반 메서드
	public void info() {System.out.println(this.name +"의 직책은 " + this.job + " 사원번호는 " + this.empNo + "입니다." );};
	public void work() {System.out.println("프로젝트를 진행하고 있습니다.");};
	
	
	//추상 메서드
	public abstract void promotion();
	public abstract void develope();
	public abstract void pay();
	
	//출력하는 메서드
	public void information() {
		
		info();
		work();
		promotion();
		develope();
		pay();
		System.out.println();
	}
}


//Tomas 클래스
class Tomas extends Employee {

	//상속 받은 변수
	public Tomas(String name, String job, int empNo, int pay) {
		super(name, job, empNo, pay);
	}

	// 자식 클래스에서 오버라이드 진행
	@Override
	public void promotion() {

		System.out.println("내년에 승진입니다.");
	}

	@Override
	public void develope() {
		
		System.out.println("Java 개발을 하고 있습니다.");
		System.out.println("Python 개발을 하고 있습니다.");
		
	}

	@Override
	public void pay() {
		
		System.out.println(this.job + "의 월급은 " + this.pay + "원 입니다.");
	}

}

//James 클래스
class James extends Employee {

	//상속 받은 변수
	public James(String name, String job, int empNo, int pay) {
		super(name, job, empNo, pay);
	}

	// 자식 클래스에서 오버라이드 진행
	@Override
	public void promotion() {
		System.out.println("내년에 승진하지 못합니다.");
	}

	@Override
	public void develope() {
		System.out.println("React 개발을 하고 있습니다.");
		System.out.println("Javascript 개발을 하고 있습니다.");
	}

	@Override
	public void pay() {
		System.out.println(this.job + "의 월급은 " + this.pay + "원 입니다.");
	}

}

public class Main {
	
	public static void main(String[] args) {

		System.out.println("----직원 정보 ---");
		System.out.println();
		
		// Employee, James, Tomas 클래스 함수 출력문 작성
		Employee tomas = new Tomas("Tomas", "과장", 120, 3000000);
		tomas.information();
		Employee james = new James("James", "대리", 127, 2000000);
		james.information();
		
	}
}
