package xindongfang;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/8/29 - 19:12
 */
public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(step(n));
    }

    private static int step(int n) {
        int[] step = new int[n];
        step[0] = 1;
        step[1] = 2;
        for (int i = 2; i < n; i++) {
            step[i] = step[i - 1] + step[i - 2];
        }
        return step[n - 1];
    }

}
