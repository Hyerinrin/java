package statement;

import java.util.*;
public class ForStatement5 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		for(i=1; i<=100; i++) {
			sum +=i;
			if(sum>3500) {
				break;
			}
		}
		System.out.println("정답은: "+ i);
		
	}

}


