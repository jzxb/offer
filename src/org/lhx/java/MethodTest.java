package org.lhx.java;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author lhx
 * @date 2019/9/5 - 10:01
 *
 * 获取运行时类的方法结构
 */
public class MethodTest {

    @Test
    public void test1(){
        Class clazz = Persion.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("*******************************");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
    
}
