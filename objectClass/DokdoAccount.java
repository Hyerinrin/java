package objectClass;


//은행 계좌 클래스
public class DokdoAccount extends Account{
	
	int point;
	
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo,ownerName,balance);
		this.point = point;
	}
	
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		point += amount*0.001;
	}
	
}
