package com.demo.code;

import com.demo.util.Utils;

/**
 * @author chris
 * @create 2023/5/31
 */
public class Arrays {

    public static void mergeTwoArrays() {
        int[] a1 = {1, 2, 3, 0, 0, 0};
        int[] a2 = {2, 5, 6};

        Utils.printIntArray(a1);
        Utils.printIntArray(a2);
        mergeTwoArrays(a1, 3, a2, 3);
        Utils.printIntArray(a1);
    }

    public static void removeElement() {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int value = 2;
        Utils.printIntArray(array);
        int length = removeElement(array, value);
        System.out.println("length: " + length);
        Utils.printIntArray(array);
    }

    public static void removeDuplicates() {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Utils.printIntArray(array);
        int result = removeDuplicates(array);
        System.out.println("result: " + result);
        Utils.printIntArray(array);
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
    private static void mergeTwoArrays(int[] a1, int m, int[] a2, int n) {
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

    /**
     * LeetCode 27 移除元素
     * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
     * 并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * 说明:
     * 为什么返回数值是整数，但输出的答案是数组呢?
     * 请注意，输入数组是以引用方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * 你可以想象内部操作如下:
     * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
     * int len = removeElement(nums, val);
     * // 在函数里修改输入数组对于调用者是可见的。
     * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     * <p>
     * 示例 1：
     * 输入：nums = [3,2,2,3], val = 3
     * 输出：2, nums = [2,2]
     * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
     * 你不需要考虑数组中超出新长度后面的元素。
     * 例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，
     * 也会被视作正确答案。
     * 示例 2：
     * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
     * 输出：5, nums = [0,1,4,0,3]
     * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
     * 注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
     */
    private static int removeElement(int[] array, int value) {
        int length = array.length;
        int index = 0;
        while (index < length) {
            if (array[index] == value) {
                array[index] = array[length - 1];
                length--;
            } else {
                index++;
            }
        }
        return length;
    }

    /**
     * LeetCode 26 删除有序数组中的重复项
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，
     * 使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     * 然后返回 nums 中唯一元素的个数。
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，
     * 并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k 。
     * 判题标准:
     * 系统会用下面的代码来测试你的题解:
     * int[] nums = [...]; // 输入数组
     * int[] expectedNums = [...]; // 长度正确的期望答案
     * int k = removeDuplicates(nums); // 调用
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     * assert nums[i] == expectedNums[i];
     * }
     * 如果所有断言都通过，那么您的题解将被 通过。
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。
     * 不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * 解释：函数应该返回新的长度 5 ，并且原数组nums的前五个元素被修改为 0, 1, 2, 3, 4。
     * 不需要考虑数组中超出新长度后面的元素。
     */
    private static int removeDuplicate(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int length = array.length;
        int result = length;
        int left = 0;
        int right = 1;
        // 由于是有序数组，只要相邻的数字不相等，则说明其唯一
        while (right < length) {
            //
        }
        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            System.out.println("slow [" + slow + "]: " + nums[slow]);
            System.out.println("fast [" + fast + "]: " + nums[fast]);
            System.out.println("");
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
