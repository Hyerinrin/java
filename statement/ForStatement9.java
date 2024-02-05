package statement;

import java.util.*;
public class ForStatement9 {

	public static void main(String[] args) {
			
		exit:for(int i=1; i<=5; i++) {
			for(int j=1;j<=5; j++) {
				System.out.println(i + "-----" + j);
				if(i==3) {
					break exit;
				}
			}
		}
		
		
		
		
//		int sum; //전체 보물 무게(30)
//		for(int a=1; a<=30; a++) {
//			for(int b=1; b<=30; b++) {
//				sum= a*2+b*3;
//				if(sum==30) {
//					System.out.println("2kg 보물 수=" + a + ", 3kg 보물 수=" + b);
//				}
//			}
//		}
//		
		//==============================
		
//		int x = 0; //2kg
//		int y = 0; //3kg
//		int gold =0; //가져갈 수 있는 금의 경우의 수
//		for(x=1; x<=30; x++) {
//			for(y=1; y<=30; y++) {
//				if(x*2 + y *3==30) {
//					gold+=1;
//					System.out.println("2키로는 "+ x + "개, 3키로는 "+ y + "개,");
//				}
//			}
//			
//		
//		}System.out.println("따라서 총 경우의 수는" + gold);
		
		
	}

}


