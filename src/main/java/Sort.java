import util.Utils;

import java.util.Arrays;

/**
 * @author chris
 * @create 2021/10/4
 * <p>
 * 排序
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 9, 4, 7, 3, 2, 1};
        //int[] ascendArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Utils.printArray(array);
        //int[] arrayB = Utils.copyArray(array);
        //Arrays.sort(array);
        array = selectionSort(array);
        //Utils.printArray(arrayB);
        Utils.printArray(array);
    }

    /**
     * 冒泡排序
     * 把第一个元素与第二个元素比较，如果第一个比第二个大，则交换他们的位置。接着继续比较第二个与第三个元素，如果第二个比第三个大，则交换他们的位置....
     * 我们对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样一趟比较交换下来之后，排在最右的元素就会是最大的数。
     * 除去最右的元素，我们对剩余的元素做同样的工作，如此重复下去，直到排序完成
     * <p>
     * 性质：1、时间复杂度：O(n^2) 2、空间复杂度：O(1) 3、稳定排序 4、原地排序
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Utils.swapArray(array, j, j + 1);
                }
            }
        }
        return array;
    }

    /**
     * 优化冒泡排序
     * 假如从开始的第一对到结尾的最后一对，相邻的元素之间都没有发生交换的操作，
     * 这意味着右边的元素总是大于等于左边的元素，此时的数组已经是有序的了，我们无需再对剩余的元素重复比较下去了
     */
    public static int[] betterBubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    Utils.swapArray(array, j, j + 1);
                }
            }
            if (flag) {
                // System.out.println("第 " + (i + 1) + " 轮后结束排序");
                break;
            }
        }
        return array;
    }

    /**
     * 选择排序
     * 过程简单描述： 首先，找到数组中最小的那个元素，
     * 其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
     * 其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
     * 如此往复，直到将整个数组排序。这种方法我们称之为选择排序
     * <p>
     * 性质：1、时间复杂度：O(n^2) 2、空间复杂度：O(1) 3、非稳定排序 4、原地排序
     */
    public static int[] selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (i != min) {
                Utils.swapArray(array, i, min);
            }
        }
        return array;
    }

    /**
     * 希尔排序可以说是插入排序的一种变种。无论是插入排序还是冒泡排序，如果数组的最大值刚好是在第一位，要将它挪到正确的位置就需要 n - 1 次移动。
     * 也就是说，原数组的一个元素如果距离它正确的位置很远的话，则需要与相邻元素交换很多次才能到达正确的位置，这样是相对比较花时间了。
     * <p>
     * 希尔排序就是为了加快速度简单地改进了插入排序，交换不相邻的元素以对数组的局部进行排序。
     * <p>
     * 希尔排序的思想是采用插入排序的方法，先让数组中任意间隔为 h 的元素有序，
     * 刚开始 h 的大小可以是 h = n / 2,接着让 h = n / 4，让 h 一直缩小，
     * 当 h = 1 时，也就是此时数组中任意间隔为1的元素有序，此时的数组就是有序的了
     */
    public static int[] shellSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*if (array[j] > array[j + 1]) {
                    Utils.swapArray(array, j, j + 1);
                }*/
            }
        }
        return array;
    }

    /**
     * 插入排序
     */
    public static int[] insertionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*if (array[j] > array[j + 1]) {
                    Utils.swapArray(array, j, j + 1);
                }*/
            }
        }
        return array;
    }

    /**
     * 归并排序
     * 将一个大的无序数组有序，我们可以把大的数组分成两个，然后对这两个数组分别进行排序，之后在把这两个数组合并成一个有序的数组。由于两个小的数组都是有序的，所以在合并的时候是很快的。
     * <p>
     * 通过递归的方式将大的数组一直分割，直到数组的大小为 1，此时只有一个元素，那么该数组就是有序的了，之后再把两个数组大小为1的合并成一个大小为2的，再把两个大小为2的合并成4的 ..... 直到全部小的数组合并起来
     */
    public static int[] mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*if (array[j] > array[j + 1]) {
                    Utils.swapArray(array, j, j + 1);
                }*/
            }
        }
        return array;
    }


}
