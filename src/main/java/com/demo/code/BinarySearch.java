package com.demo.code;

import com.demo.util.Utils;

/**
 * @author chris
 * @create 2021/10/12
 */
public class BinarySearch {
    public static void run() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 21, 25};
        Utils.printIntArray(array);
        System.out.println(search(array, 19));
    }

    /**
     * LeetCode 704
     * Binary Search
     * 利用二分法从有序数组中查找某一元素位置
     * <p>
     * 复杂度分析
     * 时间复杂度：O(logn)，其中n是数组的长度
     * 空间复杂度：O(1)
     */
    public static int search(int[] array, int target) {
        if (array == null || array.length < 1) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int middle;
        while (start <= end) {
            middle = ((end - start) / 2) + start;
            if (target < array[middle]) {
                end = middle - 1;
            } else if (target > array[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
