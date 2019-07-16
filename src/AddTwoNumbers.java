import bean.ListNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode ans = new ListNode(0);
        ListNode temp1, temp2;
        if ((l1.val == 0 && l1.next == null) && (l2.val == 0 && l2.next == null)) {
            return ans;
        }
        do {
            if (l1 == null) {
                break;
            }
            list1.add(l1.val);
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
            list2.add(l2.val);
            if (l2.next != null) {
                l2 = l2.next;
            } else {
                break;
            }
        } while (true);
        StringBuilder a = new StringBuilder();
        BigDecimal sum = new BigDecimal("0");
        for (int i : list1) {
            a.append(i);
        }
        sum = sum.add(new BigDecimal(a.reverse().toString()));
        a = new StringBuilder();
        for (int i : list2) {
            a.append(i);
        }
        sum = sum.add(new BigDecimal(a.reverse().toString()));
        String sumStr = String.valueOf(sum.toString());
        a = new StringBuilder(sumStr).reverse();

        char[] c = new StringBuilder(a.toString()).toString().toCharArray();
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

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(1);
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(5);
//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);
//        l2.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(8);
        l1.next.next.next.next = new ListNode(8);
        l1.next.next.next.next.next = new ListNode(2);
        l1.next.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next.next = new ListNode(3);
        l1.next.next.next.next.next.next.next.next = new ListNode(1);
        l1.next.next.next.next.next.next.next.next.next = new ListNode(1);
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(1);
        l2.next.next.next = new ListNode(5);
        l2.next.next.next.next = new ListNode(5);
        l2.next.next.next.next.next = new ListNode(5);
        l2.next.next.next.next.next.next = new ListNode(1);
        l2.next.next.next.next.next.next.next = new ListNode(1);
        l2.next.next.next.next.next.next.next.next = new ListNode(16);

        System.out.println(a.addTwoNumbers(l1, l2));
    }
}
