package statement;

import java.util.*;
public class SwitchStatement2 {

	public static void main(String[] args) {
		
		char grade = 'A';
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수회원입니다");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원입니다");
				break;
			default:
				System.out.println("손님입니다");
		    
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
