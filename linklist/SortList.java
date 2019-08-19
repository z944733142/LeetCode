package algorithms.linklist;

import java.util.List;

/**
 * @author: shuo
 * @date: 2019/08/14
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow;
        slow = slow.next;
        temp.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(slow);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (l != null && r != null)
        {
            if(l.val < r.val)
            {
                h.next = l;
                l = l.next;
            }else
            {
                h.next = r;
                r = r.next;
            }
            h = h.next;
        }
        h.next = l == null ? r : l;
        return res.next;
    }



}

