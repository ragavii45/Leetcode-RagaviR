// Last updated: 12/08/2026, 21:40:38
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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;

        int count = 0;

        // Check whether k nodes are available
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        // Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // head is now the last node of this group
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}