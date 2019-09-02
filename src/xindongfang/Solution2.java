package xindongfang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/8/29 - 19:20
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String[] split = arr.split("\\\\r2,");
        String[] arr1Str = split[0].split(",");
        String[] arr2Str = split[1].split(",");
        int[] arr1 = new int[arr1Str.length];
        int[] arr2 = new int[arr2Str.length];
        for (int i = 0; i < arr1Str.length; i++) {
            arr1[i] = Integer.parseInt(arr1Str[i]);
        }
        for (int i = 0; i < arr2Str.length; i++) {
            arr2[i] = Integer.parseInt(arr2Str[i]);
        }
        sortArr(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void sortArr(int[] arr1, int[] arr2) {
        int index = 0;
        int arr2Mark = 0;
        int j = 0;
        while (index < arr1.length) {
            j = arr2Mark;
            while (j < arr2.length) {
                if (arr1[index] == arr2[j]) {
                    arr2Mark++;
                    int num = 1;
                    for (int i = index; i < arr1.length; i++) {
                        if (arr1[i] == arr2[j]) {
                            swap(arr1, index + num, i);
                        }
                    }
                    index += num;
                    break;
                } else {
                    j++;
                }
            }
            int arr1Mark = index;
            int i = index + 1;
            while (i < arr1.length - 1) {
                int num = 1;
                if (arr1[arr1Mark] == arr1[i]) {
                    swap(arr1, index + num, i);
                    num++;
                }
                i++;
            }
            index++;
        }
    }

    private static void swap(int[] arr1, int i, int i1) {
        int temp = arr1[i];
        arr1[i] = arr1[i1];
        arr1[i1] = temp;
    }

}
