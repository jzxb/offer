package offer2;

/**
 * @author lhx
 * @date 2019/5/30 - 21:20
 *饿汉式
 *  在类初始化直接创建实例对象，不管是否需要这个对象
 * 1、构造器私有化
 * 2、自行创建，并且用静态变量保存
 * 3、向外提供这个实例
 * 4、强调这是一个单利，可以用final修饰
 */
public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }
}
