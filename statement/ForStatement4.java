package statement;

import java.util.*;
public class ForStatement4 {

	public static void main(String[] args) {
		int jjak=0;
		int hol=0;
		
		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				jjak = jjak+i;
			}else {
				hol = hol+i;
			}
		}
		System.out.println("짝수의 합 = "+ jjak + ", 홀수의 합 = " + hol);
		
	}

}


