package algorithms.linklist;

import java.util.List;

/**
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 * 示例 1:
 *
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 *
 * 归并排序
 * @author: shuo
 * @date: 2019/08/14
 */
public class SortList {
    public static void main(String[] args) {
        ListNode l = new ListNode(4);
        l.next = new ListNode(2);
        l.next.next = new ListNode(1);
        l.next.next.next = new ListNode(3);
        SortList s = new SortList();
        s.sortList(l);
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
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

