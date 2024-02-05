package practice;

public class Exam01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10 ; i+=2) {
			for(int j=10; j>i; j-=2) { //-2씩 감소 되는 k가 i보다 클 때 "#" 찍음, ex) i=1일때, k=10,8,6,4,2가 조건에 해당되므로 "#"은 5번
				System.out.print("#");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
