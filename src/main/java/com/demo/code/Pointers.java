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
        moveZero(array);
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
        int length = array.length;
        if (length < 2) {
            return;
        }
        int left = 0;
        int right = 0;
        while (left < length && right < length) {
            Utils.printIntArray(array);
            while (array[left] != 0) {
                left++;
            }
            while (left >= right || array[right] == 0) {
                right++;
            }
            Utils.swapArray(array, left, right);
        }
    }
}
