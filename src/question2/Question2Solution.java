package question2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Question2Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);

        int carry = 0;

        ListNode currNode = head ;

        while (l1 != null || l2 != null) {
            int x1 = (l1 != null ? l1.val : 0);
            int x2 = (l2 != null ? l2.val : 0);

            int sum = x1 + x2 + carry;
            carry = sum / 10;
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;


        }

        if (carry == 1) {
            currNode.next = new ListNode(carry);
        }
        return head.next;

    }

    public static void main(String[] args) {
        Question2Solution ins = new Question2Solution();


        ListNode l1 = new ListNode(3);
        ListNode headL1 = l1;
        l1.next = new ListNode(0);
        l1 = l1.next;
        l1.next = new ListNode(5);


        ListNode l2 = new ListNode(3);
        ListNode headL2 = l2;

        l2.next = new ListNode(0);
        l2 = l2.next;
        l2.next = new ListNode(5);
        ins.addTwoNumbers(headL1,headL2);
    }
}