import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {

        char [] c = String.valueOf(n).toCharArray();
        int sum = 0;
        boolean ans = false;
        Set<Integer> set = new HashSet<>(); //看是不是有重複的結果，有重複代表該數非快樂數
        do{
            for(int i=0;i<c.length;i++){
                sum += Math.pow(Character.getNumericValue(c[i]),2);
            }
            if(set.contains(sum)){
                ans = false;
                break;
            }
            set.add(sum);
            c = String.valueOf(sum).toCharArray();
            if(sum == 1){
                ans = true;
                break;
            }
            sum = 0;
        }while (true);

        return ans;
    }

    public static void main(String [] args){
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(19));
    }
}
