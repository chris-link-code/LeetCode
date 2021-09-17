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
        LOG.info("");
        ListNode listNode = reverse(listNode1);
        printNode(listNode);
    }

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
             * 简言之，A = B，改变A的属性，B的属性同样也会随之改变
             */
            nextNode = previousNode;
            previousNode = head;
            head = head.next;
            currentNode.next = nextNode;
        }
        return currentNode;
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
