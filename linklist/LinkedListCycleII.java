package algorithms.linklist;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 * @author: shuo
 * @date: 2019/08/06
 */
public class LinkedListCycleII {
      static class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public static void main(String[] args) {
        LinkedListCycleII l = new LinkedListCycleII();
        ListNode n = new ListNode(3);
        ListNode n1 = new ListNode(2);
        n.next = n;


        l.detectCycle(n);
    }
    public ListNode detectCycle(ListNode head) {
         ListNode pre = head, current = head;
         while (pre != null && current != null)
         {
             pre = pre.next;
             current = current.next;
             if(current != null)
             {
                 current = current.next;
             }
             if(pre == current)
             {
                 current = head;
                 while (current != pre)
                 {
                     current = current.next;
                     pre = pre.next;
                 }
                 break;
             }
         }
         return current ==  pre ? current : null;
    }
}
