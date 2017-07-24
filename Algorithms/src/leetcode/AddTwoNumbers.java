package leetcode;

/**
 * Created by mayur on 24-07-2017.
 * [2,2,1,5,1,9,1,9,3]
 * [1,7,1,1,7,5,9,1]
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        int[] b = {2, 2, 1, 5, 1, 9, 1, 9, 3};
        int[] c = {1, 7, 1, 1, 7, 5, 9, 1};
        ListNode l1 = new ListNode(b[0]);
        ListNode l2 = new ListNode(c[0]);
        ListNode curr1 = l1, curr2 = l2;
        for (int i = 1; i < b.length; i++) {
            curr1.next = new ListNode(b[i]);
            curr1 = curr1.next;
        }
        for (int i = 1; i < c.length; i++) {
            curr2.next = new ListNode(c[i]);
            curr2 = curr2.next;
        }
        ListNode d = a.addTwoNumbers(l1, l2);
        while (d != null) {
            System.out.println(" -> " + d.val);
            d = d.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head;
        int sum, rem;
        sum = (l1.val + l2.val) % 10;
        rem = (l1.val + l2.val) / 10;
        head = new ListNode(sum);
        ListNode curr = head;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            sum = (rem + l1.val + l2.val) % 10;
            rem = (rem + l1.val + l2.val) / 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = (rem + l1.val) % 10;
            rem = (rem + l1.val) / 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = (rem + l2.val) % 10;
            rem = (rem + l2.val) / 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            l2 = l2.next;
        }
        if (rem != 0) {
            curr.next = new ListNode(rem);
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}