package reference;


import java.util.*;

public class ArrayEx6 {

	public static void main(String[] args) {
		//lotto
		int[] lotto = new int[6];
		boolean run = true;
		while(run) {
			//1부터 45까지 번호 6개를 무작위로 생성
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}
			
			run= false;
			//중복 값 검증 알고리즘
			for(int i=0; i<lotto.length-1; i++) { //비교가 이루어 지는 총 횟수
				for(int j=i+1; j<lotto.length; j++) { //다음 것과 비교하기 위해
					if(lotto[i] == lotto[j]) { // 중복값 나왔을 때
						run = true;
						break;
					}
					
				}//for end[j]
			}// for end[i]
		}//while end
		System.out.println("**로또 자동번호 출력**");
		for(int i=0; i<lotto.length; i++) {
			System.out.println((i+1) + "번째 번호 : " + lotto[i]);
		}
		
		
		
		
//		Arrays.sort(lotto);
//		
//		for(int i : lotto) {
//			System.out.println(i);
//		}
	}

}
