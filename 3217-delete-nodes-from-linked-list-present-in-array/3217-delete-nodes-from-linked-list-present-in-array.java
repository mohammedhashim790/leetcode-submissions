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
    
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> map = new HashSet<Integer>();
        for(int num:nums){
            map.add(num);
        }
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        while(head!=null){
            if(!map.contains(head.val)){
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;

    }
}