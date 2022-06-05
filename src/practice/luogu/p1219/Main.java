package practice.luogu.p1219;

import java.util.Scanner;

public class Main {
  static final int MAXN = 100;

  static Scanner sc = new Scanner(System.in);
  static int[] a = new int[MAXN];
  static int n, ans;
  static boolean[] b1 = new boolean[MAXN];
  static boolean[] b2 = new boolean[MAXN];
  static boolean[] b3 = new boolean[MAXN];

  static void dfs(int x) {
    if (x > n) {
      ans++;
      if (ans <= 3) {
        for (int i = 1; i <= n; i++)
          System.out.print(a[i] + " ");
        System.out.println();
      }
      return;
    }
    for (int i = 1; i <= n; i++) {
      if (!b1[i] && !b2[x + i] && !b3[x - i + 15]) {
        a[x] = i;
        b1[i] = true;
        b2[x + i] = true;
        b3[x - i + 15] = true;
        dfs(x + 1);
        b1[i] = false;
        b2[x + i] = false;
        b3[x - i + 15] = false;
      }
    }
  }

  public static void main(String[] args) {
    n = sc.nextInt();
    dfs(1);
    System.out.println(ans);
  }
}
