import java.util.Scanner;

/**
 * @author chris
 * @create 2021/9/27
 * <p>
 * 异或(^)
 */
public class OR {
    public static void main(String[] args) {
        testValue();
        //switchValue();
    }

    /**
     * 交换两个数
     */
    public static void switchValue() {
        while (true) {
            System.out.println("请输入两个数A和B");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("A = " + a + "," + "B = " + b);
            System.out.println("互换");

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            /*a = a + b;
            b = a - b;
            a = a - b;*/
            System.out.println("A = " + a + "," + "B = " + b);
        }
    }

    /**
     * 异或(^)测试
     * 异或运算满足交换律和结合律
     * A ^ 0 = A
     * A ^ 1 = 取反
     * A ^ A = 0
     */
    public static void testValue() {
        while (true) {
            System.out.println("请输入一个数A");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("A ^ 0 = " + (a ^ 0) + "," + "0 ^ A = " + (0 ^ a));
            System.out.println("A ^ 1 = " + (a ^ 1) + "," + "1 ^ A = " + (1 ^ a));
            System.out.println("A ^ A = " + (a ^ a));
        }
    }


}

