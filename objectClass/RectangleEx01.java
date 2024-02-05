package objectClass;

public class RectangleEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Rectangle rec1 = new Rectangle(20, 30);
			int area = rec1.getArea();
			System.out.println("사각형의 넓이= " + rec1.getWidth() );
			System.out.println("사각형의 높이= " + rec1.getHeight());
			System.out.println("면적 = " + area);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
