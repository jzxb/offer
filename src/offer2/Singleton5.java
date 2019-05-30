package offer2;

/**
 * @author lhx
 * @date 2019/5/30 - 22:17
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5(){

    }

    public static Singleton5 getInstance(){
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
