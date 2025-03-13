package LinkedLists;

import java.util.HashSet;

public class DetectLoopHead {

  // Brute Force

  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    HashSet<ListNode> set = new HashSet<ListNode>();
    ListNode temp = head;
    while(temp!=null){
      if (set.contains(temp)) {
        return temp;
      }
      set.add(temp);
      temp = temp.next;
    }
    return null;
  }

  // Optimal

  public ListNode detectCycle2(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        slow = head;
        while (slow != fast) {
          fast = fast.next;
          slow = slow.next;
        }
        return slow;
      }
    }
    return null;
  }
}
