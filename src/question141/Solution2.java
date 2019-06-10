package question141;



/*
执行用时 : 58 ms, 在Palindrome Number的Java提交中击败了52.96% 的用户
内存消耗 : 40.1 MB, 在Palindrome Number的Java提交中击败了75.07% 的用户
*/

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != slow) {
            if (fast ==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;//一次走两步
        }
        return true;
    }
}
