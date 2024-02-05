package API;

public class StringEx01 {

	public static void main(String[] args) {
//		String str = "우리";
//		str += "나라";
//		str += "만세";
//		System.err.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("우리모두");
		sb.append("파이팅");
		System.out.println(sb.toString());
		sb.insert(4, "힘차게");
		System.out.println(sb.toString());
		sb.setCharAt(7, '화');
		System.out.println(sb.toString());
		sb.replace(4, 7, "아자아자");
		System.out.println(sb.toString());
		sb.delete(8, 11);
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println("결과 : " + result);
	}

}
