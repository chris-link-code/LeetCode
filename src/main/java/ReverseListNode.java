import bean.ListNode;
import org.apache.log4j.Logger;

/**
 * @author chris
 * <p>
 * 反转链表
 */
public class ReverseListNode {
    private static final Logger LOG = Logger.getLogger(ReverseListNode.class);

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        printNode(listNode1);
        LOG.info("\r\n");

        ListNode listNode6 = null;
        //listNode6 = reverse(listNode1);
        listNode6 = recursion(listNode1);
        printNode(listNode6);
    }

    /**
     * 遍历并反转链表
     */
    public static ListNode reverse(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = null;
        ListNode nextNode;

        while (head != null) {
            currentNode = head;
            /*
             * 必须要引入变量nextNode替代currentNode.next
             * 后面再将nextNode赋值给currentNode.next
             * 由于上面currentNode = head
             * 不能直接修改currentNode的next属性
             * 如果使用currentNode.next = previousNode
             * head.next也会被改成previousNode
             *
             * 简言之，A = B，改变对象A的属性
             * B的属性也会随之改变
             */
            nextNode = previousNode;
            previousNode = head;
            head = head.next;
            currentNode.next = nextNode;
        }
        return currentNode;
    }

    /**
     * 通过递归反转链表
     * [1] -> [2] -> [3] -> [4] -> [5]
     * [5] -> [4] -> [3] -> [2] -> [1]
     *
     * "[value] ->"表示一个节点
     * "->"表示next
     * 没有"->"则代表next为null
     * 在本程序中不设置重复节点
     * 任何位置value相同的节点都是同一个节点
     * [1] -> [2] -> [1] 和 [2] -> [1] -> [2]表示同一个环形链表
     * 即[1]、[2]相互指向
     * 互为对方的next
     *
     * 递归就是将一个大的问题拆解成无数个相同的小问题
     * 然后逐个解决
     * 要实现整个链表的反转
     * 可以拆解成N个两个节点的反转
     * 即 node.next.next = node
     * 此时后一个节点就指向了前一个节点
     * 但如此以来两个节点就组成了环形链表
     * 所以同时需要断开node与node.next的指向关系
     * 即 node.next = null
     *
     * 由于反转后node失去与next的指向
     * 通过node找不到next
     * 所以和遍历法反转不同
     * 递归只能从最后面的节点开始反转
     *
     * 递归和遍历相比
     * 空间复杂度更低
     *
     * A a = new A();
     * A c = a;
     * a、c是同一个对象
     * 改变a或c的属性
     * 另一个的属性也会随之改变
     *
     * 所以无论有多少个引用指向同一个对象
     * 它们都是同一个对象
     * 如：
     *  ListNode node = new ListNode();
     *  ListNode node1 = node;
     *  ListNode node2 = node;
     *  ListNode node3 = node;
     * node、node1、node2、node3都是同一个的对象
     *
     * 所以程序中始终只有[1]、[2]、[3]、[4]、[5]这五个节点
     *
     * 当 head = [4] 时
     * newNode = head.next = [5]
     * newNode就是head.next这个节点
     * 都是节点[5]
     * 执行
     *  head.next.next = head;
     *  head.next = null;
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
    public static ListNode recursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    /**
     * 遍历打印链表
     */
    public static void printNode(ListNode node) {
        while (node != null) {
            LOG.info(node.value);
            node = node.next;
        }
    }
}
