package DataStructure.LinkedLists;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode previous = null;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }

        return previous;

    }


    public class ListNode {
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

}
