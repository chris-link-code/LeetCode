import com.demo.bean.Node;
import com.demo.bean.Person;
import com.demo.util.Utils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author chris
 * @create 2021/9/19
 * <p>
 * 得出结论：
 * 用 = 赋值的对象其实就是同一个对象
 * 如：
 * Person tom = new Person("Tom", 15);
 * Person jerry = tom;
 * 改变其中任何一个对象的属性
 * 另一个的属性也会随之改变
 */
public class TestDemo {

    public static void arrayTest() {
        int[] array = new int[]{1, 8, 6, 9, 4, 7, 3, 2, 5};
        Utils.printIntArray(array);
        int[] arrayB = Utils.copyArray(array);
        Arrays.sort(array);
        Utils.printIntArray(arrayB);
        Utils.printIntArray(array);
    }

    public static void objectTest() {
        Person tom = new Person("Tom", 15);
        Person jerry = tom;
        //Person jerry = new Person("Jerry",16);

        System.out.println("\r\nBefore modify");
        System.out.println("Tom: " + tom.name + " - " + tom.age);
        System.out.println("Jerry: " + jerry.name + " - " + jerry.age);

        tom.name = "Tomato";
        tom.age = 17;
        System.out.println("\nModify tom");
        System.out.println("Tom: " + tom.name + " - " + tom.age);
        System.out.println("Jerry: " + jerry.name + " - " + jerry.age);

        jerry.name = "Jerry";
        jerry.age = 19;
        System.out.println("\nModify jerry");
        System.out.println("Tom: " + tom.name + " - " + tom.age);
        System.out.println("Jerry: " + jerry.name + " - " + jerry.age);
    }

    @Test
    public void nodeTest() {
        Node n1 = new Node(1);
        Node p = n1;
        n1.value = 3;
        Node n2 = new Node(2);
        p = n2;
        System.out.println("n1.value: " + n1.value);
        System.out.println("p.value: " + p.value);
    }

    @Test
    public void remainder() {
        System.out.println("6 % 8 = " + (6 % 8));
        System.out.println("8 % 6 = " + (8 % 6));
    }

    @Test
    public void reverseCharArray() {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Utils.printCharArray(array);
        Utils.reverseCharArray(array, 1, 5);
        Utils.printCharArray(array);
    }

    @Test
    public void charTest() {
        System.out.println((char) 0);
        System.out.println(0);
        System.out.println('0');
        System.out.println((char) 3);
        System.out.println(3);
        System.out.println('3');
    }

    @Test
    public void intTest() {
        int a = 3;
        int b = a;
        a -= 2;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    /**
     * 打印ASCII表
     * 标准ASCII 码也叫基础ASCII码，使用7 位二进制数（剩下的1位二进制为0）来表示所有的大写和小写字母，
     * 数字0 到9、标点符号，以及在美式英语中使用的特殊控制字符。
     * 其中：
     * 0～31及127(共33个)是控制字符或通信专用字符（其余为可显示字符）
     * 如控制符：LF(换行)、CR(回车)、FF(换页)、DEL(删除)、BS(退格)、BEL(响铃)等；
     * 通信专用字符：SOH（文头）、EOT（文尾）、ACK（确认）等；
     * ASCII值为8、9、10 和13 分别转换为退格、制表、换行和回车字符。
     * 它们并没有特定的图形显示，但会依不同的应用程序，而对文本显示有不同的影响。
     * 32～126(共95个)是字符(32是空格)，其中48～57为0到9十个阿拉伯数字。
     * 65～90为26个大写英文字母，97～122号为26个小写英文字母，其余为一些标点符号、运算符号等。
     */
    public void ascii() {
        int count = 0;
        for (int i = 32; i < 127; i++) {
            System.out.printf("%3c", i);
            count++;
            // 每行打印10个
            if (count % 10 == 0) {
                System.out.println("\n");
            }
        }
        System.out.println("\n");
    }
}
