package testjava;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author lhx
 * @date 2019/8/21 - 15:54
 */
public class SetTest {
    @Test
    public void test(){
        Set<Object> set = new LinkedHashSet<>();
        set.add(123);
        set.add(456);
        set.add("aa");
        set.add("bb");
        set.add(true);
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
