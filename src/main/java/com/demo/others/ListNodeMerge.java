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

        Node head = new Node(-1);
        Node p = head;
        while (headA != null && headB != null) {
            if (headA.value < headB.value) {
                p.next = headA;
                headA = headA.next;
            } else {
                p.next = headB;
                headB = headB.next;
            }
            p = p.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        if (headA != null) {
            p.next = headA;
        }
        if (headB != null) {
            p.next = headB;
        }

        return head.next;
    }

    // TODO LeetCode 88
}
