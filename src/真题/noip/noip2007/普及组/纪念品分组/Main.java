package 真题.noip.noip2007.普及组.纪念品分组;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    Arrays.sort(p);
    int l = 0, r = n - 1;
    int cnt = 0;
    while (l <= r) {
      if (p[l] + p[r] <= w) {
        l++;
        r--;
        cnt++;
      } else {
        r--;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
