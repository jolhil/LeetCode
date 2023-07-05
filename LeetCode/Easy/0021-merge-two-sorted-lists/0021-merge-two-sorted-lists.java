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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /** Iterative solution.*/
//         ListNode head = new ListNode();
//         ListNode merged = head;
        
//         while (list1 != null && list2 != null) {
//             if (list1.val <= list2.val) {
//                 merged.next = list1;
//                 list1 = list1.next;
//             } else {
//                 merged.next = list2;
//                 list2 = list2.next;
//             }
//             merged = merged.next;
//         }
        
//         if (list1 != null) {
//             merged.next = list1;
//         } else {
//             merged.next = list2;
//         }
        
//         return head.next;
        
        /** Recursive solution.*/
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode merged;
        
        if (list1.val < list2.val) {
            merged = list1;
            merged.next = mergeTwoLists(list1.next, list2);
        } else {
            merged = list2;
            merged.next = mergeTwoLists(list1, list2.next);
        }
        
        return merged;
    }
}