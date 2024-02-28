/*
다음 인터페이스를 구현하여 원,사각형의 넓이 및 둘레를 구하시오.

Shape인터페이스를 Circle클래스와 Rectangle클래스에서 구현.
각 클래스에서 필요한 메서드를 추가적으로 구현.
변수 선언은 private.
넓이와 둘레의 값은 소수점 두번쨰자리까지만 출력.
출력할떄는 System.out.printf();.
-----------------------
	출력 예시) 
	
	원의 넓이는 78.54입니다.
	원의 둘레는 31.42입니다.
	사각형의 넓이는 84.70입니다.
	사각형의 둘레는 41.80입니다.
	-----------------------
	=>둘레나 넓이는 예시와 같을 필요는 없음
*/

==================================================================

<Shape 인터페이스>
public interface Shape {

	//넓이를 계산하는 메서드
    double area();
}
===================================================================

<Circle 클래스>
public class Circle implements Shape{


	// 접근 제어자 private를 활용한 변수선언
	private double radius; //반지름
	private final double PIE = 3.14; //파이
	private double area; 
	private double round;
	
	//생성자
	public Circle(double radius) {
		super();
		this.radius= radius;
	}
	
	//인터페이스 구현
	@Override
	public double area() {
		area = Math.pow(radius, 2)*PIE;
		System.out.printf("원의 넓이는 %.2f입니다.", area);
		return area;
	}
	
	//일반메서드(반환값 double) <-둘레 구함
	public double round() {
		round = radius * PIE * 2;
		System.out.printf("원의 둘레는 %.2f입니다.", round);
		return round;
	}

}
==========================================================================

<Rectangle 클래스>
public class Rectangle implements Shape{

	// 접근 제어자 private를 활용한 변수선언
	private double width; //가로
	private double height; //세로(높이)
	private double area; 
	private double round;
	
	//생성자
	public Rectangle(double width, double height) {
		this.width= width;
		this.height = height;
	}

	//인터페이스 구현
	@Override
	public double area() {
		area = width * height;
		System.out.printf("사각형의 넓이는 %.2f입니다.", area);
		return area;
	}


	//일반메서드(반환값 double) <- 둘레
	public double round() {
		round = 2*(width+height);
		System.out.printf("사각형의 둘레는 %.2f입니다.", round);
		return round;
	}
}
=========================================================================

<Main>
public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		circle.round();
		System.out.println();
		circle.area();
		
		System.out.println();
		System.out.println();
		
		Rectangle rectangle = new Rectangle(5.12, 5.25);
		rectangle.round();
		System.out.println();
		rectangle.area();
	}

}

↓↓↓↓     ↓↓↓↓      ↓↓↓↓
<메인 method 실행 시 출력>
원의 둘레는 31.40입니다.
원의 넓이는 78.50입니다.

사각형의 둘레는 20.74입니다.
사각형의 넓이는 26.88입니다.
