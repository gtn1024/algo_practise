package practice.luogu.p1706.dfs;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int n;
  static int[] path;
  static boolean[] visited;

  public static void main(String[] args) {
    n = sc.nextInt();
    path = new int[n + 2];
    visited = new boolean[n+2];
    dfs(0);
  }

  static void dfs(int u) {
    if (u == n) {
      for (int i = 0; i < n; i++) {
        System.out.printf("%5d", path[i]);
      }
      System.out.println();
      return;
    }
    for (int i = 1; i <= n; i++) {
      if (!visited[i]) {
        path[u] = i;
        visited[i] = true;
        dfs(u + 1);
        visited[i] = false;
      }
    }
  }
}
