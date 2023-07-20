package com.demo.code;

import com.demo.util.Utils;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chris
 * @create 2023/7/19
 */
@Slf4j
public class Pointers {
    public static void moveZero() {
        /*
         * 输入: nums = [0,1,0,3,12]
         * 输出: [1,3,12,0,0]
         * 输入: nums = [0]
         * 输出: [0]
         */
        int[] array = {0, 1, 0, 3, 12};
        Utils.printIntArray(array);
//        moveZero(array);
        moveZeroes(array);
        Utils.printIntArray(array);
    }

    public static void isSubsequence() {
        /*
         * 输入：s = "abc", t = "ahbgdc"
         * 输出：true
         * 输入：s = "axc", t = "ahbgdc"
         * 输出：false
         */
//        String s = "abc", t = "ahbgdc";
        String s = "axc", t = "ahbgdc";
        log.info("s: {}", s);
        log.info("t: {}", t);
        boolean subsequence = isSubsequence(s, t);
        log.info("subsequence: {}", subsequence);
    }

    /**
     * 283. 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意，必须在不复制数组的情况下原地对数组进行操作。
     * 示例 1:
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 示例 2:
     * 输入: nums = [0]
     * 输出: [0]
     */
    private static void moveZero(int[] array) {
        // https://leetcode.cn/problems/move-zeroes/solution/dong-hua-yan-shi-283yi-dong-ling-by-wang_ni_ma/
        int length;
        if (array == null || (length = array.length) < 2) {
            return;
        }
        int left = 0;
        int right = 0;
        //第一次遍历，将非零的值赋值给零
        while (right < length) {
//            System.out.println("left: " + left);
//            System.out.println("right: " + right);
//            Utils.printIntArray(array);
            if (array[right] != 0) {
                if (right > left) {
                    array[left] = array[right];
                }
                left++;
            }
            right++;
        }
        //第二次遍历，把末尾的元素都赋值为零
        while (left < length) {
            array[left] = 0;
            left++;
        }
    }

    /**
     * 此方法只需遍历一次即可
     */
    private static void moveZeroes(int[] array) {
        int length;
        if (array == null || (length = array.length) == 0) {
            return;
        }
        int left = 0;
        int right = 0;
        while (right < length) {
//            System.out.println("left: " + left);
//            System.out.println("right: " + right);
//            Utils.printIntArray(array);
            if (array[right] != 0) {
                if (left < right) {
                    array[left] = array[right];
                    array[right] = 0;
                }
                left++;
            }
            right++;
        }
    }

    /**
     * 392. 判断子序列
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
     * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * 进阶：
     * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。
     * 在这种情况下，你会怎样改变代码？
     * 示例 1：
     * 输入：s = "abc", t = "ahbgdc"
     * 输出：true
     * 示例 2：
     * 输入：s = "axc", t = "ahbgdc"
     * 输出：false
     */
    private static boolean isSubsequence(String s, String t) {
        // 时间复杂度：O(n+m)
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;
    }
    // TODO 动态规划
    // https://leetcode.cn/problems/is-subsequence/solution/pan-duan-zi-xu-lie-by-leetcode-solution/
    // https://www.cnblogs.com/arknights/articles/13387155.html
}