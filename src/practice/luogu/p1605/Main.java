package practice.luogu.p1605;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] maze;
    static int N, M, T, SX, SY, FX, FY, ans;
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };
    static boolean[][] visited;

    public static void main(String[] args) {
        N = sc.nextInt(); // 行
        M = sc.nextInt(); // 列
        T = sc.nextInt(); // 障碍总数

        SX = sc.nextInt();
        SY = sc.nextInt();
        FX = sc.nextInt();
        FY = sc.nextInt();

        maze = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 1; i <= T; ++i) {
            maze[sc.nextInt()][sc.nextInt()] = 1;
        }
        visited[SX][SY] = true;
        dfs(SX, SY);
        System.out.println(ans);
    }

    static void dfs(int x, int y) {
        if (x == FX && y == FY) {
            ans++;
            return;
        }
        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (1 <= nx && nx <= N && 1 <= ny && ny <= M && !visited[nx][ny] && maze[nx][ny] == 0) {
                visited[nx][ny] = true;
                dfs(nx, ny);
                visited[nx][ny] = false;
            }
        }
    }
}
