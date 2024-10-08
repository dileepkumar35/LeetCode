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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head, newHead = null;

        while (fast != null && fast.next != null) {
          fast = fast.next.next;
          ListNode next = head.next;
          head.next = newHead;
          newHead = head;
          head = next; 
        }

        if (fast != null) head = head.next;

        while (newHead != null && head != null) {
          if (newHead.val != head.val) return false;
          newHead = newHead.next;
          head = head.next;
        }
        return true;
    }
}