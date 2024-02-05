package ch01.sec01;

public class Variable09 {
	public static void main(String[] args) {
		
		//문자형 char(2)
		char ch1 = 'A';
		//String st ="V";
		System.out.println(ch1);
		char ch2=65; //컴퓨터는 자동으로 문자를 2진수로 받아들임
		System.out.println(ch2);
		char ch3='가';
		System.out.println(ch3);
		char ch4=44032;
		System.out.println(ch4);
		char ch5= 0xAC00; //16진수
		System.out.println(ch5);
		char ch6= '\uAc00'; //유니코드
		System.out.println(ch6);
	}

}
