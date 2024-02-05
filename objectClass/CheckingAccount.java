package objectClass;


//체크카드 클래스
public class CheckingAccount extends Account{
	
	//필드
	String cardNo; //카드번호

	
	//생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {

		super(accountNo,ownerName,balance);
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
		
	}
	//메서드
	//카드로 지불
	public int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || balance < amount) {
			throw new Exception("지불이 불가능합니다");
		}
		return withdraw(amount);
	}
	
}
