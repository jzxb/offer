package test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lhx
 * @date 2019/8/19 - 18:56
 */
public class Code1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if ("+".equals(s[i])) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num1 + num2);
            } else if ("-".equals(s[i])) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 - num1);
            } else if ("/".equals(s[i])) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num2 / num1);
            } else if ("*".equals(s[i])) {
                int num1 = nums.pop();
                int num2 = nums.pop();
                nums.push(num1 * num2);
            } else {
                nums.push(Integer.parseInt(s[i]));
            }
        }
        System.out.println(nums.pop());
    }

}
