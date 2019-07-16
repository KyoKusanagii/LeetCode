import bean.ListNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer>[] list = new List[2];
        list[0] = new ArrayList<>();
        list[1] = new ArrayList<>();
        ListNode ans = new ListNode(0);
        ListNode temp1, temp2;
        if ((l1.val == 0 && l1.next == null) && (l2.val == 0 && l2.next == null)) {
            return ans;
        }
        do {
            if (l1 == null) {
                break;
            }
            list[0].add(l1.val);
            if (l1.next != null) {
                l1 = l1.next;
            } else {
                break;
            }
        } while (true);

        do {
            if (l2 == null) {
                break;
            }
            list[1].add(l2.val);
            if (l2.next != null) {
                l2 = l2.next;
            } else {
                break;
            }
        } while (true);

        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < list.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int c : list[i]) {
                builder.append(c);
            }
            sum = sum.add(new BigDecimal(builder.toString()));
        }

        String sumStr = sum.toString();
        char[] c = sumStr.toCharArray();
        temp1 = new ListNode(Character.getNumericValue(c[0]));
        for (int i = 0; i < (c.length == 1 ? c.length : c.length - 1); i++) {
            if (c.length > 1) {
                temp1.next = new ListNode(Character.getNumericValue(c[i + 1]));
            }
            if (i == 0) {
                ans = temp1;
            }
            temp2 = temp1.next;
            temp1 = temp2;

        }
        return ans;
    }
}
