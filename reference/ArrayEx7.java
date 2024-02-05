package reference;


import java.util.*;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		int[][] nums = new int[3][5]; //[행][열]
		nums[0][0] = 10;
		nums[1][1] = 30;
		nums[2][3] = 70;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
