package reference;

public class StringEx4 {
	public static void main(String[] args) {
		String str = "우리나라 파이팅";
		String newStr = str.replace("우리나라", "대한민국");
		System.out.println(newStr);
		String str2="computer";
		System.out.println(str2.substring(1,5));
		String ssn = "950505-3333222";
		System.out.println("주민번호 : " + ssn.substring(0,7) + "********");
		
	}
}
