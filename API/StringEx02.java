package API;

import java.util.StringTokenizer;

public class StringEx02 {

	public static void main(String[] args) {
//		String data = "김철수&이영희,홍길동-박찬호,손흥민";
//		String[] names = data.split(",|&|-");
//		for(int i=0; i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		
		String data = "김철수 이영희 홍길동 박찬호 손흥민";
		StringTokenizer st = new StringTokenizer(data);
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		}
	}

}
