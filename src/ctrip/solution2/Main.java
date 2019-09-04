package ctrip.solution2;

/**
 * @author lhx
 * @date 2019/9/4 - 20:15
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
    static int schedule(int m,int[] array) {
        int res = 0;
        if (m <= 1) {
            for (int i = 0; i < array.length; i++) {
                res += array[i];
            }
            return res;
        }
        int[] mark = new int[m];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        mark[0] = 0;
        mark[1] = index;
        int j = 1;
        for (int i = 2; i < mark.length; i++) {
            mark[i] = index + j;
            j++;
        }
        while (true) {

        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}
