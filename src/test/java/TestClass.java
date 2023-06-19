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
public class TestClass {

    public static void arrayTest() {
        int[] array = new int[]{1, 8, 6, 9, 4, 7, 3, 2, 5};
        Utils.printArray(array);
        int[] arrayB = Utils.copyArray(array);
        Arrays.sort(array);
        Utils.printArray(arrayB);
        Utils.printArray(array);
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
}
