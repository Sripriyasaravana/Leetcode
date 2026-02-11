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
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head==null||head.next==null)
//         {
//             return;
//         }
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null && fast.next!=null)
//         {
//           slow=slow.next;
//           fast=fast.next.next;  
//         }
//         ListNode first = slow.next;
//         slow.next = null;
//         first = reverseList(first);
//         mergeLists(head, first);

//     }
//       ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode temp = head;
//         ListNode next;

//         while (temp != null) {
//             next = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = next;
//         }
//         return prev;
//     }    
//     public void mergeLists(ListNode head1, ListNode head2) {
//         while (head1 != null && head2 != null) {
//             ListNode temp1 = head1.next;
//             ListNode temp2 = head2.next;

//             head1.next = head2;
//             if (temp1 == null) {
//             break;
//             }
//             head2.next = temp1;

//             head1 = temp1;
//             head2 = temp2;
//         }
//     }
// }


class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
        {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        ListNode next=null;
        ListNode prev=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;

        }
        slow.next=null;//ithula first half condition use pannro
        ListNode temp1=head;//second half condition use pannalam to slow equal to null
        ListNode temp2=prev;
        while(temp2!=null)
        {
            ListNode next1=temp1.next;
            ListNode next2=temp2.next;
            temp1.next=temp2;
            temp2.next=next1;
            temp1=next1;
            temp2=next2;
        }
    }
}