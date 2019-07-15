import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        Set<Character> setS = new HashSet<>();
        Set<Character> setT = new HashSet<>();
        for(char c : s.toCharArray()){
            setS.add(c);
        }
        for(char c : t.toCharArray()){
            setT.add(c);
        }
        setT.removeAll(setS);
        return Collections.min(setT);

    }

    public static void main(String [] args){
        FindtheDifference f = new FindtheDifference();
        System.out.println(f.findTheDifference("abcd","abcde"));
    }
}
