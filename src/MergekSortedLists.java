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

    public static void main(String [] args){
//        ListNode li = new ListNode(10000);
//        li.next = new ListNode(3);
//        ListNode temp = li;
//        li.next = new ListNode(8);  //如果li重新new 產生新的記憶體空間，那麼temp的參考的li的指標就斷掉了，所以此時無論li怎麼變動，都不會影響temp
//        li.setVal(8);   //k
//        System.out.println(temp.val);   //10000
//        System.out.println(temp.next.val);  //3
//        System.out.println(li.val); //5
//        System.out.println(li.next.val); //8
        MergekSortedLists m = new MergekSortedLists();
        ListNode [] a = new ListNode[3];
        a[0] = new ListNode(1);
        a[0].next = new ListNode(4);
        a[0].next.next = new ListNode(5);
        a[1] = new ListNode(1);
        a[1].next = new ListNode(3);
        a[1].next.next = new ListNode(4);
        a[2] = new ListNode(2);
        a[2].next = new ListNode(6);
//        a[0] = a[2];
//        a[2] = a[1];
        System.out.println(m.mergeKLists(a));

    }
}
