package practice.lanqiao.c3993.id250197;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 马路一共多少棵树
    int m = sc.nextInt(); // 区间的树木
    int ls[] = new int[n + 10];
    while (m-- != 0) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int cost = sc.nextInt();
      ls[l] += cost;
      ls[r + 1] -= cost;
    }
    int cnt = 0;
    for (int i = 1; i <= n; i++) {
      ls[i] += ls[i - 1];
      cnt += ls[i];
    }
    System.out.println(cnt);
    sc.close();
  }
}
