package objectClass;

public class SingletonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Singleton sing1= new Singleton();
//		Singleton sing2 = new Singleton();
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		if(sing1 == sing2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}

}
