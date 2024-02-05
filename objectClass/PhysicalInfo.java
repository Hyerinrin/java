package objectClass;

//자녀의 신체 정보를 기록
public class PhysicalInfo {
	//멤버 변수(필드)
	String name;
	int age;
	float height, weight ;
	
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//method
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	void update(int age) {
		this.age = age;
		
	}
}
