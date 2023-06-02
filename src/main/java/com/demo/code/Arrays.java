package com.demo.code;

import com.demo.util.Utils;

/**
 * @author chris
 * @create 2023/5/31
 */
public class Arrays {

    public static void mergeTwoArrays() {
        Integer[] a1 = {1, 2, 3, 0, 0, 0};
        Integer[] a2 = {2, 5, 6};

        Utils.printIntArray(a1);
        Utils.printIntArray(a2);
        mergeTwoArrays(a1, 3, a2, 3);
        Utils.printIntArray(a1);
    }

    /**
     * LeetCode 88 合并两个有序数组
     * <p>
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
     * 分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
     * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，
     * 后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * <p>
     * 示例 1：
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     */
    private static void mergeTwoArrays(Integer[] a1, int m, Integer[] a2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int current = 0;
        int tail = m + n - 1;
        while ((i1 > -1) || (i2 > -1)) {
            if (i1 == -1) {
                current = a2[i2];
                i2--;
            } else if (i2 == -1) {
                current = a1[i1];
                i1--;
            } else if (a1[i1] > a2[i2]) {
                current = a1[i1];
                i1--;
            } else {
                current = a2[i2];
                i2--;
            }
            a1[tail] = current;
            tail--;
        }
    }
}
