package objectClass;

public class CreditLineAccountEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditLineAccount sundal = new CreditLineAccount("111-22-5555", "김선달", 100, 2000000);
		
		try {
			int amount = sundal.withdraw(500000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + sundal.balance);
			System.out.println("한도 : " + sundal.creditLine);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}

	}

}
