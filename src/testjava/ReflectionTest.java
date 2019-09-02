package testjava;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lhx
 * @date 2019/9/2 - 14:58
 */
public class ReflectionTest {

    @Test
    public void test1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Persion> aClass = Persion.class;
        //通过反射创建对象
        Constructor<Persion> constructor = aClass.getConstructor(String.class, int.class);
        Persion persion = constructor.newInstance("Tom", 12);
        System.out.println(persion.toString());
        //通过反射，调用指定的属性和方法
        //调用属性
        Field age = aClass.getDeclaredField("age");
        age.set(persion, 10);
        System.out.println(persion.toString());
        //调用方法
        Method show = aClass.getDeclaredMethod("show");
        show.invoke(persion);

        //通过反射，可以调用类的私有结构
        //调用私有构造器
        Constructor<Persion> c1 = aClass.getDeclaredConstructor(String.class);
        c1.setAccessible(true);
        Persion p1 = c1.newInstance("Jerry");
        System.out.println(p1.toString());
        //调用私有属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "hehe");
        System.out.println(p1.toString());
        //调用私有方法
        Method showNation = aClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "haha");
        System.out.println(nation);
    }

    /**
     * 获取Class实例的方式
     */
    @Test
    public void test2() throws ClassNotFoundException {
        //方式一:调用运行时类的属性.class
        Class<Persion> clazz1 = Persion.class;
        System.out.println(clazz1);

        //方式二：通过运行时类的对象，调用getClass()
        Persion p1 = new Persion();
        Class<? extends Persion> clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三：调用Class静态方法
        Class<?> clazz3 = Class.forName("testjava.Persion");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz2 == clazz3);

        //方式四：使用类的加载器
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("testjava.Persion");
        System.out.println(clazz4);
        System.out.println(clazz1 == clazz4);
    }

}
