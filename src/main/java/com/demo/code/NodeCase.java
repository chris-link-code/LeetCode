package com.demo.code;

import com.demo.bean.Node;
import com.demo.util.Utils;


public class NodeCase {

    public static void getIntersectionNode() {
        Node node7 = new Node(7, null);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node6);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Utils.printNode(node1);
        Utils.printNode(node4);
        Node node = getIntersectionNode(node1, node4);
        Utils.printNode(node);
    }

    public static void addTwoNumbers() {
        Node node3 = new Node(5, null);
        Node node2 = new Node(4, node3);
        Node node1 = new Node(2, node2);

        Node node8 = new Node(4, null);
        Node node7 = new Node(9, node8);
        Node node6 = new Node(4, node7);
        Node node5 = new Node(6, node6);
        Node node4 = new Node(5, node5);

        Utils.printNode(node1);
        Utils.printNode(node4);
        Node node = addTwoNumbers(node1, node4);
        Utils.printNode(node);
    }

    public static void mergeListNode() {
        Node node9 = new Node(13, null);
        Node node8 = new Node(11, node9);
        Node node7 = new Node(7, node8);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(9, null);
        Node node3 = new Node(5, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Utils.printNode(node1);
        Utils.printNode(node5);
        Node node = mergeListNode(node1, node5);
        Utils.printNode(node);
    }

    /**
     * @author chris
     * @create 2022/4/29
     * LeetCode 2 两数相加
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     */
    private static Node addTwoNumbers(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        Node head = new Node(-1);
        Node p = head;
        int v1 = 0;
        int v2 = 0;
        int v = 0;
        int carry = 0;
        while (n1 != null || n2 != null) {
            v1 = (n1 == null) ? 0 : n1.value;
            v2 = (n2 == null) ? 0 : n2.value;
            v = v1 + v2 + carry;
            if (v > 9) {
                v = v % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            p.next = new Node(v);
            p = p.next;
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }
        if (carry == 1) {
            p.next = new Node(1);
        }
        return head.next;
    }

    /**
     * @author chris
     * @create 2021/9/24
     * <p>
     * LeetCode 21
     * 合并两个有序链表
     * [1] -> [2] -> [5] -> [9]
     * [5] -> [6] -> [7]
     */
    private static Node mergeListNode(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }

        Node head = new Node(-1);
        Node p = head;
        while (n1 != null && n2 != null) {
            if (n1.value < n2.value) {
                p.next = n1;
                n1 = n1.next;
            } else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        if (n1 != null) {
            p.next = n1;
        }
        if (n2 != null) {
            p.next = n2;
        }

        return head.next;
    }

    /**
     * @author chris
     * @create 2021/9/23
     * <p>
     * 找出两个链表的交点
     * LeetCode 160
     * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/xiang-jiao-lian-biao-by-leetcode-solutio-a8jn/
     * <p>
     * 双指针
     * 复杂度分析
     * 时间复杂度：O(m+n)，其中 m 和 n 是分别是链表 n1 和 n2 的长度
     * 两个指针同时遍历两个链表，每个指针遍历两个链表各一次
     * 空间复杂度：O(1)
     */
    private static Node getIntersectionNode(Node n1, Node n2) {
        if (n1 == null || n2 == null) {
            return null;
        }
        Node pA = n1, pB = n2;
        while (pA != pB) {
            pA = (pA == null) ? n2 : pA.next;
            pB = (pB == null) ? n1 : pB.next;
        }
        return pA;
    }
}
