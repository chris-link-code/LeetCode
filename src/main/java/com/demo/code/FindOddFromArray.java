package com.demo.code;

/**
 * @author chris
 * @create 2021/10/2
 * <p>
 * 异或(^)题
 * 从数组中找出出现奇数次的数
 */
public class FindOddFromArray {
    public static void run() {
        oneOddOfArray();
        twoOddOfArray();
    }

    /**
     * 异或(^)题
     * 一个数组中，一个数出现了奇数次，其余的数出现了偶数次，找出出现奇数次的数
     * 要求时间复杂度O(n)，空间复杂度O(1)
     * <p>
     * 解题思路：
     * 利用A ^ A = 0, A ^ 0 = A;
     * 用0遍历异或(^)每一个元素
     * 就可以得到那个出现了奇数次的数
     */
    public static void oneOddOfArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        int number = 0;
        for (int i : array) {
            number = number ^ i;
        }
        System.out.println(number);
    }

    /**
     * 异或(^)题
     * 一个数组中，两个数出现了奇数次，其余的数出现了偶数次，找出出现奇数次的数
     * 要求时间复杂度O(n)，空间复杂度O(1)
     * <p>
     * 解题思路：
     * 既然数组中除了出现奇数次的两个数a、b之外，所有数都出现了偶数次
     * 第一步，用0异或(^)数组中的所有数，可以得到结果数result = a ^ b
     * 第二步，用rightOne = result & (~result + 1)求出数result中最右边的1的位置rightOne
     * 例如：
     * result = 10110100, rightOne = 100
     * result = 11010, rightOne = 10
     * 为什么要求rightOne，因为通过rightOne可以将a和b区分出来
     * 因为result是a异或b的结果，所以result中为1的位置，a和b在这里的值就肯定不一样
     * 第三步，于是用a和b分别和rightOne做“与(&)”操作，得到的结果分别为0和rightOne，这样就把a和b区分开来了
     */
    public static void twoOddOfArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 4, 3, 2, 1};

        /*异或所有元素的结果*/
        int result = 0;
        for (int i : array) {
            result ^= i;
        }

        int rightOne = result & (~result + 1);

        //System.out.println("result : " + result + ", " + Utils.integerToBinary(result));
        //System.out.println("~result : " + ~result + ", " + Integer.toBinaryString(~result));
        //System.out.println("rightOne : " + rightOne + ", " + Utils.integerToBinary(rightOne));
        //System.out.println("result ^ rightOne : " + (result ^ rightOne) + ", " + Utils.integerToBinary(result ^ rightOne));

        int only = 0;
        for (int i : array) {
            if ((i & rightOne) == 0) {
                only ^= i;
            }
        }
        System.out.println(only + "," + (result ^ only));
    }
}
