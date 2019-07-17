import bean.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesink_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> reverList = new ArrayList<>();
        ListNode ans = new ListNode(0);
        ListNode temp1, temp2;
        if (head == null) {
            return null;
        }
        while (head != null) {
            list.add(head.val); //先取出全部的數字
            head = head.next;
        }

        if (list.size() == 1) {
            ans = new ListNode(list.get(0));
            return ans;
        }


        if (list.size() >= k) {
            for (int i = 0; i < list.size() / k; i++) {
                for (int j = k * i + (k - 1); j >=k*i; j--) {
                    reverList.add(list.get(j));
                }
            }
            if (list.size() % k != 0) {
                for (int i = list.size() - (list.size() % k) ; i <list.size(); i++) {
                    reverList.add(list.get(i));
                }
            }
        }else{
            reverList.addAll(list);
        }

        temp1 = new ListNode(reverList.get(0));
        for (int i = 0; i < list.size() - 1; i++) {
            temp1.next = new ListNode(reverList.get(i + 1));
            if (i == 0) {
                ans = temp1;
            }
            temp2 = temp1.next;
            temp1 = temp2;
        }
        return ans;
    }

    public static void main(String[] args) {
        ReverseNodesink_Group r = new ReverseNodesink_Group();
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);

        System.out.println(r.reverseKGroup(l, 2));
    }
}
