package com.demo.code;

import com.demo.util.Utils;

/**
 * @author chris
 * @create 2023/5/31
 */
public class Arrays {
    /**
     * LeetCode 88 合并两个有序数组
     * <p>
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
     * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * <p>
     * 示例 1：
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     */
    public static void run() {
        Integer[] a1 = {1, 2, 3, 0, 0, 0};
        Integer[] a2 = {2, 5, 6};

        Utils.printIntArray(a1);
        Utils.printIntArray(a2);
        mergeTwoArrays(a1, a2);
        Utils.printIntArray(a1);
    }

    private static void mergeTwoArrays(Integer[] a1, Integer[] a2) {
        int m = a1.length;
        int n = a2.length;
        int i1 = 0;
        int i2 = 0;
        while (i1 != m || i2 != n) {
            System.out.println("a1: " + a1[i1]);
            System.out.println("a2: " + a2[i2]);
            if (a1[i1] > a2[i2]) {
                for (int i = (m - 1); i > (i1 - 1); i--) {
                    a1[i] = a1[i - 1];
                }
                a1[i1] = a2[i2];
                i1 += 2;
                i2++;
            } else {
                for (int i = (m - 1); i > i1; i--) {
                    a1[i] = a1[i - 1];
                }
                a1[i1 + 1] = a2[i2];
                i1++;
            }
            Utils.printIntArray(a1);
        }
    }
}
