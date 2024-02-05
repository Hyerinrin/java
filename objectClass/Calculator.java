package objectClass;


//계산기
public class Calculator {
	
	//더하기 메서드
	int sum(int ...nums) {
		
		int hap = 0;
		for(int i = 0; i<nums.length; i++) {
			hap += nums[i];
		}
		return hap;
	}
	

}
