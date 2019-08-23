package testjava;

import org.junit.Test;

import java.util.*;

/**
 * @author lhx
 * @date 2019/8/22 - 13:24
 * 2019年8月22日
 * 13:23
 *
 * HashMap：线程不安全，效率高，存储null的key和value
 * Hashtable：线程安全，效率低，不能存储null的key和value
 * LinkedHashMap：保证在遍历map元素时，可以按照添加的顺序遍历。在原有的HashMap底层结构的基础上，添加了一对指针，指向前一个和后一个元素。对应频繁的遍历操作，此类执行效率高于HashMap。
 * TreeMap：保证按照添加的key-value对进行排序，实现排序遍历。使用key的自然排序或定制排序。底层使用红黑树。
 * Properties：常用来处理配置文件。key和value都是String类型。
 * HashMap底层：
 * 	jdk7：
 * 		数组+链表
 * 		HashMap map = new HashMap();
 * 		在实例化后，底层创建了一个长度是16的一维数组Entry[] table。
 * 		put时，首先计算key1所在类的hashCode()计算key1的哈希值，此哈希值经过某种计算，得到在Entry数组中的存放位置，如果此位置数据为空，则key1-v1添加成功，如果不为空，比较key1和已经存在的数据的哈希值：
 * 			如果key1的哈希值和已存在的数据的哈希值不同，此时添加成功。
 * 			如果key1的哈希值和已存在的数据的哈希值相同，继续比较，调用key1所在类的equls()方法，比较：
 * 				然后euqls()返回false，此时添加成功。
 * 				然后euqls()返回true，使用v1替换相同key的value值。
 *
 * 		扩容：当超出临界值并且要存放的位置非空时，默认扩容为原来容量的2倍，并将原来的数据复制过来。
 * 	jdk8：
 * 		数组+链表+红黑树
 * 		实例化时，没有创建一个长度为16的数组
 * 		jdk8底层数组是Node[]，而非Entry[]
 * 		首次调用put方法时，底层创建长度为16的数组
 * 当数组的某一个索引位置上的元素以链表形式存在的数据个数大于8且当前数组的长度超过64时，此时此索引位置上的所有数据改为使用红黑树存储。
 */
public class MapTest {
    
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("aa", 123);
        map.put(123, "aa");
        map.put(18, "bb");
        map.put("dd", "cc");
        //遍历所有的key集
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历所有的value
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        //遍历所有的key-value
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
    
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("aa", 123);
        map.put(123, "aa");
        map.put(18, "bb");
        map.put("dd", "cc");

        System.out.println(map.containsKey(18));

        System.out.println(map.containsValue(123));
    }

    @Test
    public void test2(){
        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(123, "aa");
        map.put(987, "bb");
        map.put(54, "dd");
        map.put(97, "ff");
        map.put(654, "cc");

        System.out.println(map);
    }
    
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null, null);

        Map table = new Hashtable();
        table.put(null, 123);
    }
    
}
