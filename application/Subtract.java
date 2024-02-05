package application;

public class Subtract implements Calculable{

	@Override
	public void calculate(int x, int y) {
		
		System.out.println("두 수의 차이= " + (x-y));
	}

}
