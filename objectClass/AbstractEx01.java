package objectClass;

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger hodol = new Tiger();
		Eagle eagle = new Eagle();
		hodol.name = "호돌이";
		hodol.age = 3; 
		hodol.move();
		System.out.println();
		eagle.name="독수리";
		eagle.home ="소나무둥지";
		eagle.move();
	}

}
