package reference;

public class StringEx01 {
	public static void main(String[] args) {
//		String title = new String("우리모두 파이팅");
//		char ch = title.charAt(3);
//		System.out.println(ch);
		
		String ssn ="971012-2233445";
		char sex = ssn.charAt(7);
				
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		}else if(sex == '2' || sex == '4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}
	}
}
