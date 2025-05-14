
public class ReverseNodesKGroup {

    public static void main(String[] args) {
        ListNode example = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        example = reverseKGroup(example, 2);

        while (example != null) {
            System.out.print(example.val + "\t");
            example = example.next;
        }

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 0)
            return head;

        ListNode pointer = new ListNode(0);
        pointer.next = head;
        int nodeLength = 0;
        while (pointer != null && pointer.next != null) {
            nodeLength++;
            pointer = pointer.next;
        }

        if (nodeLength < k)
            return head;

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        for (int i = 0; i < k; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head.next = reverseKGroup(current, k);

        return previous;
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
