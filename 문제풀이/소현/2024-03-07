import java.util.*;

public class CorrectNumber {

	public static void main(String[] args) {
		//숫자 맞추기 게임 (1-6의 숫자(정수)를 랜덤으로 한번 뽑은 다음 숫자를 입력받아서 맞추는 게임을 한다. 맞출때 까지 입력하게 하는 코드를 작성하시오 )
		
		//1) "1이상 6이하의 정수를 입력하세오"를 프린트하고 숫자를 입력받는다. 
		//2) 정답을 맞출시에는 "정답입니다"를 프린트하고 루프탈출 / 정답이 아닐시에는 " 1이상 6이하의 정수를 다시 입력하세요"를 출력하고 숫자를 다시 입력받게 한다. 
		//(힌트 : 랜덤으로 뽑는 숫자는 루프문 밖에서 뽑아서 사용한다. Math 클라스의 random()메소드 이용 )
		
		int num = (int)Math.floor(Math.random() * 6 +1); 
		
		System.out.println("1 이상 6 이하의 정수를 입력하세요");
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int num2 = input.nextInt();
			if(num == num2) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("숫자를 다시 입력하세요");
			}
		}
		
	}
}
=================================================
<출력>
1 이상 6 이하의 정수를 입력하세요
2
숫자를 다시 입력하세요
1
숫자를 다시 입력하세요
3
숫자를 다시 입력하세요
4
숫자를 다시 입력하세요
5
정답입니다.
