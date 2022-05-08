package practice.nowcoder.nc14572;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static char[][] ls;
  static int n, m;

  public static void main(String[] args) {
    while (sc.hasNextLine()) {
      String[] ss = sc.nextLine().split(" ");
      n = Integer.parseInt(ss[0]);
      m = Integer.parseInt(ss[1]);
      ls = new char[n][m];
      int sx = -1, sy = -1, ex = -1, ey = -1;
      for (int i = 0; i < n; i++) {
        ls[i] = sc.nextLine().toCharArray();
        if (sx == -1 || sy == -1 || ex == -1 || ey == -1) {
          for (int j = 0; j < m; j++) {
            if (ls[i][j] == 'S') {
              sx = i;
              sy = j;
            } else if (ls[i][j] == 'E') {
              ex = i;
              ey = j;
            }
          }
        }
      }
      if (dfs(sx, sy, ex, ey)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  static boolean dfs(int x, int y, int endx, int endy) {
    if (0 <= x && x < n && 0 <= y && y < m && ls[x][y] != '#') {
      if (x == endx && y == endy) {
        return true;
      }
      ls[x][y] = '#';
      return dfs(x + 1, y, endx, endy) || dfs(x - 1, y, endx, endy) || dfs(x, y + 1, endx, endy)
          || dfs(x, y - 1, endx, endy);
    } else {
      return false;
    }
  }
}
