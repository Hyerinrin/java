package objectClass;

public class AccountEx03 {

	public static void main(String[] args) {
		Account hyerin = new Account("111-22-66666", "yhr",0);
		
		hyerin.deposit(20000);
		try {
			int amount = hyerin.withdraw(7000);
			System.out.println("인출액은 : " + amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		Account minji = new Account("111-22-55555", "김민지", 100);
		minji.deposit(3000);
		
		System.out.println("거래은행 : " + Account.BANKNAME);
		System.out.println("계좌번호 : " + minji.accountNo);
		System.out.println("예금주 이름 : " + minji.ownerName);
		System.out.println("잔액 : " + minji.balance);
		//System.out.println("예금 : " + hyerin.balance);
	}

}
