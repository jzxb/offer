package sogo.solution1;

import java.util.*;

/**
 * @author lhx
 * @date 2019/9/8 - 16:31
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = sc.nextInt();
        SolutionMap solutionMap = new SolutionMap(maxSize);
        while (sc.hasNext()) {
            String key = sc.next();
            int val = sc.nextInt();
            Map<String, Integer> insert = solutionMap.insert(key, val);
            if (insert != null) {
                Set<Map.Entry<String, Integer>> entries = insert.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        }
    }

}

class SolutionMap {

    private int maxSize;
    private LinkedList<Map<String, Integer>> map;

    public SolutionMap(int maxSize) {
        this.maxSize = maxSize;
        this.map = new LinkedList<>();
    }

    public Map<String, Integer> insert(String key, int value) {
        Map<String, Integer> res = null;
        if (maxSize == map.size()) {
            res = isInMap(key, value);
            if (res == null) {
                res = map.removeFirst();
            }
        } else if (maxSize > map.size()) {
            res = isInMap(key, value);
            Map<String, Integer> entry = new HashMap<>();
            entry.put(key, value);
            map.addLast(entry);
        }
        return res;
    }

    private  Map<String, Integer> isInMap(String key, int value) {
        Map<String, Integer> res = null;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).containsKey(key)) {
                if (map.get(i).get(key) < value) {
                    res  = map.get(i);
                    map.get(i).put(key, value);
                }
            }
        }
        return res;
    }

}
