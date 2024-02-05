package reference;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] nums = {45,90,23,42,77,20,96,32,43,12,15};
		
		int sum =0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				sum+=nums[i];
			}
		}
		System.out.println("총합=" + sum);
		
		
		
		//int[] nums = new int[5]; //배열 선언
//		nums[0] = 45;
//		nums[1] = 90;
//		nums[2] = 23;
//		nums[3] = 42;
//		nums[4] = 77;
		

	}

}
