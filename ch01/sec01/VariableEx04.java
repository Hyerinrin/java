package ch01.sec01;

public class VariableEx04 {

	public static void main(String[] args) {
		int x =10;
		int y=20;
		
		int trim;
		trim=x;
		x=y;
		y=trim;
		
		System.out.println("x값= "+x);
		System.out.println("y값= "+y);
	}

}
