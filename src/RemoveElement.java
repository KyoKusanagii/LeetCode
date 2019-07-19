import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listRemove = new ArrayList<>();
        listRemove.add(val);
        for(int i : nums){
            list.add(i);
        }
        list.removeAll(listRemove);
       for(int i=0;i<list.size();i++){
           nums[i] = list.get(i);
       }
       return list.size();
    }


    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int nums[] = {0,4,4,0,4,4,4,0,2};
        int a = r.removeElement(nums,4);
    }

}
