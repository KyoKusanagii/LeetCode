import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
	   int ans = 0;
	   Set<Integer> set = new HashSet<>();
	   for(int n : nums) {
		   set.add(n);
	   }
	   
	   for(int s : set) {
		   int sameTimes = 0;
		   for(int i=0;i<nums.length;i++) {
			   if(nums[i] == s) {
				   sameTimes++;
			   }
			   if(sameTimes == 1 && i == nums.length-1) {
				   ans = s;
				   return ans;
			   }
			   if(sameTimes == 2) {
				   break;
			   }
			   
		   }
	   }
	   
	   return ans;
	     
	}
	
	public static void main(String[] args) {
		int [] a = {4,1,2,1,2};
		System.out.println(singleNumber(a));
	}
}
