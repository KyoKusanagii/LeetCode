import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                int x = map.get(nums[i]);
                map.put(nums[i],++x);
            }
        }

        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,Integer> map1 = itr.next();
            if(map1.getValue()>=2){
                nums[length] = map1.getKey();
                length ++;
                nums[length] = map1.getKey();
                length++;
            }else {
                nums[length] = map1.getKey();
                length ++;
            }
        }

        return length;
    }
}
