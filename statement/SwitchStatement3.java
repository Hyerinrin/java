package statement;

import java.util.*;
public class SwitchStatement3 {

	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요.>> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
		}
		
		
		
		/*switch(조건식){  <--조건식에 비교 연산자는 사용 불가
		 * 
		 *	case 값: 
		 *		수행할 명령문;
		 * 		break;   <--항상 써줘야 함 
		 *  case 값:
		 * 		수행할 명령문;
		 * 		break;
		 * 
		 *  default:
		 *  	수행할 명령문;
		 * }*/

	}

}
