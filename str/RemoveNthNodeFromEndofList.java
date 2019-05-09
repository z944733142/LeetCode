package algorithms.str;

public class RemoveNthNodeFromEndofList {

    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a1 = head, a2 = head;
        while (--n != 0&& a1.next != null)
        {
            a1 = a1.next;
        }
        while (a1.next != null)
        {
            a1 = a1.next;
            a2 = a2.next;
        }
        if(a2.next == null)
        {
            return null;
        }
       a2.val = a2.next.val;
        a2.next = a2.next.next;
        return head;
    }
}
