import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

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

    public static void main(String[] args) {
      ListNode [] a = new ListNode[2];


    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> listNum = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode myNode = lists[i];
            while(myNode.next != null){
                listNum.add(myNode.val);
                int nextNum = myNode.next.val;
                myNode.next = new ListNode(nextNum);
                myNode = myNode.next;
            }
        }

//        Collections.sort(listNum);
//        ListNode listNode = new ListNode(listNum.get(0));
//        for(int i = 1;i<listNum.size()-1;i=i+2){
//            if(subNode == null){
//                 subNode = new ListNode(listNum.get(i));
//                 listNode = subNode;
//            }
//            listNode.next = new ListNode(listNum.get(i+1));
//            subNode = subNode.next;
//        }
        return null;
    }
}
