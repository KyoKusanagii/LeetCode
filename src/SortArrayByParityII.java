import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII {
	/*
	 * 
	 * 	Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

		Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

		You may return any answer array that satisfies this condition.
	 * 
	 * Input: [4,2,5,7]
	   Output: [4,5,2,7]
	   Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
	 * */
	
	public static int[] sortArrayByParityII(int[] A) {
	   List<Integer> odd = new ArrayList<>();	
	   List<Integer> even = new ArrayList<>();	
	   List<Integer> result = new ArrayList<>();	
	   boolean putOdd = false; //放奇數
       for(int i=0;i<A.length;i++) {
    	   if(A[i] % 2 ==0) {
    		   even.add(A[i]);
    	   }else {
    		   odd.add(A[i]);
    	   }
       }
       while(!odd.isEmpty() || !even.isEmpty()) {
    	   
    	   if(!putOdd) {
    		   int index = (int)Math.random()*(even.size());
        	   result.add(even.remove(index));
        	   putOdd = true;
           }else {
        	   int index = (int)Math.random()*(odd.size());
        	   result.add(odd.remove(index));
        	   putOdd = false;
           }
    	   
       }
       
       int [] ans = new int [result.size()];
       for(int i=0;i<ans.length;i++) {
    	   ans[i] = result.get(i);
       }
       return ans;
    }
	

	public static void main(String[] args) {
		int [] a = {4,2,5,7};
		System.out.println(sortArrayByParityII(a));
	}

}
