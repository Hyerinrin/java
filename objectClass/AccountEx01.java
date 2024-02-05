package objectClass;

public class AccountEx01 {

	public static void main(String[] args) {
		Account chulsu = new Account(); //인스턴스 객체 생성
		Account gildong = new Account(); 
		
		chulsu.accountNo = "111-22-33333";
		chulsu.ownerName = "김철수";
		chulsu.balance = 1000;
		
		gildong.accountNo = "111-22-55555";
		gildong.ownerName = "홍길동";
		gildong.balance = 0;
		
		chulsu.deposit(5000);
		gildong.deposit(3000);
		chulsu.deposit(2000);
		
		try {
			int amount = gildong.withdraw(1200);
			System.out.println("인출한 금액=" + amount);
			System.out.println("잔액(홍길동)=" + gildong.balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
