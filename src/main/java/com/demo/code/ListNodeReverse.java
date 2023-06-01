package com.demo.code;

import com.demo.bean.Node;
import com.demo.util.Utils;

/**
 * @author chris
 * @create 2021/9/17
 * <p>
 * 反转链表
 * LeetCode 206
 * https://leetcode-cn.com/problems/reverse-linked-list/solution/fan-zhuan-lian-biao-by-leetcode-solution-d1k2/
 */
public class ListNodeReverse {
    //private static final Logger LOG = Logger.getLogger(ListNodeReverse.class);

    public static void run() {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Utils.printNode(node1);
        Node node6;
        node6 = reverse(node1);
        //listNode6 = recursion(listNode1);
        Utils.printNode(node6);
    }

    /**
     * 迭代
     * <p>
     * 复杂度分析
     * 时间复杂度：O(n)，其中 n 是链表的长度。需要遍历链表一次
     * 空间复杂度：O(1)
     */
    public static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            /*
             * 必须要引入变量next替代current.next
             * 后面再将next赋值给current.next
             * 由于上面current = head
             * 不能直接修改current的next属性
             * 如果使用current.next = previous
             * head.next也会被改成previous
             *
             * 简言之，A = B，改变对象A的属性
             * B的属性也会随之改变
             */
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * 递归
     * <p>
     * 时间复杂度：O(n)，其中 n 是链表的长度。需要对链表的每个节点进行反转操作
     * 空间复杂度：O(n)，其中 n 是链表的长度。空间复杂度主要取决于递归调用的栈空间，最多为 n 层
     * <p>
     * [1] -> [2] -> [3] -> [4] -> [5]
     * [5] -> [4] -> [3] -> [2] -> [1]
     * <p>
     * "[value] ->"表示一个节点
     * "->"表示next
     * 没有"->"则代表next为null
     * 在本程序中不设置重复节点
     * 任何位置value相同的节点都是同一个节点
     * [1] -> [2] -> [1] 和 [2] -> [1] -> [2]表示同一个环形链表
     * 即[1]、[2]相互指向
     * 互为对方的next
     * <p>
     * 递归就是将一个大的问题拆解成无数个相同的小问题
     * 然后逐个解决
     * 要实现整个链表的反转
     * 可以拆解成N个两个节点的反转
     * 即 node.next.next = node
     * 此时后一个节点就指向了前一个节点
     * 但如此以来两个节点就组成了环形链表
     * 所以同时需要断开node与node.next的指向关系
     * 即 node.next = null
     * <p>
     * 由于反转后node失去与next的指向
     * 通过node找不到next
     * 所以和遍历法反转不同
     * 递归只能从最后面的节点开始反转
     * <p>
     * 递归和遍历相比
     * 空间复杂度更低
     * <p>
     * A a = new A();
     * A c = a;
     * a、c是同一个对象
     * 改变a或c的属性
     * 另一个的属性也会随之改变
     * <p>
     * 所以无论有多少个引用指向同一个对象
     * 它们都是同一个对象
     * 如：
     * ListNode node = new ListNode();
     * ListNode node1 = node;
     * ListNode node2 = node;
     * ListNode node3 = node;
     * node、node1、node2、node3都是同一个的对象
     * <p>
     * 所以程序中始终只有[1]、[2]、[3]、[4]、[5]这五个节点
     * <p>
     * 当 head = [4] 时
     * newNode = head.next = [5]
     * newNode就是head.next这个节点
     * 都是节点[5]
     * 执行
     * head.next.next = head;
     * head.next = null;
     * 后
     * 将[4] -> [5]这两个节点的指向反转了
     * 为[5] -> [4]
     * 所以节点[5]也就是newNode的next为[4]
     * newNode = [5] -> [4]
     * 此时整个链表就是 [1] -> [2] -> [3] -> [4] <- [5]
     * 依次递归后结果为
     * 当 head = [3] 时 [1] -> [2] -> [3] <- [4] <- [5]
     * 当 head = [2] 时 [1] -> [2] <- [3] <- [4] <- [5]
     * 当 head = [1] 时 [1] <- [2] <- [3] <- [4] <- [5]
     * 即
     * [5] -> [4] -> [3] -> [2] -> [1]
     */
    public static Node recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
