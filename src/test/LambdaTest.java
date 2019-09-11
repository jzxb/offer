package test;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author lhx
 * @date 2019/9/11 - 9:56
 */
public class LambdaTest {
    
    @Test
    public void test1(){
        //无参，无返回值
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("发撒哈拉");
            }
        };
        r1.run();

        System.out.println("*******************************");

        Runnable r2 = () -> System.out.println("wr");
        r2.run();
    }
    
    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        System.out.println("**********************");
        //Lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);

        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

        System.out.println("**********************");
        //方法引用
        Comparator<Integer> com3 = Integer::compare;

        int compare3 = com3.compare(32, 21);
        System.out.println(compare3);
    }
    
    @Test
    public void test3(){
        //Lambda需要一个参数，但是没有返回值
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("hhh");
        Consumer<String> con2 = (String s) -> System.out.println(s);
        con2.accept("hehehe");
    }

    @Test
    public void test4(){
        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("hehehe");
    }

    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(12, 21));

        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 2));
    }
    
    @Test
    public void test6(){
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 2));
    }

}
