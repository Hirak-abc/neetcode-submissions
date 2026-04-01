/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        slow.next = null;
        ListNode first = head;

        while(second!=null){
            ListNode temp1 = first.next;
            first.next = second;
            ListNode temp2 = second.next;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode curr_next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr_next;

        }
        return prev;
    }
}
