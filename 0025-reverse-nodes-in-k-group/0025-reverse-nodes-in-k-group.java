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

    public ListNode reverse(ListNode head, int time) {
        ListNode curr = head;
        ListNode prev = null;

        while (time > 0) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            time--;
        }

        head.next = curr;
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode left = head;
        ListNode res = null;
        ListNode prevleft = null;
        ListNode right;

        while (left != null) {

            right = left;

            for (int i = 1; i < k; i++) {
                if (right == null)
                    break;
                right = right.next;
            }

            if (right == null)
                break;

            ListNode nextleft = right.next;

            ListNode newHead = reverse(left, k);

            if (prevleft != null)
                prevleft.next = newHead;
            else
                res = newHead;

            prevleft = left;
            left = nextleft;
        }

        if (res == null)
            return head;

        return res;
    }
}