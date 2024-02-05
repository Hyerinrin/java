package objectClass;

//사각형
public class Rectangle {
	//필드
		private int width;
		private int height;
		
		//public -> 다른 패키지에서도 접근 가능 | default -> 같은 패키지 내에서만 접근 가능 | private(캡슐화) -> 같은 클래스 내에서만 사용가능
		
	//생성자
		public Rectangle(int width, int height) throws Exception {
			
				if(width <= 0 || height <=0) {
					throw new Exception("넓이와 높이는 양수 값이어야 합니다");
				}
				this.width = width;
				this.height = height;
		}
		
	//면적 메소드
		int getArea() {
			
			return width * height;
		}

	//getter, setter 메서드
		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		} 
		
}
