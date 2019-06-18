package question92;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        dummyHead.next = head;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        head = pre.next;

        for (int j = 0; j < n - m; j++) {
            ListNode nxt = head.next;
            head.next = nxt.next;
            nxt.next = pre.next;
            pre.next = nxt;
        }

        return dummyHead.next;


    }
}