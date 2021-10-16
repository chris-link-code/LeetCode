import org.junit.jupiter.api.Test;
import util.Utils;

import java.util.Arrays;

/**
 * @author chris
 * @create 2021/10/4
 * <p>
 * 排序
 */
public class Sort {

    @Test
    public void run() {
        int[] array = new int[]{5, 7, 2, 6, 1, 9, 4, 3, 8};
//        int[] array = new int[]{1, 3, 2, 4};
        //int[] ascendArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Utils.printArray(array);
        //int[] arrayB = Utils.copyArray(array);
        //Arrays.sort(array);
        array = quickSort(array);
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
    public int[] bubbleSort(int[] array) {
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
    public int[] betterBubbleSort(int[] array) {
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
     * 过程简单描述：找到最小的元素下沉
     * 首先，找到数组中最小的那个元素，
     * 其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
     * 其次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
     * 如此往复，直到将整个数组排序。这种方法我们称之为选择排序
     * <p>
     * 性质：1、时间复杂度：O(n^2) 2、空间复杂度：O(1) 3、非稳定排序 4、原地排序
     */
    public int[] selectionSort(int[] array) {
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
            Utils.swapArray(array, i, min);
        }
        return array;
    }

    /**
     * 希尔排序可以说是插入排序的一种变种。
     * 无论是插入排序还是冒泡排序，如果数组的最大值刚好是在第一位，要将它挪到正确的位置就需要 n - 1 次移动。
     * 也就是说，原数组的一个元素如果距离它正确的位置很远的话，
     * 则需要与相邻元素交换很多次才能到达正确的位置，这样是相对比较花时间了
     * <p>
     * 希尔排序就是为了加快速度简单地改进了插入排序，交换不相邻的元素以对数组的局部进行排序。
     * <p>
     * 希尔排序的思想是采用插入排序的方法，先让数组中任意间隔为 h 的元素有序，
     * 刚开始 h 的大小可以是 h = n / 2,接着让 h = n / 4，让 h 一直缩小，
     * 当 h = 1 时，也就是此时数组中任意间隔为1的元素有序，此时的数组就是有序的了
     */
    public int[] shellSort(int[] array) {
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
     * 我们在玩打牌的时候，你是怎么整理那些牌的呢？一种简单的方法就是一张一张的来，将每一张牌插入到其他已经有序的牌中的适当位置。
     * 当我们给无序数组做排序的时候，为了要插入元素，我们需要腾出空间，将其余所有元素在插入之前都向右移动一位，这种算法我们称之为插入排序。
     * 过程简单描述：
     * 1、从数组第2个元素开始抽取元素。
     * 2、把它与左边第一个元素比较，如果左边第一个元素比它大，则继续与左边第二个元素比较下去，直到遇到不比它大的元素，然后插到这个元素的右边。
     * 3、继续选取第3，4，....n个元素,重复步骤 2 ，选择适当的位置插入。
     */
    public int[] insertionSort(int[] array) {
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
     * 将一个大的无序数组有序，我们可以把大的数组分成两个，然后对这两个数组分别进行排序，之后在把这两个数组合并成一个有序的数组。
     * 由于两个小的数组都是有序的，所以在合并的时候是很快的。
     * <p>
     * 通过递归的方式将大的数组一直分割，直到数组的大小为 1，此时只有一个元素，那么该数组就是有序的了，
     * 之后再把两个数组大小为1的合并成一个大小为2的，再把两个大小为2的合并成4的 ..... 直到全部小的数组合并起来
     */
    public int[] mergeSort(int[] array) {
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
     * 快速排序
     * 快速排序的最坏运行情况是 O(n²)，比如说顺序数列的快排。
     * 但它的平摊期望时间是 O(nlogn)，且 O(nlogn) 记号中隐含的常数因子很小，比复杂度稳定等于 O(nlogn) 的归并排序要小很多。
     * 所以，对绝大多数顺序性较弱的随机数列而言，快速排序总是优于归并排序
     * <p>
     * 算法步骤
     * 从数列中挑出一个元素，称为 "基准"（pivot）
     * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
     * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序
     */
    public int[] quickSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        partition(array, 0, array.length - 1);
        return array;
    }

    public void partition(int[] array, int left, int right) {
        if (array == null || array.length < 2 || left >= right) {
            return;
        }

        int[] a = Arrays.copyOfRange(array, left, right + 1);
        Utils.printArray(a);

        int pivot = left;
        int low = left;
        int high = right;
        low++;
        while (low < high) {
            while (low < high && array[high] >= array[pivot]) {
                high--;
            }
            while (low < high && array[low] <= array[pivot]) {
                low++;
            }
            Utils.swapArray(array, low, high);
        }
        if (array[high] < array[pivot]) {
            Utils.swapArray(array, pivot, high);
            pivot = high;
        } else {
            Utils.swapArray(array, pivot, high - 1);
            pivot = high - 1;
        }

        System.out.println("LEFT [" + left + "]: " + array[left]);
        System.out.println("RIGHT [" + right + "]: " + array[right]);
        System.out.println("LOW [" + low + "]: " + array[low]);
        System.out.println("HIGH [" + high + "]: " + array[high]);
        System.out.println("PIVOT [" + pivot + "]: " + array[pivot]);
        Utils.printArray(array);
        System.out.println();

        partition(array, left, pivot - 1);
        partition(array, pivot + 1, right);
    }

}
