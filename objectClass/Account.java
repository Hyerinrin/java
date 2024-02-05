package objectClass;

//은행계좌 클래스
public class Account {
	//멤버변수필드
	String accountNo; //계좌번호
	String ownerName; //예금주이름
	int balance; //통장 잔액
	static final String BANKNAME = "신한은행"; //final : 붙어서 다신 값이 변경 되지 않으면 -> 변수명을 대문자로 || static : 클래스 객체를 생성 안하고 접근할 수 있음 -> new 안하고...
	
	
	//생성자 (따로 안만들면 default 생성자를 하나 만들어줌)
	//-> 이름을 따로 만들지 않음
	
	public Account() {
		
	}
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//예금 메서드
	void deposit(int amount) {
		balance += amount;
	}
	
	//출금 메서드
	int withdraw(int amount) throws Exception {
		
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다");
		}
		balance -= amount;
		
		return amount;
	}
	
}
