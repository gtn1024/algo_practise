package practice.luogu.p1443;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  static class Point {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "Point [x=" + x + ", y=" + y + "]";
    }
  }

  static final int MAXN = 310;
  static int[][] ans = new int[MAXN][MAXN];
  static int[][] walk = {
      { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
      { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
  };

  public static void main(String[] args) {
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sx = sc.nextInt();
    int sy = sc.nextInt();

    Queue<Point> queue = new ArrayDeque<>();
    for (int i = 0; i < MAXN; i++) {
      Arrays.fill(ans[i], -1);
    }
    Point tmp = new Point(sx, sy);
    queue.offer(tmp);
    ans[sx][sy] = 0;
    while (!queue.isEmpty()) {
      Point u = queue.poll();
      int ux = u.x;
      int uy = u.y;
      for (int k = 0; k < 8; k++) {
        int x = ux + walk[k][0];
        int y = uy + walk[k][1];
        int d = ans[ux][uy];
        if (x < 1 || x > n || y < 1 || y > m || ans[x][y] != -1)
          continue;
        ans[x][y] = d + 1;
        tmp = new Point(x, y);
        queue.offer(tmp);
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.printf("%-5d", ans[i][j]);
      }
      System.out.println();
    }
  }
}
