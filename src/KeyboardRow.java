import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class KeyboardRow {
    static String[][] keyboard =
            {
                    {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"},
                    {"A", "S", "D", "F", "G", "H", "J", "K", "L"},
                    {"Z", "X", "C", "V", "B", "N", "M"}
            };

    public String[] findWords(String[] words) {

        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Set<Integer> set = new TreeSet<>();
            char[] ch = words[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                set.add(getLine(String.valueOf(ch[j])));
                if(set.size()>1){
                    break;
                }
            }
            if(set.size() == 1){
                ansList.add(words[i]);
            }
        }

        String[] ans = new String[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;

    }

    public int getLine(String str) {
        int index = 0;
        end:for (int a = 0; a < keyboard.length; a++) {
            for (int b = 0; b < keyboard[a].length; b++) {
                if (str.toUpperCase().equals(keyboard[a][b])) {
                    index = a;
                    break end;  //跳出最外圍迴圈
                }
            }
        }
        return index;
    }

    public static void main(String []args){
        String [] a = {"Hello","Alaska","Dad","Peace"};
        KeyboardRow k = new KeyboardRow();
        System.out.println(k.findWords(a));
    }
}
