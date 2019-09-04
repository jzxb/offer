package ctrip.solution;

/**
 * @author lhx
 * @date 2019/9/4 - 19:44
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        Stack<Character> strStack = new Stack<>();
        Stack<Character> resStack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < expr.length(); i++) {
            if (')' == expr.charAt(i)) {
                while ('(' != strStack.peek()) {
                    stringBuilder.append(strStack.pop().toString());
                }
                strStack.pop();
                if (strStack.size() != 0) {
                    for (int j = 0; j < stringBuilder.length(); j++) {
                        resStack.push(stringBuilder.charAt(j));
                    }
                    stringBuilder = new StringBuilder();
                }
            } else {
                strStack.push(expr.charAt(i));
            }
        }
        if (strStack.size() > 0) {
            return expr;
        } else {
            StringBuilder res = new StringBuilder();
            while (resStack.size() != 0) {
                res.append(resStack.pop().toString());
            }
            String result = stringBuilder.toString() + res.toString();
            return result;
        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
