package testjava;

import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * @author lhx
 * @date 2019/9/3 - 14:35
 */
public class NewInstanceTest {
    
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Persion> clazz = Persion.class;

        //创建对应的运行时类的对象。
        Persion obj = clazz.newInstance();
        System.out.println(obj);
    }
    
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        for (int j = 0; j < 100; j++) {
            int i = new Random().nextInt(3);
            String classPath = "";
            switch (i) {
                case 0:
                    classPath = "java.util.ArrayList";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "testjava.Persion";
                    break;
            }
            Object instance = getInstance(classPath);
            System.out.println(instance);
        }
    }

    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
    
}
