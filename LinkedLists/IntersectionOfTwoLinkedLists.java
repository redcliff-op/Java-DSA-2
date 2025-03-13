package LinkedLists;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {

  // Brute Force

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode temp = headA;
    HashSet<ListNode> set = new HashSet<ListNode>();
    while(temp!=null){
      set.add(temp);
      temp = temp.next;
    }
    temp = headB;
    while(temp!=null){
      if(set.contains(temp)){
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }

  // Better

  public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
    ListNode tempA = headA;
    ListNode tempB = headB;
    while (tempA != tempB) {
      if (tempA == null) {
        tempA = headB;
      } else {
        tempA = tempA.next;
      }
      if (tempB == null) {
        tempB = headA;
      } else {
        tempB = tempB.next;
      }
    }
    return tempA;
  }
}
