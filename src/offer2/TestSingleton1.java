package offer2;

/**
 * @author lhx
 * @date 2019/5/30 - 21:44
 */
public class TestSingleton1 {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println(singleton1);
    }

}
