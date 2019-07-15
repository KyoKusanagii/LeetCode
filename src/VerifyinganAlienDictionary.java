import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class VerifyinganAlienDictionary {

    Map<Character,Integer> map = new LinkedHashMap<>();

    public boolean isBackBigger(char [] front,char [] back){
        boolean ans = true;
        int width = front.length > back.length ? back.length : front.length;
        for(int i=0;i<width;i++){
           if(front[i] != back[i] && map.get(front[i]) > map.get(back[i])){
               ans = false;
               break;
           }else if(front[i] != back[i] && map.get(front[i]) < map.get(back[i])){
               break;
           }else if(front[i] == back[i]){
               continue;
           }
        }
        if(ans == true && back.length<front.length && new String(front).contains(new String(back))){
            ans = false;
        }

        return ans;
    }
    public boolean isAlienSorted(String[] words, String order) {
        boolean ans = true;
        char [] ch = order.toCharArray();
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],i+1);
        }

        out:for(int i=0;i<words.length-1;i++){
            char [] c = words[i].toCharArray();
            for(int j = i+1;j<words.length;j++){
                char [] d = words[j].toCharArray();
                if(isBackBigger(c,d)){
                    continue;
                }else{
                    ans = false;
                    break out;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args){
        VerifyinganAlienDictionary v = new VerifyinganAlienDictionary();
//        System.out.println(v.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
//        System.out.println(v.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
        System.out.println(v.isAlienSorted(new String[]{"kuvp","q"}, "ngxlkthsjuoqcpavbfdermiywz"));
    }
}
