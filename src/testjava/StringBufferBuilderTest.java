package testjava;

import org.junit.Test;

/**
 * @author lhx
 * @date 2019/8/19 - 10:05
 */
public class StringBufferBuilderTest {
    
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }
    
    @Test
    public void test2(){
        StringBuilder s1 = new StringBuilder("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);
//        s1.delete(2,4);
//        s1.replace(2, 4, "hello");
//        s1.insert(2, false);
//        s1.reverse();
        String s = s1.substring(1, 3);
        System.out.println(s1);
        System.out.println(s);
    }
    
}
