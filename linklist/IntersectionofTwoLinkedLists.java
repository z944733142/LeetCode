package algorithms.linklist;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * 如下面的两个链表：
 * <p>
 * intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 *
 *  也可用双指针
 * @author: shuo
 * @date: 2019/08/21
 */
public class IntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0, b = 0, l;
        ListNode current = headA, current2 = headB;
        while (current != null) {
            a++;
            current = current.next;
        }
        current = headB;
        while (current != null) {
            b++;
            current = current.next;
        }
        if (a > b) {
            l = a - b;
            current = headA;
            current2 = headB;
        } else {
            l = b - a;
            current = headB;
            current2 = headA;
        }
        while (l-- != 0)
        {
            current = current.next;
        }
        while (current != null)
        {
            System.out.println(current.val + " " + current2.val);
            if(current == current2)
            {
                return current;
            }
            current = current.next;
            current2 = current2.next;
        }
        return null;
    }
}

