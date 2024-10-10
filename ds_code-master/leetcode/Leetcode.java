/**
 * ClassName: Leetcode
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author jieHFUT
 * @Create 2024/10/11 0:08
 * @Version 1.0
 */
public class Leetcode {

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        int count1 = 1;
        int count2 = 1;
        while(l1.next != null) {
            num1 = num1 + count1 * l1.val;
            l1 = l1.next;
            count1 = 10 * count1;
        }

        while(l2.next != null) {
            num2 = num2 + count2 * l2.val;
            l2 = l2.next;
            count2 = 10 * count2;
        }

        int result = num1 + num2;

        ListNode node = new ListNode(result % 10);
        result = result / 10;

        while(result != 0) {
            node.next = new ListNode(result % 10);
            result = result / 10;
        }
        return node;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;


        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(7);
        ListNode l7 = new ListNode(1);
        l5.next = l6;
        l6.next = l7;

        ListNode result = addTwoNumbers(l1, l5);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }
}
