import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arrToList = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        boolean targetIsEven = target % 2 == 0;
        for (int i = 0; i < candidates.length; i++) {
            arrToList.add(candidates[i]);
        }

        Collections.sort(arrToList);

        int x = arrToList.indexOf(target);
        if (x != -1) {
            List<Integer> a = new ArrayList<>();
            a.add(arrToList.get(x));
            ansList.add(a);
        }
        ansList.remove(x);
        for (int i = 0; i < arrToList.size()-1; i++) {
            int num = arrToList.get(i);
            boolean nowIsEven = num %2 == 0;
            if(targetIsEven){
                int sum = 0;
                while(sum < target){
                    sum += num;
                }
                if(sum == target){
                    List<Integer> list = new ArrayList<>();
                    for(int j=1;j<=sum/num;i++){
                        list.add(num);
                    }
                    ansList.add(list);
                }else{



                }
            }
        }


    }
}
