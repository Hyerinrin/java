package API;

public class SmartPhone {
	
	//필드
	private String company;
	private String os;
	
	//생성자
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}

	//메서드
	@Override
	public String toString() {
		return company + "에서 만들었으며 " + "운영체제는 " + os;
	}
	
	
	
	
//	
//	public String getCompany() {
//		return company;
//	}
//	public void setCompany(String company) {
//		this.company = company;
//	}
//	public String getOs() {
//		return os;
//	}
//	public void setOs(String os) {
//		this.os = os;
//	}
//	
	
	
}
