package algorithms.linklist;

/**
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 *
 * 要求返回这个链表的深拷贝。
 * @author: shuo
 * @date: 2019/08/14
 */
public class CopyListwithRandomPointer {

    public Node copyRandomList(Node head) {
        if(head == null)
        {
            return null;
        }
        Node pre = head;
        Node head2 ;
        Node current = null;
        while (pre != null)
        {
            current = new Node();
            current.val = pre.val;
            current.next = pre.next;
            pre.next = current;
            pre = current.next;
        }
        pre = head;
        while (pre != null)
        {
            current = pre.next;
            if(pre.random != null) {
                current.random = pre.random.next;
            }
            pre = current.next;
        }
        pre = head;
        head2 = pre.next;
        while (pre != null)
        {
            current = pre.next;
            pre.next = current.next;
            if(pre.next == null)
            {
                break;
            }
            current.next = pre.next.next;
            pre = pre.next;
        }
        return head2;
    }
}


class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};