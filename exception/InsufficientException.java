package exception;

public class InsufficientException extends Exception{
	
	//빈 생성자
	public InsufficientException() {
		
	}
	
	//문자 메시지를 받는 생성자
	public InsufficientException(String message) {
		super(message);
	}
}
