package com.demo;

import com.demo.bean.ListNode;
import com.demo.util.Utils;

/**
 * @author chris
 * @create 2021/9/24
 * <p>
 * LeetCode 21
 * 合并两个有序链表
 */
public class ListNodeMerge {
    public static void main(String[] args) {
        ListNode listNode7 = new ListNode(7, null);
        ListNode listNode6 = new ListNode(6, listNode7);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(9, null);
        ListNode listNode3 = new ListNode(5, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        Utils.printNode(listNode1);
        Utils.printNode(listNode5);
        ListNode node = mergeListNode(listNode1, listNode5);
        Utils.printNode(node);
    }

    /**
     * [1] -> [2] -> [5] -> [9]
     * [5] -> [6] -> [7]
     */
    public static ListNode mergeListNode(ListNode headA, ListNode headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }

        ListNode pA = headA, pB = headB, p = null;
        while (pA != null || pB != null) {
            if (pA.value < pB.value) {
                p = pA;
            }
        }


        return p;
    }
}
