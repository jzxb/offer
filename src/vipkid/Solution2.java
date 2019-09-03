package vipkid;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/3 - 16:40
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oneNumber(n);
    }

    private static void oneNumber(int n) {
        int res = 0;
        int i;
        while (n != 0) {
            i = n % 2;
            if (1 == i) {
                res++;
            }
            n = n / 2;
        }
        System.out.println(res);
    }
}
