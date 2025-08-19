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
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null)return head;
        int c = 1;
        ListNode temp = head;
        while(temp.next != null )
        {
            temp = temp.next;
            c++;
        }
        k=k%c;
        int skip  = c-k;
        temp.next = head;
        temp = head;
        for(int i=0;i<skip -1;i++)
        {
            temp= temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;

    }
}