package practice.lanqiao.t1276;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] ls = new int[n + 10];
    int[] diff = new int[n + 10];
    for (int i = 1; i <= n; ++i) {
      ls[i] = sc.nextInt();
      diff[i] = ls[i] - ls[i - 1];
    }

    while (q-- != 0) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int x = sc.nextInt();

      diff[l] += x;
      diff[r + 1] -= x;
    }
    for (int i = 1; i <= n; ++i) {
      ls[i] = ls[i - 1] + diff[i];
      System.out.print(
          Math.max(ls[i], 0)
              + " ");
    }
  }
}
