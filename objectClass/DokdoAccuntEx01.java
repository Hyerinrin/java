package objectClass;

public class DokdoAccuntEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DokdoAccount chulsu = new DokdoAccount("555-27-99999", "김철수", 0, 0);
		chulsu.deposit(50000);
		System.out.println("잔액 : " + chulsu.balance);
		System.out.println("기부포인트 : " + chulsu.point);
		chulsu.deposit(10000);
		System.out.println("잔액 : " + chulsu.balance);
		System.out.println("기부포인트 : " + chulsu.point);
	}

}
