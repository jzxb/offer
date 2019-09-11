package xiaomi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
    ******************************开始写代码******************************/
    static String solution(String[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String[] s = input[i].split(" ");
            int index = 0;
            while (index < s.length) {
                if (!"0".equals(s[index])) {
                    if (index != 0) {
                        int j = index - 1;
                        while (j >= 0 && "0".equals(s[j])) {
                            j--;
                        }
                        if (j >= 0 && s[index].equals(s[j])) {
                            int sum = Integer.parseInt(s[index]) * 2;
                            s[index] = "0";
                            s[j] = sum + "";
                        } else if (j < 0) {
                            s[0] = s[index];
                            s[index] = "0";
                        } else {
                            s[j + 1] = s[index];
                            s[index] = "0";
                        }
                    }
                }
                index++;
            }
            for (int j = 0; j < s.length; j++) {
                sb.append(s[j] + " ");
            }
        }
        return sb.toString();
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        res = solution(_input);
        System.out.println(res);
    }
}

