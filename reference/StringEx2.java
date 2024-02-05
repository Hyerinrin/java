package reference;

public class StringEx2 {
	public static void main(String[] args) {
		String ssn="9710121234567";
		System.out.println("총 글자수= " + ssn.length());
		int len = ssn.length();
		if(len ==13) {
			System.out.println("자리수 맞음");
		}else {
			System.out.println("자리수 틀림");
		}
	}
}
