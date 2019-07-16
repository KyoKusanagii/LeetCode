import bean.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergekSortedLists {
    /**
     * Input:
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * Output: 1->1->2->3->4->4->5->6
     */


    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> listNum = new ArrayList<>();
        ListNode ans = new ListNode(0),temp,temp2;
        for (int i = 0; i < lists.length; i++) {
            out:
            do {
                if (lists[i] == null) {
                    break out;
                }
                listNum.add(lists[i].val);
                if (lists[i].next != null) {
                    lists[i] = lists[i].next;
                } else if (lists[i].next == null) {
                    break out;
                }

            } while (true);
        }
        Collections.sort(listNum);
        if(listNum.size()==0){
            return null;
        } else if(listNum.size()==1){
            ans.val = listNum.get(0);
            return ans;
        }
        temp = new ListNode(listNum.get(0));
        for(int i=0;i<listNum.size()-1;i++){
            temp.next = new ListNode(listNum.get(i+1));
            if(i==0){
                ans = temp;
            }
            temp2 = temp.next;
            temp = temp2;

        }
        return ans;
    }
}
