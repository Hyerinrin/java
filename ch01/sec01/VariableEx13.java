package ch01.sec01;

public class VariableEx13 {
	
	public static void main(String[] args) {
		
		String str1 ="10";
		String str2 = "20";
		
		System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); //문자 -> 숫자
		
		int num = 10;
		System.out.println(String.valueOf(num));// 숫자 -> 문자로
		
		String name ="김철수";
		int age =25;
		System.out.println("내 이름은 "+ name + "이고 나이는 "+ age + "세 입니다.");
		System.out.printf("내 이름은 %s이고 나이는 %d세 입니다.", name, age);
		
	}

}
