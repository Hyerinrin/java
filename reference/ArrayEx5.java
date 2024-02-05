package reference;


import java.util.*;

public class ArrayEx5 {

	public static void main(String[] args) {
		//
		int[] nums = {50,23,4,82,66};
		int temp;
		//소트 전 자료 출력
		System.out.println("<<sort전 자료 출력>>");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		
		//소트 알고리즘
		for(int i=0; i<nums.length-1; i++) { //비교가 이루어 지는 총 횟수
			for(int j=i+1; j<nums.length; j++) { //다음 것과 비교하기 위해
				if(nums[i] > nums[j]) { // > : 오름차순, < : 내림차순
					temp=nums[i];
					nums[i] = nums[j]; //nums[j] = nums[i];
					nums[j] = temp;
				}//if end
				
			}//for end[j]
		}// for end[i]
		
		
		//소트 후 자료 출력
		System.out.println("\n<<sort후 자료 출력>>");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		
		
		
		
		
//		Arrays.sort(nums);
//		
//		for(int i : nums) {
//			System.out.println(i);
//		}
	}

}
