package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/8/19 - 19:37
 */
public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long f0 = sc.nextLong();
        List<Long> monyList = new ArrayList<>();
        monyList.add(f0);
        monyList.add(a * monyList.get(0) + 2 - 1 + 32767);
        monyList.add(a * monyList.get(1) + b * monyList.get(0) + (2 * 4) - 2 + 32767);
        monyList.add(a * monyList.get(2) + b * monyList.get(1) + c * monyList.get(0)+ (2 * 9) - 3 + 32767);
        for (int i = 4; i < n + 1; i++) {
            monyList.add(a * monyList.get(i - 1) + b * monyList.get(i - 2) + c * monyList.get(i - 3) + (2 * (i * i)) - i + 32767);
        }
        System.out.println(monyList.get(monyList.size() - 1) / 1000000007);
        System.out.println(Math.floorMod(monyList.get(monyList.size() - 1), 1000000007));
        System.out.println(monyList.get(monyList.size() - 1));
    }
}
