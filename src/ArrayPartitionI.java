import java.util.Arrays;

public class ArrayPartitionI {
	/*
	 * Given an array of 2n integers, 
	 * your task is to group these integers into n pairs of integer, 
	 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
	 * 
	 */
	public static int arrayPairSum(int[] nums) {
		int max = 0;
		Arrays.sort(nums);
//		for(int n : nums) {
//			System.out.print(n + "\t");
//		}
		for(int i=0;i<nums.length/2;i++) {
			//System.out.println("i = " + i);
			max += Math.min(nums[2*i],nums[2*i+1]);
		}
		return max;
    }
	
	public static void main(String[] args) {
		int [] a = {1,4,3,2};
		System.out.println(arrayPairSum(a));
	}

}
