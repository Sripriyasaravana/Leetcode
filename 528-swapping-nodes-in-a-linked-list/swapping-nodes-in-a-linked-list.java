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
        if(head==null||head.next==null)
{
    return head;
}		
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 0; i < k - 1;i++)
            fast = fast.next;
        temp1 = fast;
        while(fast.next != null) {
			slow = slow.next;
            fast = fast.next;
        }
        temp2 = slow;
        int swap = temp1.val;
        temp1.val = temp2.val;
        temp2.val = swap;
        
        return head;
    }
}

        
    