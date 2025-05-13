
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedList {

    public static void main(String[] args) {

        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        ListNode result = mergeLists(lists);
        //System.out.println(result);
        // while (result != null) {
        //     System.out.println(result.val);
        //     result = result.next;
        // }

    }

    public static ListNode mergeLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                list.add(current.val);
                current = current.next;
            }
        }
        Collections.sort(list);

        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 0; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head.next;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
