class Solution {
    public boolean isPalindrome(ListNode head) {
        // Middle of linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half
        ListNode prev = null, future = null, curr = slow;
        while (curr != null) {
            future = curr.next;
            curr.next = prev;
            prev = curr;
            curr = future;
        }

        // Compare first and second half
        ListNode fh = head, sh = prev;
        while (sh != null) {
            if (fh.val != sh.val)
                return false;
            fh = fh.next;
            sh = sh.next;
        }

        return true;
    }
}
