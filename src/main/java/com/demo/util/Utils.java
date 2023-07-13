package com.demo.util;

import com.demo.bean.Node;

import java.util.Arrays;

/**
 * @author chris
 * @create 2021/9/22
 */
public class Utils {
    /**
     * 遍历打印链表
     */
    public static void printNode(Node node) {
        while (node != null) {
            System.out.print("[");
            System.out.print(node.value);
            System.out.print("]");
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\r");
    }

    /**
     * 打印整形数组
     */
    public static void printIntArray(int[] array) {
        int length = (array == null) ? 0 : array.length;
        for (int i = 0; i < length; i++) {
            System.out.print("[");
            System.out.print(array[i]);
            System.out.print("]");
            if (i != (length - 1)) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\r");
    }

    /**
     * 打印字节数组
     */
    public static void printCharArray(char[] array) {
        int length = (array == null) ? 0 : array.length;
        for (int i = 0; i < length; i++) {
            System.out.print("[");
            System.out.print(array[i]);
            System.out.print("]");
            if (i != (length - 1)) {
                System.out.print(" -> ");
            }
        }
        System.out.println("\r");
    }

    /**
     * 交换数组元素
     *
     * @param array
     * @param i
     * @param j
     * @param <T>
     */
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 判断字符是否为元音字母
     *
     * @param c
     * @return
     */
    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (String.valueOf(vowel).toLowerCase().equals(String.valueOf(c))) {
                return true;
            }
        }
        return false;
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
     * 复制完整数组
     */
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    /**
     * 交换数组i,j两个位置的数
     */
    public static void swapArray(int[] array, int i, int j) {
        if (i != j) {
            array[i] = array[i] + array[j];
            array[j] = array[i] - array[j];
            array[i] = array[i] - array[j];
        }
    }

    public static void reverseCharArray(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
