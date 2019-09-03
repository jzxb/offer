package vipkid;

import java.util.*;

/**
 * @author lhx
 * @date 2019/9/3 - 16:20
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int M;
//        List<Integer> numsList= new ArrayList<>();
//        while(sc.hasNextInt()) {
//            M = sc.nextInt();
//            for (int i = 0; i < M; i++) {
//                System.out.println(M);
//                numsList.add(M);
//            }
//        }
//        int n = sc.nextInt();
//        List<Integer> numsList= new ArrayList<>();
//        while(sc.hasNextInt()) {
//            int M = sc.nextInt();
//            for (int i = 0; i < n; i++) {
//                numsList.add(M);
//            }
//        }
//        int n = sc.nextInt();
//        List<Integer> numsList= new ArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            numsList.add(sc.nextInt());
//        }
        String s = sc.nextLine();
        s = s.replace(" ", "");
        String[] split = s.split(",");
        List<Integer> numsList= new ArrayList<>(split.length);
        for (int i = 0; i < split.length; i++) {
            numsList.add(Integer.parseInt(split[i]));
        }
        pair(numsList);
    }

    private static void pair(List<Integer> numsList) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        set.addAll(numsList);
        numsList.clear();
        numsList.addAll(set);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numsList.size(); i++) {
            if (map.containsKey(numsList.get(i))) {
                res++;
            } else {
                map.put(0 - numsList.get(i), numsList.get(i));
            }
        }
        System.out.println(res);
    }
}
