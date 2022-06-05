package practice.luogu.p4715;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int[] value = new int[260];
  static int[] winner = new int[260];
  static int n;

  public static void main(String[] args) {
    n = sc.nextInt();
    for (int i = 0; i < 1 << n; i++) {
      value[i + (1 << n)] = sc.nextInt();
      winner[i + (1 << n)] = i + 1;
    }
    dfs(1);
    System.out.println(value[2] > value[3] ? winner[3] : winner[2]);
  }

  private static void dfs(int x) {
    if (x >= 1 << n) {
      return;
    } else {
      dfs(2 * x);
      dfs(2 * x + 1);
      int lval = value[2 * x];
      int rval = value[2 * x + 1];
      if (lval > rval) {
        value[x] = lval;
        winner[x] = winner[2 * x];
      } else {
        value[x] = rval;
        winner[x] = winner[2 * x + 1];
      }
    }
  }
}
