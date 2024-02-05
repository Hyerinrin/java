package reference;


import java.util.*;

public class ArrayEx4 {

	public static void main(String[] args) {
		System.out.println("* 컴퓨터와 가위바위보 게임*");
		Scanner sc = new Scanner(System.in);
		System.out.print("선택해주세요(1.바위 2.가위 3.보)>>");
		int my= sc.nextInt();
		
		String[] choice = {"바위", "가위", "보"};
		int com = (int)(Math.random()*3)+1;
		if(com== my) {
			System.out.println("비겼습니다.");
		}else if((com==1 && my==3) || (com==2 && my==1) || (com==3 && my==2)) {
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("당신이 졌습니다.");
		}
		System.out.println("컴퓨터의 선택은 => " + choice[com-1] + ", 나의 선택은 => "+ choice[my-1]);
		
		
		
		
		
		
		//int[] nums = new int[5]; //배열 선언
//		nums[0] = 45;
//		nums[1] = 90;
//		nums[2] = 23;
//		nums[3] = 42;
//		nums[4] = 77;
		

	}

}
