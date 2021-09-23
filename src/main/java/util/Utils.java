package util;

import bean.ListNode;

/**
 * @author chris
 * @create 2021/9/22
 */
public class Utils {
    /**
     * 遍历打印链表
     */
    public static void printNode(ListNode node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println("\r");
    }
}
