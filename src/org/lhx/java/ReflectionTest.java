package org.lhx.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lhx
 * @date 2019/9/5 - 14:19
 *
 * 调用运行时类中指定的结构
 */
public class ReflectionTest {
    
    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Persion> clazz = Persion.class;
        Persion persion = clazz.newInstance();
        //获取指定的属性,只能获取public
        Field id = clazz.getField("id");
        //设置当前属性值
        id.set(persion, 101);
        int pId = (int) id.get(persion);
        System.out.println(pId);
    }
    
    @Test
    public void testField1() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Persion> clazz = Persion.class;
        Persion persion = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        //保证当前属性可访问
        name.setAccessible(true);
        name.set(persion, "Tom");
        System.out.println(name.get(persion));
    }

    @Test
    public void testMethod() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Persion> clazz = Persion.class;
        Persion persion = clazz.newInstance();

        //获取指定的某个方法
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object invoke = show.invoke(persion, "算法");
        System.out.println(invoke);
        System.out.println("************************");
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        showDesc.invoke(Persion.class);
    }
    
}
