package wuba.solution2;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/12 - 20:32
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();
        int[] stuScore = new int[stuNum];
        for (int i = 0; i < stuNum; i++) {
            stuScore[i] = sc.nextInt();
        }
        solution(stuScore);
    }
//4 2 1 7 8 9 2 1
    private static void solution(int[] stuScore) {
        int sum = 1;
        int start = 1;
        for (int i = 1; i < stuScore.length; i++) {
            if (stuScore[i] > stuScore[i - 1]) {
                start++;
                sum += start;
            } else {
                start = 1;
                sum += start;
            }
        }
        System.out.println(sum);
    }

}
