package ming.solution1;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/7 - 15:19
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseWords(str);
    }

    private static void reverseWords(String str) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i] + " ");
        }
        System.out.println(sb.toString());
    }

}
