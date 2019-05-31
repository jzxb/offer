package offer3;

/**
 * @author lhx
 * @date 2019/5/31 - 16:08
 *
 * 父类的初始化<clinit>;
 * (1)j = method();
 * (2)父类的静态代码块
 *
 * 父类的实例化方法：（2、3按实际代码顺序）
 *  * (1)super()（最前）
 *  * (2)i = test();
 *  * (3)父类的非静态代码块
 *  * (4)父类的无参构造（最后）
 *
 *  非静态方法前面有一个默认对象this
 *  this在构造器（或<init>中表示正在创建的对象，因为这里是在创建Son对象，所以
 *  test()执行的是子类重写的test()方法
 *
 *  这里i = test()执行的是子类重写的test()方法
 */
public class Father {

    private int i = test();
    private static int j = method();

    static {
        System.out.print("(1)");
    }

    Father(){
        System.out.print("(2)");
    }

    {
        System.out.print("(3)");
    }

    public int test(){
        System.out.print("(4)");
        return 1;
    }

    public static int method(){
        System.out.print("(5)");
        return 1;
    }

}