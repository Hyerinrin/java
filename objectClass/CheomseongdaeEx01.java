package objectClass;

public class CheomseongdaeEx01 {

	public static void main(String[] args) {
		Cheomseongdae chulsu = Cheomseongdae.getInstance();
		
		Cheomseongdae gildong = Cheomseongdae.getInstance();
		
		chulsu.show("철수");
		gildong.show("길동");
		if(chulsu == gildong) {
			System.out.println("같은 첨성대 객체");
		}else {
			System.out.println("다른 첨성대 객체");
		}
	}

}
