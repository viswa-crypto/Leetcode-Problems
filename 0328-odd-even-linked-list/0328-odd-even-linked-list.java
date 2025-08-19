class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
       ListNode oddhead = head;
       ListNode evenhead = oddhead.next;
       ListNode merge = evenhead;
       while(evenhead!= null && evenhead.next != null ){
        oddhead.next = evenhead.next;
        oddhead = oddhead.next;
        evenhead.next = oddhead.next;
        evenhead = evenhead.next;
       }
       oddhead.next = merge;
       return head;
    }
}