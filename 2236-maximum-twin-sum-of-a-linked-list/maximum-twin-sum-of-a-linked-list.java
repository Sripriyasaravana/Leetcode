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
    public int pairSum(ListNode head) {
    ListNode midNode = reverseList(Mid(head)); 
        ListNode startNode = head;
        int maxSum = Integer.MIN_VALUE;
        while(startNode != null && midNode != null){
            int currentSum = startNode.val + midNode.val;
            maxSum = Math.max(maxSum, currentSum);
            startNode = startNode.next;
            midNode = midNode.next;
        }
        return maxSum;
    }
    public ListNode Mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
        return head;
    } 
    }      
    
    
//  ListNode reverseLinkedList(ListNode head){
//         if(head == null){
//             return head;
//         }
//         ListNode previousNode = null;
//         ListNode currentNode = head;
//         ListNode nextNode = head.next;

//         while(currentNode != null){
//             currentNode.next = previousNode;
//             previousNode = currentNode;
//             currentNode = nextNode;
//             if(nextNode != null){
//                 nextNode = nextNode.next;
//             }
//         }
//         head = previousNode;
//         return head;
//     }
// }
