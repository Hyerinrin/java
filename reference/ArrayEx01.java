package reference;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//배열 변수에는 번지가 저장되어 있어 이 번지를 메모리에서 찾으면 값이 저장되어 있음
		
//		int score1=96;
//		int score2=73;
//		int score3=82;
//		int sum = score1+score2+score3;
//		double avg = sum/3.0;
		
		int[] score = new int[3];
		score[0]=96;
		score[1]=73;
		score[2]= 82;
		int sum=0;
		for(int i =0; i<score.length; i++) {
			sum+=score[i];
		}
		double avg = (double)sum/score.length;
		System.out.println("총점= " + sum);
		System.out.println("평균= " + avg);
		

	}

}
