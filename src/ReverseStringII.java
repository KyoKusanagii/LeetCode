import java.util.ArrayList;
import java.util.List;

public class ReverseStringII {
    public String reverseStr(String s, int k) { //k==3
        String ans = "";
        try {
            char[] c = s.toCharArray();
            List<Character> list = new ArrayList<>();
            List<Character> reverlist = new ArrayList<>();
            for (char c1 : c) {
                list.add(c1);
            }

            if (list.size()%k!=0 && list.size()>k) {
                for (int i = 0; i < list.size() / 2 * k; i++) {
                    StringBuilder builder = new StringBuilder();
                    for (int j = i * 2 * k; j <= (i * 2 * k + (2 * k - 1) >= list.size() ? list.size() - 1 : i * 2 * k + (2 * k - 1)); j++) {
                        if (j == (list.size() - (k * 2 - 1))) {
                            break;
                        }
                        builder.append(list.get(j));
                        if (j % k == k - 1 && j < k) {
                            builder = builder.reverse();
                        }
                    }
                    for (int a = 0; a < builder.length(); a++) {
                        reverlist.add(builder.charAt(a));
                    }
                }
                boolean moreThan2k = list.size()>(2*k);
                int x = 0;
                if(moreThan2k){
                    x = list.size() % (2 * k);
                }else{
                    x = list.size()%k;
                }
                if (x < k && moreThan2k) {
                    for (int i = list.size() - 1; i >= list.size() - x; i--) {
                        reverlist.add(list.get(i));
                    }
                } else if (k <= x && x < (2 * k)) {
                    StringBuilder builder1 = new StringBuilder();
                    boolean firstReverse = false;
                    List<Character> leftList = list.subList(list.size() - x, list.size());
                    for (int i = 0; i < leftList.size(); i++) {
                        if (i < k) {
                            builder1.append(leftList.get(i));
                        } else if (i >= k) {
                            if (!firstReverse) {
                                builder1 = builder1.reverse();
                                firstReverse = true;
                            }
                            builder1.append(leftList.get(i));
                        }
                    }
                    for (int z = 0; z < builder1.length(); z++) {
                        reverlist.add(builder1.charAt(z));
                    }
                }
            } else if (list.size()%k==0) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    builder.append(list.get(i));
                    if (i % k == k - 1 && i < k) {
                        builder = builder.reverse();
                    }
                }
                for (int a = 0; a < builder.length(); a++) {
                    reverlist.add(builder.charAt(a));
                }
            } else if (k > list.size()) {
                StringBuilder builder = new StringBuilder(s).reverse();
                for (int i = 0; i < builder.length(); i++) {
                    reverlist.add(builder.charAt(i));
                }
            }
            StringBuilder builder = new StringBuilder();
            for (char c2 : reverlist) {
                builder.append(c2);
            }
            ans = builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ans;
    }

    public static void main(String[] args) {
        ReverseStringII r = new ReverseStringII();
        System.out.println(r.reverseStr("a", 2));

    }
}
