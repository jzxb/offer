package bilibili.solution2;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/10 - 19:23
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findNumSum(num);
    }

    private static void findNumSum(int num) {
//        int res = 1;
//        int midNum;
//        int i = num / 2;
//        int j = 2;
//        while (i > j) {
//            midNum = num / j;
//            while (true) {
//                int s = midNum;
//                int sum = 0;
//                for (int k = 0; k < j; k++) {
//                    sum = s;
//                    s++;
//                }
//                if (sum == num) {
//                    res++;
//                }
//            }
//        }
        int res = 1;
        for (int i = 1; i <= num/2; i++) {
            for (int j = i + 1; j <= num/2 + 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += k;
                }
                if (sum == num) {
                    res ++;
                }
            }
        }
        System.out.println(res);
    }

}
