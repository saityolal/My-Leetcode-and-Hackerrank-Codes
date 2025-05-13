
public class swapPairs {

    public static void main(String[] args) {
        ListNode example = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        example = swapping(example);

        while (example != null) {
            System.out.print(example.val + "\t");
            example = example.next;
        }
    }

    public static ListNode swapping(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }

        return temp.next;
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
