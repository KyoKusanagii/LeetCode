import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        Iterator<Integer> itr = set.iterator();
        int j = 0;
        while (itr.hasNext()){
            int x = itr.next();
            nums[j] = x;
            j++;
        }
        return set.size();
    }
}
