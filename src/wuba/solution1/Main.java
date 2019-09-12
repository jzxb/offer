package wuba.solution1;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/12 - 20:21
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        String[] strings = str.split(",");
        int index = 0;
        int res = 0;
        while (index < strings.length) {
            String s = strings[index];
            int i = index;
            while (i < strings.length && s.equals(strings[i])) {
                i++;
            }
            index = i;
            res++;
        }
        System.out.println(res);
    }

}
