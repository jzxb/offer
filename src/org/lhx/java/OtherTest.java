package org.lhx.java;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author lhx
 * @date 2019/9/5 - 11:38
 */
public class OtherTest {

    @Test
    public void test1(){
        Class clazz = Persion.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("***********************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    @Test
    public void test2(){
        //获取运行时类的父类
        Class clazz = Persion.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    public void test3(){
        //获取运行时类带泛型的父类
        Class clazz = Persion.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    @Test
    public void test4(){
        //获取运行时类带泛型的父类的泛型
        Class clazz = Persion.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());
    }

    @Test
    public void test5(){
        //获取运行时类实现的接口
        Class clazz = Persion.class;
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

    @Test
    public void test6(){
        //获取运行时类所在的包
        Class clazz = Persion.class;
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

    @Test
    public void test7(){
        //获取运行时类注解
        Class clazz = Persion.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

}
