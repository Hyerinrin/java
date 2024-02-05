package reference;

public class StringEx5 {
	public static void main(String[] args) {
		String book = "자바의 정석";
		int location = book.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		boolean result = book.contains("자바");
		if(result) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		
	}
}
