package statement;

import java.util.*;
public class SwitchStatement01 {

	public static void main(String[] args) {
		
		System.out.print("여행지를 선택해주세요(1.미주 2.유럽 3.동남아)>> ");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1층 안내데스크로 가세요");
			    break;
			case 2:
				System.out.println("2층 안내데스크로 가세요");
			    break;
			case 3:
				System.out.println("별관 안내데스크로 가세요");
			    break;
			default:
				System.out.println("여행지 선택이 잘못되었습니다.");
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
