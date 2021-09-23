import bean.ListNode;

/**
 * @author chris
 * @create 2021/9/23
 *
 * 找出两个链表的交点
 * LeetCode 160
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/xiang-jiao-lian-biao-by-leetcode-solutio-a8jn/
 */
public class ListNodeIntersection {

    /**
     * 双指针
     * 复杂度分析
     * 时间复杂度：O(m+n)，其中 m 和 n 是分别是链表 headA 和 headB 的长度
     * 两个指针同时遍历两个链表，每个指针遍历两个链表各一次
     * 空间复杂度：O(1)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = (pA == null ? headB : pA.next);
            pB = (pB == null ? headA : pB.next);
        }
        return pA;
    }
}
