package practice;

import java.util.*;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("0~999 사이의 값을 입력하세요. ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum=0;
//		String str = Integer.toString(num);
//		String[] strArr = str.split("");
//		for(int i=0; i<strArr.length;i++) {
//			sum += Integer.parseInt(strArr[i]);
//		}
//		System.out.print("각 자릿수의 합 = " + sum);
		
		
		
		
		//============================================
		
		System.out.print("전공 이수 학점. ");
		Scanner sc = new Scanner(System.in);
		int major = sc.nextInt(); 
		System.out.print("교양 이수 학점. ");
		Scanner sc2 = new Scanner(System.in);
		int k_major = sc2.nextInt(); 
		System.out.print("일반 이수 학점. ");
		Scanner sc3 = new Scanner(System.in);
		int i_major = sc3.nextInt(); 
		
		int score =major + k_major + i_major; //총 이수 학점
		
		if(score>=140) {
			if(major >=70) {
				if((k_major >=30 && i_major>=30) || (k_major + i_major >=80)) {
					System.out.println("졸업 가능");
				}
			}else {
				System.out.println("전공학점 미충족");
			}
		}else {
			System.out.println("총 이수 학점 미 충족");
		}
		
	}

}
