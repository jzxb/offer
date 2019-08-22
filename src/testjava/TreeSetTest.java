package testjava;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lhx
 * @date 2019/8/21 - 16:14
 */
public class TreeSetTest {
    
    @Test
    public void test1(){
        Set<Integer> set = new TreeSet<>();
        //不能添加不同类型的对象
//        set.add(123);
//        set.add(456);
//        set.add("aa");
//        set.add("cc");
//        set.add(false);

        set.add(1);
        set.add(11);
        set.add(21);
        set.add(-5);
        set.add(-31);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
