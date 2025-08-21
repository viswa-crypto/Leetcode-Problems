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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast= head , slow = head;
        for(int i = 1;i<k;i++)
        {
            fast=fast.next;
        }
        ListNode temp =fast;
        while(fast!= null && fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        int te = slow.val;
        slow.val = temp.val;
        temp.val = te;
        
        return head;
    }
}