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
    public ListNode partition(ListNode head, int x) {
        ListNode Left_list = new ListNode(0);
        ListNode Right_list  = new ListNode(0);

        ListNode Left_pointer = Left_list;
        ListNode Right_pointer  = Right_list;

        while(head != null)
        {
            if(head.val < x)
            {
                Left_pointer.next = head;
                Left_pointer = Left_pointer.next;
            }
            else
            {
                Right_pointer.next = head;
                Right_pointer = Right_pointer.next;
            }
            head= head.next;
        }
        Left_pointer.next = Right_list.next;
        Right_pointer.next = null;

        return Left_list.next;
        
    }
}