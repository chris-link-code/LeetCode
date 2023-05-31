package com.demo.others;

import com.demo.bean.Node;
import com.demo.util.Utils;

/**
 * @author chris
 * @create 2022/4/29
 * LeetCode 2
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void run() {
        Node node3 = new Node(3, null);
        Node node2 = new Node(4, node3);
        Node node1 = new Node(2, node2);

        //ListNode ListNode7 = new ListNode(4, null);
        //ListNode ListNode6 = new ListNode(9, ListNode7);
        Node node6 = new Node(4, null);
        Node node5 = new Node(6, node6);
        Node node4 = new Node(5, node5);

        Utils.printNode(node1);
        Utils.printNode(node4);
        Utils.printNode(addTwoNumbers(node1, node4));
    }

    // TODO
    private static Node addTwoNumbers(Node n1, Node n2) {
        int carry = 0;
        Node head = null;
        Node tail = null;
        while (n1 != null || n2 != null) {
            int i1 = n1 != null ? n1.value : 0;
            int i2 = n2 != null ? n2.value : 0;
            if (head == null) {
                head = tail = new Node((i1 + i2) % 10 + carry, null);
            }
            tail = new Node((i1 + i2) % 10 + carry, tail);
            carry = (i1 + i2) / 10;
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }
        if (carry > 0) {
            tail.next = new Node(carry, null);
        }
        return head;
    }
}
