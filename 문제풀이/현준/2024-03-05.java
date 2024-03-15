=== 정보관리 프로젝트 ===
<Person 클래스>
//· Person class에는 멤버변수 및 getter and setter만 입력    
//    private String name
//    private int age
//    private String tel
//    getName setName, getAge setName, getTel setTel

public class Person {
	
	//필드
	 private String name;
	 private int age;
	 private String tel;
	 
	 //생성자
	 public Person() {
		 this.name =name;
		 this.age = age;
		 this.tel = tel;
	 }

	 //getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

----------------------------------------
<PersonMain 클래스>

import java.util.*;

public class Info {

	private ArrayList<Person> persons = new ArrayList<>(); //리스트를 전역변수로 선언해서 모든 함수에서 접근 가능하게 함
	
	public static void main(String[] args) {
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료");
		Scanner scan = new Scanner(System.in);
		
		//함수 호출
		Info info = new Info();
			while(true) {
				int menu = scan.nextInt(); //메뉴를 다시 실행되게 함. + 무한 반복 방지
				switch(menu) {
				case 1:
					info.createInfo(); 
					break;
				case 2:
					info.deleteInfo(); 
					break;
				case 3:
					info.selectInfo(); 
					break;
				default: 
				 System.out.println("종료");
				 return;
				}
		    }
		
	}//main method end


	//createInfo 한 후의 정보들을 출력
	private void selectInfo() {
		
		if(persons.isEmpty()) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		
		System.out.println("이름" + "\t" + "나이" + "\t" +"전화번호");
		for(Person person : persons) {
			System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getTel());
		}
	}
	
	//삭제 메서드
	private void deleteInfo() {
		
		System.out.println("삭제할 사람의 이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String deleteName = scan.nextLine();
		
		for(int i=0; i<persons.size(); i++) {
			if(persons.get(i).getName().equals(deleteName)) {
				persons.remove(i);
				System.out.println(deleteName + "의 정보가 삭제되었습니다.");
			}
		}
		
		
	}
	//정보 추가 메서드
	
	private Person inputPerson() {
		Person person = new Person();
		Scanner scan2 = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan2.nextLine();
		System.out.print("나이 입력 : ");
		int age = scan2.nextInt();
		
		scan2.nextLine();
		System.out.print("전화번호 입력 : ");
		String tel = scan2.nextLine();
		
		person.setName(name);
		person.setAge(age);
		person.setTel(tel);
		
		return person;
	}
	
	
	public void createInfo() {
		Person person = inputPerson();
		persons.add(person);
		System.out.println("정보가 저장되었습니다.");
	}

}

-----------------------------------------------------------
<출력>
원하시는 메뉴를 선택해 주세요.
1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료
1
이름 입력 : 김연아
나이 입력 : 29
전화번호 입력 : 010-1111-1111
정보가 저장되었습니다.
1
이름 입력 : 손흥민
나이 입력 : 32
전화번호 입력 : 010-7777-7777
정보가 저장되었습니다.               //정보 추가
3
이름	나이	전화번호
김연아	29	010-1111-1111
손흥민	32	010-7777-7777           //전체 조회
2
삭제할 사람의 이름을 입력하세요
손흥민
손흥민의 정보가 삭제되었습니다.    //삭제
3
이름	나이	전화번호
김연아	29	010-1111-1111         //삭제 후 조회
4                               // 종료
종료
