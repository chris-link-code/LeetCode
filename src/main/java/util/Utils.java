package util;

import bean.ListNode;

import java.util.Arrays;

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

    /**
     * 十进制转4位二进制
     * 仅作测试使用，不严谨
     */
    public static String integerToBinary(int input) {
        String binaryString = Integer.toBinaryString(input);
        int binaryInt = Integer.parseInt(binaryString);
        return String.format("%04d", binaryInt);
    }

    /**
     * 遍历打印数组
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println("\r");
    }

    /**
     * 复制完整数组
     */
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    /**
     * 交换数组i,j两个位置的数
     */
    public static void swapArray(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
