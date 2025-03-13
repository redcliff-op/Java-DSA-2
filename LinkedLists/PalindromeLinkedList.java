package LinkedLists;

public class PalindromeLinkedList {

  // Brute Force

  public boolean isPalindrome(ListNode head) {
    StringBuilder str = new StringBuilder("");
    ListNode temp = head;
    while (temp != null) {
      str.append(temp.val);
      temp = temp.next;
    }
    int l = 0;
    int r = str.length() - 1;
    while (l < r) {
      if (str.charAt(l) != str.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }

  // Better

  public boolean isPalindrome2(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode head1 = head;
    ListNode head2 = reverseList(slow);
    while (head1 != null) {
      if (head1.val != head2.val) {
        return false;
      }
      head1 = head1.next;
      head2 = head2.next;
    }
    return true;
  }

  // Helper function

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }
    ListNode newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }
}
