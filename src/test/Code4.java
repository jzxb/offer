package test;

import java.util.*;

/**
 * @author lhx
 * @date 2019/8/19 - 19:37
 */
public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> res;
        Set<List<Integer>> resNum = new HashSet<>();
        int i = 0;
        while (i < length - 1) {
            int k = i;
            int j = i + 1;
            res = new ArrayList<>();
            while (j < length) {
                if (Math.sqrt(nums[k] + nums[j]) % 1 == 0) {
                    res.add(nums[k]);
                    res.add(nums[j]);
                    if (j == nums.length - 1) {
                        break;
                    }
                    k = j + 1;
                } else {
                    j++;
                }
            }
            if (res.size() == nums.length) {
                resNum.add(res);
            }
            i++;
        }
        System.out.println(resNum.size());
    }
}
