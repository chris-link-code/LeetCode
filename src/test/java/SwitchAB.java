import java.util.Scanner;

/**
 * @author chris
 * @create 2021/9/27
 * <p>
 * 交换AB两个数
 */
public class SwitchAB {
    public static void main(String[] args) {
        //testValue();
        switchValue();
    }

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

