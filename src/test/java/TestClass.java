/**
 * @author chris
 * @create 2021/9/19
 */
public class TestClass {
    public static void main(String[] args) {
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

        /**
         * 得出结论：
         * 用 = 赋值的对象其实就是同一个对象
         * 如：
         * Person tom = new Person("Tom", 15);
         * Person jerry = tom;
         * 改变其中任何一个对象的属性
         * 另一个的属性也会随之改变
         * */
    }
}
