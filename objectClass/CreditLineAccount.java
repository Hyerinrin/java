package objectClass;


//마이너스 통장 클래스(대출 통장)
public class CreditLineAccount extends Account{
	//field
	int creditLine; //마이너스한도
	
	//생성자 -> 초기화 담당
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo,ownerName,balance);
		this.creditLine = creditLine;
	}
	
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	//인출 메서드(오버라이딩)
	int withdraw(int amount) throws Exception {
			
			if(balance + creditLine < amount) {
				throw new Exception("인출이 불가능합니다");
			}
			balance -= amount;
			
			return amount;
		}
	
}
/*오버라이딩 -> 재정의*/