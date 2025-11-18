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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        ListNode fast = temp;

        ListNode slow = head;
        while(n>0){
            slow = slow.next;
            n--;
        }
        while(slow!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = fast.next.next;
        return temp.next;
    }
}