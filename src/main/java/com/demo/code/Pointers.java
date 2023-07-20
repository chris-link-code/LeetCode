package com.demo.code;

import com.demo.util.Utils;

/**
 * @author chris
 * @create 2023/7/19
 */
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
}