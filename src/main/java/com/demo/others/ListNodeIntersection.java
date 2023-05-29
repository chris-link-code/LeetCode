package com.demo.others;

import com.demo.bean.Node;
import com.demo.util.Utils;

/**
 * @author chris
 * @create 2021/9/23
 * <p>
 * 找出两个链表的交点
 * LeetCode 160
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/xiang-jiao-lian-biao-by-leetcode-solutio-a8jn/
 */
public class ListNodeIntersection {
    public static void run() {
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

    /**
     * 双指针
     * 复杂度分析
     * 时间复杂度：O(m+n)，其中 m 和 n 是分别是链表 headA 和 headB 的长度
     * 两个指针同时遍历两个链表，每个指针遍历两个链表各一次
     * 空间复杂度：O(1)
     */
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node pA = headA, pB = headB;
        while (pA != pB) {
            pA = (pA == null ? headB : pA.next);
            pB = (pB == null ? headA : pB.next);
        }
        return pA;
    }
}
