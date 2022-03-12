package practice.lanqiao.c3993.id250198;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 总计多少树
    int m = sc.nextInt(); // 区间数目
    int ls[] = new int[n + 10];
    int sum[] = new int[n + 10];
    for (int i = 1; i <= n; i++) {
      ls[i] = sc.nextInt();
      sum[i] = sum[i - 1] + ls[i];
    }
    while (m-- != 0) {
      int l = sc.nextInt();
      if (l == 0)
        l += 1;
      int r = sc.nextInt();
      if (l > r) {
        int tmp = l;
        l = r;
        r = tmp;
      }
      System.out.println(sum[r] - sum[l - 1]);
    }
    sc.close();
  }
}
