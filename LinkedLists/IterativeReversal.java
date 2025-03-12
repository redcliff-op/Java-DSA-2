package LinkedLists;

public class IterativeReversal {
  public ListNode reverseList(ListNode head) {
    if(head == null){
      return null;
    }
    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
      ListNode nxt = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;
    }
    return prev;
  }
}
