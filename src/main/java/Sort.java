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
        int[] array = new int[]{1, 8, 6, 9, 4, 7, 3, 2, 5};
        Utils.printArray(array);
        int[] arrayB = Utils.copyArray(array);
        //Arrays.sort(array);
        bubbleSort(array);
        Utils.printArray(arrayB);
        Utils.printArray(array);
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                if (array[i] < array[j]) {
                    Utils.swapArray(array, i, j);
                }
            }
        }
    }
}
