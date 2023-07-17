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

    public static void productExceptSelf() {
        /*
         * 输入: nums = [1,2,3,4]
         * 输出: [24,12,8,6]
         * 示例 2:
         * 输入: nums = [-1,1,0,-3,3]
         * 输出: [0,0,9,0,0]
         */
//        int[] array = {1, 2, 3, 4};
        int[] array = {-1, 1, 0, -3, 3};
        Utils.printIntArray(array);
        int[] answer = productExceptSelf(array);
        Utils.printIntArray(answer);
    }

    public static void increasingTriplet() {
        /*
         * 输入：nums = [1,2,3,4,5]
         * 输出：true
         * 输入：nums = [5,4,3,2,1]
         * 输出：false
         * 输入：nums = [2,1,5,0,4,6]
         * 输出：true
         */
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array = {5, 4, 3, 2, 1};
        int[] array = {2, 1, 5, 0, 4, 6};
        Utils.printIntArray(array);
        boolean increase = increasingTriplet(array);
        System.out.println(increase);
    }

    public static void compress() {
        /*
         * 输入：chars = ["a","a","b","b","c","c","c"]
         * 输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
         * 输入：chars = ["a"]
         * 输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
         * 输入：chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
         * 输出：返回 4 ，输入数组的前 4 个字符应该是：["a","b","1","2"]。
         */
        char[] array = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        Utils.printCharArray(array);
        int count = compress(array);
        System.out.println(count);
        Utils.printCharArray(array);
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
        int candidate = -1;
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

    /**
     * 238. 除自身以外数组的乘积
     * 给你一个整数数组nums，返回数组answer，其中answer[i]等于nums中除nums[i]之外其余各元素的乘积。
     * 示例 1:
     * 输入: nums = [1,2,3,4]
     * 输出: [24,12,8,6]
     * 示例 2:
     * 输入: nums = [-1,1,0,-3,3]
     * 输出: [0,0,9,0,0]
     */
    private static int[] productExceptSelf(int[] array) {
        int length = array.length;
        int[] answer = new int[length];

        // answer[i] 表示索引 i 左侧所有元素的乘积
        // 因为索引为 '0' 的元素左侧没有元素， 所以 answer[0] = 1
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = array[i - 1] * answer[i - 1];
        }

        // right 为右侧所有元素的乘积
        // 刚开始右边没有元素，所以 right = 1
        int right = 1;
        for (int i = length - 1; i > -1; i--) {
            // 对于索引 i，左边的乘积为 answer[i]，右边的乘积为 right
            answer[i] *= right;
            // right 需要包含右边所有的乘积，所以计算下一个结果时需要将当前值乘到 right 上
            right *= array[i];
        }
        return answer;
    }

    /**
     * 334. 递增的三元子序列
     * 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
     * 如果存在这样的三元组下标 (i, j, k) 且满足i < j < k，
     * 使得 nums[i] < nums[j] < nums[k]，
     * 返回 true ；否则，返回 false 。
     * 示例 1：
     * 输入：nums = [1,2,3,4,5]
     * 输出：true
     * 解释：任何 i < j < k 的三元组都满足题意
     * 示例 2：
     * 输入：nums = [5,4,3,2,1]
     * 输出：false
     * 解释：不存在满足题意的三元组
     * 示例 3：
     * 输入：nums = [2,1,5,0,4,6]
     * 输出：true
     * 解释：三元组 (3, 4, 5) 满足题意，
     * 因为 nums[3] == 0 < nums[4] == 4 < nums[5] == 6
     */
    private static boolean increasingTriplet(int[] array) {
        // 上一轮循环是否为升序
        boolean last = false;
        int i = 1;
        int length = array.length;
        if (length < 3) {
            return false;
        }
        while (i < length) {
            if (array[i - 1] < array[i]) {
                if (last) {
                    return true;
                }
                last = true;
            } else {
                last = false;
            }
            i++;
        }
        return false;
    }

    /**
     * 一个字符数组 chars ，请使用下述算法压缩：
     * 从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：
     * 如果这一组长度为 1 ，则将字符追加到 s 中。
     * 否则，需要向 s 追加字符，后跟这一组的长度。
     * 压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。需要注意的是，
     * 如果组长度为 10 或 10 以上，则在 chars 数组中会被拆分为多个字符。
     * 请在修改完输入数组后返回该数组的新长度。
     * 你必须设计并实现一个只使用常量额外空间的算法来解决此问题。
     * 示例 1：
     * 输入：chars = ["a","a","b","b","c","c","c"]
     * 输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
     * 解释："aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
     * 示例 2：
     * 输入：chars = ["a"]
     * 输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
     * 解释：唯一的组是“a”，它保持未压缩，因为它是一个字符。
     * 示例 3：
     * 输入：chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * 输出：返回 4 ，输入数组的前 4 个字符应该是：["a","b","1","2"]。
     * 解释：由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
     * <p>
     * 思路和算法：
     * 为了实现原地压缩，我们可以使用双指针分别标志我们在字符串中读和写的位置。
     * 每次当读指针 read 移动到某一段连续相同子串的最右侧，
     * 我们就在写指针 write 处依次写入该子串对应的字符和子串长度即可。
     * 在实际代码中，当读指针 read 位于字符串的末尾，
     * 或读指针 read 指向的字符不同于下一个字符时，
     * 我们就认为读指针 read 位于某一段连续相同子串的最右侧。
     * 该子串对应的字符即为读指针 read 指向的字符串。
     * 我们使用变量 left 记录该子串的最左侧的位置，
     * 这样子串长度即为 read − left + 1 。
     * 特别地，为了达到 O(1) 空间复杂度，
     * 我们需要自行实现将数字转化为字符串写入到原字符串的功能。
     * 这里我们采用短除法将子串长度倒序写入原字符串中，然后再将其反转即可。
     */
    private static int compress(char[] array) {
        int length = array.length;
        if (length < 2) {
            return length;
        }
        // 相同字符的字符串最左边
        int left = 0;
        int write = 0;
        // 相同字符的数量
        int count = 0;
        for (int read = 0; read < length; read++) {
            if (read == length - 1 || array[read] != array[read + 1]) {
                count = read - left + 1;
                array[write] = array[read];
                write++;
                left = write;
                // 此时read在相同字符的字符串最右边
                // TODO 数字转化成字符串
                /*while (count > 0) {
                    if (count > 9) {
                        array[write] = (char) (count % 10 + '0');
                    }else {
                        array[write] = (char) (count % 10 + '0');
                    }
                }*/
            }
        }
        return write + 1;
    }
}


class Solution {
    public int compress(char[] chars) {
        int length = chars.length;
        int write = 0, left = 0;
        for (int read = 0; read < length; read++) {
            if (read == length - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int count = read - left + 1;
                if (count > 1) {
                    int anchor = write;
                    while (count > 0) {
                        // 将num转换成char
                        chars[write++] = (char) (count % 10 + '0');
                        count /= 10;
                    }
                    reverse(chars, anchor, write - 1);
                }
                left = read + 1;
            }
        }
        return write;
    }

    public void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}