package application;
import java.util.*;

public class GenericEx01 {

	public static void main(String[] args) {
		
		//제네릭
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김철수");
		list.add("이영희");
		list.add("박찬호");
		list.add("손흥민");	
		list.remove(2);
		list.set(2, "김민지"); //수정
		String name = list.get(2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//동적 배열(컬렉션 프레임워크)
		/*List list = new ArrayList();
		list.add(10);
		list.add(26.2);
		list.add("집");
		String name = (String) list.get(2);
		for(int i=0;i<list.size();i++) {
			System.out.println("리스트 값=>" + list.get(i));
		}*/
		
//		int[] nums = new int[3];
//		nums[0]=10;
//		nums[1]=26;
//		nums[2]=8;
//		
//		for(int i=0; i<nums.length;i++) {
//			System.out.println("배열[" + i + "], 값=" + nums[i]);
//		}
	}

}
