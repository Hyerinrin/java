package application;

import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 75);
		map.put("박찬호", 80);
		map.put("이영희", 90);
		
		System.out.println("성적 현황표");
		
		//set -> iterator
		Set<String> key = map.keySet();
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String name = iter.next(); //hashMap의 키들
			Integer score = map.get(name); //키들을 통해 값 가져오기
			System.out.println("이름 : " + name + ", 점수 : " + score);
		}
		
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "홍길동");
//		map.put(2, "김철수");
//		map.put(3, "이영희");
//		map.put(4, "김철수");
//		System.out.println("총 인원수 : " + map.size());
//		System.out.println(map.get(1));
	}

}
