package wuba.solution3;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/12 - 20:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        solution(m, n, map);
    }

    private static void solution(int m, int n, int[][] map) {
        int x = 0;
        int y = 0;
        int step = map[x][y];
        while (x < m - 1 && y < n - 1) {
            if (map[x + 1][y] > map[x][y + 1]) {
                y++;
            } else {
                x++;
            }
            step += map[x][y];
        }
        if (x == m - 1) {
            while (y < n - 1) {
                y++;
                step += map[x][y];
            }
        } else if (y == n - 1) {
            while (x < m - 1) {
                x++;
                step += map[x][y];
            }
        }
        System.out.println(step);
    }
}
