package objectClass;

public class CheckingAccountEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount  gildong= new CheckingAccount("111-22-55555","홍길동",100,"1111-3333-5555-7777");
		gildong.deposit(5000);
		try {
			int paidAmount = gildong.pay("1111-3333-5555-7777", 1500);
			System.out.println("지불액 : " + paidAmount);
			System.out.println("잔액 : " + gildong.balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}

}
