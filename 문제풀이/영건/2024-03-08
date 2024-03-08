package quiz;
//방법 
//1. 이기고 지고 비긴 상태를 win, lose, draw 클래스를 만들어 승부 출력
//2. 묵,찌,빠 배열과 Math 함수를 매치해 값을 얻어 이기고 지고의 승부 출력
//3. 괜히 머리쓰기 귀찮으니 if문 or for문 노가다로 쉽게 풀기   <- 가장 쉬운듯
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가위 바위 보!");
		System.out.print("나 -> ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		int s = (int)(Math.random()*3);
		String[] z = {"묵","찌","빠"};	
		  
		  /* 결과 비교	*/
		  
		  if(a.equals("묵")) {
			  if(z[s].equals("찌")) {
				  System.out.println("컴퓨터 : 찌");
				  System.out.println("이겼습니다.");
			  }else if(z[s].equals("빠")) {
				  System.out.println("컴퓨터 : 빠");
				  System.out.println("졌습니다.");
			  }else {
				  System.out.println("컴퓨터 : 묵");
				  System.out.println("비겼습니다.");
			  }
			  
		  }
		  
		  if(a.equals("찌")) {
			  if(z[s].equals("빠")) {
				  System.out.println("컴퓨터 : 빠");
				  System.out.println("이겼습니다.");
			  }else if(z[s].equals("묵")) {
				  System.out.println("컴퓨터 : 묵");
				  System.out.println("졌습니다.");
			  }else {
				  System.out.println("컴퓨터 : 찌");
				  System.out.println("비겼습니다.");
			  }
			  
		  }
		  
		  if(a.equals("빠")) {
			  if(z[s].equals("묵")) {
				  System.out.println("컴퓨터 : 묵");
				  System.out.println("이겼습니다.");
			  }else if(z[s].equals("찌")) {
				  System.out.println("컴퓨터 : 찌");
				  System.out.println("졌습니다.");
			  }else {
				  System.out.println("컴퓨터 : 빠");
				  System.out.println("비겼습니다.");
			  }
		  }
	}

}

---------------------------------------------
[출력]
가위 바위 보!
나 -> 묵
컴퓨터 : 빠
졌습니다.
