package com.demo.code;

import com.demo.util.Utils;

import java.util.ArrayList;
import java.util.List;

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

    public static void removeDuplicate() {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Utils.printIntArray(array);
        int result = removeDuplicate(array);
        System.out.println("result: " + result);
        Utils.printIntArray(array);
    }

    public static void removeDuplicates() {
//        int[] array = {1, 1, 1, 2, 2, 3};
        int[] array = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        Utils.printIntArray(array);
        int result = removeDuplicates(array);
        System.out.println("result: " + result);
        Utils.printIntArray(array);
    }

    public static void majorityElement() {
//        int[] array = {3,2,3};
//        int[] array = {2, 2, 1, 1, 1, 2, 2};
        int[] array = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 7, 7, 7, 7};
        Utils.printIntArray(array);
        int majority = majorityElement(array);
        System.out.println("majority: " + majority);
    }

    public static void kidsWithCandies() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        Utils.printIntArray(candies);
        System.out.println("extraCandies: " + extraCandies);
        List<Boolean> list = kidsWithCandies(candies, extraCandies);
        for (Boolean bool : list) {
            System.out.print(bool + "\t");
        }
    }

    public static void canPlaceFlowers() {
        //1,0,0,0,1
        //1,0,0,0,0,0,1
        //1,0,0,0,0,0,0,0,1
        int[] flower = {1, 0, 0, 0, 0, 0, 1};
        int n = 2;
        Utils.printIntArray(flower);
        System.out.println("n: " + n);
        boolean canPlace = canPlaceFlowers(flower, n);
        System.out.println("can place: " + canPlace);
    }


    /**
     * 88. 合并两个有序数组
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
     * 27. 移除元素
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
     * 26. 删除有序数组中的重复项
     * 给你一个 升序排列 的数组 nums ，请你原地删除重复出现的元素，
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
        if (array == null || array.length == 0) {
            return 0;
        }
        int length = array.length;
        int slow = 0;
        int fast = 1;
        // 由于是有序数组，只要相邻的数字不相等，则说明其唯一
        while (fast < length) {
            if (array[slow] != array[fast]) {
                array[slow + 1] = array[fast];
                slow++;
            }
            fast++;
        }
        return slow + 1;
    }

    /**
     * 80. 删除有序数组中的重复项 II
     * 给你一个有序数组 nums ，请你原地删除重复出现的元素，使得出现次数超过两次的元素只出现两次，
     * 返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * 说明：
     * 为什么返回数值是整数，但输出的答案是数组呢？
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * 你可以想象内部操作如下:
     * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
     * int len = removeDuplicates(nums);
     * // 在函数里修改输入数组对于调用者是可见的。
     * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     * 示例 1：
     * 输入：nums = [1,1,1,2,2,3]
     * 输出：5, nums = [1,1,2,2,3]
     * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
     * 不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,1,2,3,3]
     * 输出：7, nums = [0,0,1,1,2,3,3]
     * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
     * 不需要考虑数组中超出新长度后面的元素。
     */
    private static int removeDuplicates(int[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        if (array.length < 3) {
            return length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < length) {
//            System.out.println("slow [" + slow + "]: " + array[slow] + "\t" +
//                    "fast [" + fast + "]: " + array[fast]);
            if (array[slow - 2] != array[fast]) {
                array[slow] = array[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    /**
     * 169. 多数元素
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。
     * 多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * 示例 1：
     * 输入：nums = [3,2,3]
     * 输出：3
     * 示例 2：
     * 输入：nums = [2,2,1,1,1,2,2]
     * 输出：2
     */
    private static int majorityElement(int[] array) {
        int count = 0;
        Integer candidate = null;
        System.out.println("number\tcandidate\tcount");
        for (int number : array) {
            if (count == 0) {
                candidate = number;
            }
            count += (number == candidate) ? 1 : -1;
            System.out.println(number + "\t" + candidate + "\t" + count);
        }
        return candidate;
    }

    /**
     * 1431. 拥有最多糖果的孩子
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第i个孩子拥有的糖果数目。
     * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，
     * 此孩子有最多的糖果。注意，允许有多个孩子同时拥有最多的糖果数目。
     * 示例 1：
     * 输入：candies = [2,3,5,1,3], extraCandies = 3
     * 输出：[true,true,true,false,true]
     * 解释：
     * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，
     * 他将成为拥有最多糖果的孩子。
     * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
     * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
     * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     * 示例 2：
     * 输入：candies = [4,2,1,1,2], extraCandies = 1
     * 输出：[true,false,false,false,false]
     * 解释：只有 1 个额外糖果，所以不管额外糖果给谁，只有孩子 1 可以成为拥有糖果最多的孩子。
     * 示例 3：
     * 输入：candies = [12,1,12], extraCandies = 10
     * 输出：[true,false,true]
     */
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        int length = candies.length;
        for (int i = 0; i < length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < length; i++) {
            list.add((candies[i] + extraCandies) < max ? false : true);
        }
        return list;
    }

    /**
     * 605. 种花问题
     * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。
     * 可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     * 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，
     * 其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？
     * 能则返回 true ，不能则返回 false 。
     * 示例 1：
     * 输入：flowerbed = [1,0,0,0,1], n = 1
     * 输出：true
     * 示例 2：
     * 输入：flowerbed = [1,0,0,0,1], n = 2
     * 输出：false
     */
    private static boolean canPlaceFlowers(int[] flower, int n) {
        int max = 0;
        int length = flower.length;
        int i = 0;
        while (i < length) {
            if (max >= n) {
                return true;
            }
            /*
             * https://leetcode.cn/problems/can-place-flowers/solutions/542634/fei-chang-jian-dan-de-tiao-ge-zi-jie-fa-nhzwc/
             * 由题目可以得知一个重要前提：1的左右肯定都是0
             *
             * 所以只需处理以下两种不同的情况即可：
             * 1. 当遍历到 [index] 是1时，说明这个位置有花，那么 [index - 1] 和 [index + 1] 肯定都是0，
             * 而且如果要在下一个位置种花，那必然是 [index + 2] 的位置才有可能，
             * 因此，当碰到 [index] 是1时，直接跳过下一格 [index + 1]，直接判断 [index + 2] 即可。
             *
             * 2. 当遍历到 [index] 是0时，由于每次碰到1都是跳两格，因此前一格必定是0，
             * 此时只需要判断下一格 [index + 1] 是不是1,即可得出 [index] 这一格能不能种花，
             * 如果能种，然后这个位置就按照遇到1时处理，即跳两格
             * 如果 [index] 的后一格 [index + 1] 是1，说明 [index] 这个位置不能种花，
             * 且之后两格 [index + 1] 和 [index + 2] 也不可能种花，直接跳过3格。
             */
            if (flower[i] == 1) {
                i += 2;
            } else if (i == length - 1 || flower[i + 1] == 0) {
                i += 2;
                max++;
            } else {
                i += 3;
            }
        }
        return max < n ? false : true;
    }
}
