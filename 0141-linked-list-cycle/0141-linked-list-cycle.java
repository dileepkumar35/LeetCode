/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
      HashSet<ListNode> visitedNodes = new HashSet<>();
      ListNode currentNode = head;

      while (currentNode != null) {
        if(visitedNodes.contains(currentNode)) {
          return true;
        }
        visitedNodes.add(currentNode);
        currentNode = currentNode.next;
      }
    return false;
    }
}

 /* 
 // TWO POINTER
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
*/

    //     while(slow != fast) {
    //         if(fast == null || fast.next == null)
    //             return false;
    //         slow = slow.next;
    //         fast = fast.next.next;

    //     }
    //     return true;
    // }