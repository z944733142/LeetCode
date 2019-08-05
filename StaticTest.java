package algorithms;

/**
 * @author shuo
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Test2.a);
        System.out.println(Test2.a1);
    }

}
class   Test2 {
    public static int a = 0;

    public static Test2 test2 = new Test2();

    public Test2() {
        a++;
        a1++;
        System.out.println(a);
        System.out.println(a1);
    }
    public static int a1 = 0;

    public static Test2 getInstance()
    {
        return test2;
    }
}


