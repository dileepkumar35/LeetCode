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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int listNum = 1;
        ListNode tail = head;

        while (tail.next != null) {
            listNum++;
            tail = tail.next;
        }
        tail.next = head;
        int newHeadIndex = listNum - k % listNum;

        for (int i=0; i<newHeadIndex; i++ ) {
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }
}