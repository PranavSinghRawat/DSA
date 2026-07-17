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
   public ListNode findn(ListNode head,int k){
        int cnt=1;
        ListNode temp=head;
        while(cnt<k&&temp!=null){
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        k=k%len;

        if(k%len==0) return head;
        tail.next=head;
        ListNode node=findn(head,len-k);
        ListNode newhead=node.next;
        node.next=null;
        return newhead;
    }
}