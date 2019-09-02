package test;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/8/23 - 21:04
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int goodsNum = sc.nextInt();
        int[] goods = new int[goodsNum];
        int count = 0;
        for (int i = 0; i < goodsNum; i++) {
            goods[i] = sc.nextInt();
            count += goods[i];
        }
        order(money, goods, count);
    }

    private static int order(int money, int[] goods, int count) {
        if (money * 3 > count || count < money) {
            return -1;
        }
        int max = 0;
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] > max) {
                max = goods[i];
            }
        }
        int res = max;
        if (res > money) {
            return res;
        } else {
            int temp = money - res;
            int min = 0;
            for (int i = 0; i < goods.length; i++) {
            }
        }
        return 0;
    }

}
