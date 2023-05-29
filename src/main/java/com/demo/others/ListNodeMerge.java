package com.demo.others;

import com.demo.bean.Node;
import com.demo.util.Utils;

/**
 * @author chris
 * @create 2021/9/24
 * <p>
 * LeetCode 21
 * 合并两个有序链表
 */
public class ListNodeMerge {
    public static void run() {
        Node node7 = new Node(7, null);
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
     * [1] -> [2] -> [5] -> [9]
     * [5] -> [6] -> [7]
     */
    public static Node mergeListNode(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }

        // TODO
        Node pA = headA, pB = headB, p = null;
        while (pA != null || pB != null) {
            if (pA.value < pB.value) {
                p = pA;
            }
        }

        return p;
    }
}
