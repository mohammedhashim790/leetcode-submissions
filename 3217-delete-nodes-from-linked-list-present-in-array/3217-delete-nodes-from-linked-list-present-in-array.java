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
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        while(head!=null){
            if(map.getOrDefault(head.val, -1)==-1){
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;

    }
}