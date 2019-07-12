import java.util.HashMap;
import java.util.Map;

public class K_diffPairsinanArray {

    public int findPairs(int[] nums, int k) {
        int a = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums[j];j++){
                if(j == map.get(i)){

                }
                if(Math.abs(nums[i]-nums[j]) == k){
                  map.put(j,i);
                  a++;
                }
            }
        }
        return 1;
    }
}
