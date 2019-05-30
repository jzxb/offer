package offer2;

/**
 * @author lhx
 * @date 2019/5/30 - 21:52
 */
public class Singleton3 {

    public static final Singleton3 INSTANCE;

    static {
        INSTANCE = new Singleton3();
    }

    private Singleton3(){

    }

}
