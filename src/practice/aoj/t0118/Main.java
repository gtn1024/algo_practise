package practice.aoj.t0118;

import java.util.Scanner;

public class Main {
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };
    static Scanner sc = new Scanner(System.in);
    static int h, w, cnt;
    static char[][] ls;
    static boolean[][] visited;

    public static void main(String[] args) {
        while (true) {
            cnt = 0;
            h = sc.nextInt();
            w = sc.nextInt();
            if (h == 0 || w == 0)
                break;
            ls = new char[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; ++i)
                ls[i] = sc.next().toCharArray();
            for (int i = 0; i < ls.length; ++i) {
                for (int j = 0; j < ls[i].length; ++j) {
                    if (!visited[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
//            print();
            System.out.println(cnt);
        }
    }

    private static void dfs(int x, int y) {
        if (visited[x][y])
            return;
        char tmp = ls[x][y];
        visited[x][y] = true;
        ls[x][y] = ' ';
        for (int i = 0; i < 4; ++i) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (0 <= nx && nx < h && 0 <= ny && ny < w && !visited[nx][ny] && ls[nx][ny] == tmp) {
                dfs(nx, ny);
            }
        }
    }

    static void print() {
        for (int i = 0; i < ls.length; ++i) {
            for (int j = 0; j < ls[i].length; ++j) {
                System.out.print(ls[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
