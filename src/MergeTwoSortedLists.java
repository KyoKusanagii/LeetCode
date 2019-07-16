import bean.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        ListNode ans = new ListNode(0), temp, temp2;

        do {
            if(l1 == null){
                break;
            }
            list.add(l1.val);
            if (l1.next != null) {
                l1 = l1.next;
            } else if (l1.next == null) {
                break;
            }
        } while (true);

        do {
            if(l2==null){
                break;
            }
            list.add(l2.val);
            if (l2.next != null) {
                l2 = l2.next;
            } else if (l2.next == null) {
                break;
            }
        } while (true);
        if(l1 == null && l2 == null){
            return null;
        }
        Collections.sort(list);
        if(list.size()==1){
            ans.val = list.get(0);
            return ans;
        }
        temp = new ListNode(list.get(0));
        for (int i = 0; i < list.size()-1; i ++) {
            temp.next = new ListNode(list.get(i + 1));
            if (i == 0) {
                ans = temp;
            }
            temp2 = temp.next;
            temp = temp2;
        }

        return ans;
    }

    public static void main(String [] args){
    }
}


