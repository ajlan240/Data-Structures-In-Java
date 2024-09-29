package LinkedList;
class ListNode {
    int value;
    ListNode next;
    public ListNode(int value) {
        this.value = value;
    }
    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
// 141. finding prescence of cycle in a linked list 
 class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != slow);

        return length;
    }
}
