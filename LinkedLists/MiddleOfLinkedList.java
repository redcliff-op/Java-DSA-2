package LinkedLists;

public class MiddleOfLinkedList {
  public ListNode middleNode(ListNode head) {
    int count = -1;
    ListNode temp = head;
    while(temp!=null){
      temp = temp.next;
      count++;
    }
    temp = head;
    while(count>0){
      count-=2;
      temp = temp.next;
    }
    return temp;
  }
}