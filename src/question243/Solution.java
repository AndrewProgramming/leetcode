package question243;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode reverseHead = reverse(slow.next);

        while (reverseHead.next != mid && head.next != mid) {
            if (reverseHead.val != head.val) {
                return false;
            }
            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode tempNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = tempNode;
        }
        return preNode;
    }
}