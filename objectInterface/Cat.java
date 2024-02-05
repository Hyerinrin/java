package objectInterface;


public class Cat implements IAnimal {
	
	@Override
	public void eat() {
		System.out.println("고양이는 생선을 좋아합니다");
	}
}
