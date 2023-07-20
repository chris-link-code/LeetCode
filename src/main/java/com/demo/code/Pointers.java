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
        //https://leetcode.cn/problems/move-zeroes/solution/dong-hua-yan-shi-283yi-dong-ling-by-wang_ni_ma/
        if (array == null) {
            return;
        }
        int length = array.length;
        if (length < 2) {
            return;
        }
        int left = 0;
        int right = 0;
        // [0] -> [1] -> [0] -> [3] -> [12]
        //第一次遍历，将非零的值赋值给零
        while (right < length) {
            Utils.printIntArray(array);
            if (array[right] != 0) {
                array[left] = array[right];
                left++;
            }
            right++;
        }
        //第二次遍历把末尾的元素都赋为零
        while (left < length) {
            array[left] = 0;
            left++;
        }
    }
    //Utils.swapArray(array, left, right);


    // https://leetcode.cn/problems/move-zeroes/solution/yi-dong-ling-by-leetcode-solution/
    private static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
}


class Solution1 {

}


class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }

    // 优化
    public void moveZero(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                // 其实优化的地方就是避免了数组开头是非零元素的交换也就是阻止（i==j）时交换。
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}

// 官方
class Solution2 {
    public void moveZeroes(int[] nums) {
        int length = nums.length, left = 0, right = 0;
        while (right < length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}