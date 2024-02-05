package application;

import java.util.*;
public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김철수");
		set.add("이영희");
			
		System.out.println("총 인원수 : " + set.size());
		for(String name : set) {
			System.out.println("이름 " + name );
		}
		set.remove("김철수");
		System.out.println("제거후 출력");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("이름 : " + name);
		}
	}

}
