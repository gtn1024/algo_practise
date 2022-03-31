package practice.poj.t1979;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long cnt;
    static int w, h;
    static char[][] ls;
    static boolean[][] visited;

    public static void main(String[] args) {

        while (true) {
            cnt = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            ls = new char[h][w];
            visited = new boolean[h][w];
            int x = -1, y = -1;
            for (int i = 0; i < h; i++) {
                ls[i] = sc.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (ls[i][j] == '@') {
                        x = i;
                        y = j;
                        ls[i][j] = '.';
                    }
                }
            }
            dfs(x, y);
            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y) {
        if (ls[x][y] == '#') {
            return;
        }
        ls[x][y] = '#';
        cnt++;
        visited[x][y] = true;
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < h && 0 <= ny && ny < w && !visited[nx][ny] && ls[nx][ny] == '.') {
//                print();
                dfs(nx, ny);
            }
        }
    }

    static void print() {
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                System.out.print(ls[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
