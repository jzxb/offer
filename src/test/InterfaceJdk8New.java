package test;

/**
 * @author lhx
 * @date 2019/9/11 - 9:20
 */
public interface InterfaceJdk8New {
    static void method1() {
        System.out.println("static method1");
    }

    default void method2() {
        System.out.println("static method1");
    }
}
