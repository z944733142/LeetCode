package algorithms;

import java.math.BigDecimal;

class ListNode {
    int val;ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l2.next = new ListNode(4);
        l1 = new AddTwoNumbers().addTwoNumbers(l1, l2);
        while (l1 != null)
        {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = new String();
        String s2 = new String();
        BigDecimal bigDecimal1 = null;
        BigDecimal bigDecimal2 = null;
        ListNode current = l1;
        ListNode pre = null;
        ListNode head = null;
        while(current != null)
        {
            s1 = ((Integer)current.val).toString().concat(s1);
            current = current.next;
        }
        current = l2;
        while(current != null)
        {
            s2 = ((Integer)current.val).toString().concat(s2);
            current = current.next;
        }
        bigDecimal1 = new BigDecimal(s1);
        bigDecimal2 = new BigDecimal(s2);
        bigDecimal1 = bigDecimal1.add(bigDecimal2);
        if (bigDecimal1.compareTo(new BigDecimal("0")) == 0)
        {
            return new ListNode(0);
        }
        while(bigDecimal1.compareTo(new BigDecimal("0")) != 0)
        {
            if (head == null) {
                current = new ListNode(bigDecimal1.remainder(new BigDecimal("10")).intValue());
                head = current;
                pre = current;
            }
            else
            {
                current = new ListNode(bigDecimal1.remainder(new BigDecimal("10")).intValue());
                pre.next = current;
                pre = current;
            }
            bigDecimal1 = bigDecimal1.divideToIntegralValue(new BigDecimal("10"));
        }
        return head;
    }
}

