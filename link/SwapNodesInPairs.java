package algorithms.link;


import algorithms.link.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null )
        {
            return null;
        }
        if(head.next == null)
        {
            return head;
        }
        ListNode first = head, second = head.next, pre = head;
        head = head.next;
        while (first.next != null)
        {
            first.next = second.next;
            second.next = first;
            pre = first;
            first = first.next;
            if(first != null && first.next != null) {
                second = first.next;
                pre.next = second;

            }else
            {
                break;
            }
        }
        return head;
    }
}
