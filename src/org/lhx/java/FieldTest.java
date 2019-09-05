package org.lhx.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author lhx
 * @date 2019/9/5 - 9:17
 *
 * 获取当前运行时类的属性结构
 */
public class FieldTest {
    
    @Test
    public void test1(){
        Class clazz = Persion.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("***************************************");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }
    
    @Test
    public void test2(){
        Class clazz = Persion.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
            //权限修饰符
            int modifier = field.getModifiers();
            System.out.println(modifier);
            System.out.println(Modifier.toString(modifier));
            //数据类型
            Class<?> type = field.getType();
            System.out.println(type);
            //变量名
            String name = field.getName();
            System.out.println(name);
        }
    }
    
}
