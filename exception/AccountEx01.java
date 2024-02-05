package exception;

public class AccountEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ji = new Account("111-22-88888", "김민지", 100);
		ji.deposit(5000);
		try {
			int amount = ji.withdraw(30000);
			System.out.println("인출 금액 : " + amount);
			System.out.println("잔액 : " + ji.balance);
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
