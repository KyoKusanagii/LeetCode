import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int cnt = 0;
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
            }else if(nums[i]==0){
                set.add(cnt);
                cnt = 0;
            }
            if(i==nums.length-1){
                set.add(cnt);
            }
        }
        try {
            ans = Collections.max(set);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ans;
    }
}
