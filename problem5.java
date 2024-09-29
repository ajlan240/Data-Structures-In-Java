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
class Solution {
    
    public int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != slow);

        return length;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
            }
        }

        ListNode f = head;
        ListNode s = slow;
            
        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;

        }

        return s;
    }
    
}