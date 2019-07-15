import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        String str = "";
        String ans = "";
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : str1.toCharArray()){
            set1.add(c);
        }
        for(char c : str2.toCharArray()){
            set2.add(c);
        }
        boolean str1Longer = false;
        if (str1.equals(str2)) {
            ans = str1;
        } else if (str1.contains(str2) && set1.size() == 1) {
            ans = str2;
        } else if (str2.contains(str1) && set2.size() == 1) {
            ans = str1;
        } else {
            if (str1.length() > str2.length()) {
                str1Longer = true;
                str = str2;
            } else if (str2.length() > str1.length()) {
                str1Longer = false;
                str = str1;
            }

            char[] c = str.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < c.length; i++) {
                builder.append(c[i]);
                if (str1Longer) {
                    if (str1.contains(builder)) {
                        continue;
                    } else {
                        break;
                    }
                } else if (!str1Longer) {
                    if (str2.contains(builder)) {
                        continue;
                    } else {
                        break;
                    }
                }
            }


            String s = builder.toString();
            char[] d = s.toCharArray();
            builder = new StringBuilder();
            for (int i = 0; i < d.length; i++) {
                builder.append(d[i]);
                if (s.split(builder.toString()).length == 0) {
                    ans = builder.toString();
                    break;
                } else {
                    continue;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args){
        GreatestCommonDivisorofStrings g = new GreatestCommonDivisorofStrings();
        System.out.println(g.gcdOfStrings(
                "ABABAB","ABAB"));
    }
}
