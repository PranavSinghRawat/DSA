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
    public ListNode reverse(ListNode head,int time){
        ListNode curr=head;
        ListNode prev=null;
        while(time>0){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            time--;
        }
        head.next=curr;
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        int size=2;
        ListNode left=head;
        ListNode prevleft=null;
        ListNode right;
        ListNode res=null;
        while(left!=null){
            right=left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }
            if(right==null){
                break;
            }
            ListNode nextleft=right.next;
            right=reverse(left,size);
            if(prevleft!=null){
                prevleft.next=right;
            }else{
                res=right;
            }
            prevleft=left;
            left=nextleft;
        }
        return res;
    }
}