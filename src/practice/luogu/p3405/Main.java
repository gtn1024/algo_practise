package practice.luogu.p3405;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int ans = 0;
    int[][] map = new int[1000][1000];
    for (int i = 0; i < n; i++) {
      String a = sc.next();
      String b = sc.next();
      int x = (a.charAt(0) - 'A') * 26 + a.charAt(1) + 'A';
      int y = (b.charAt(0) - 'A') * 26 + b.charAt(1) + 'A';
      if (x != y) {
        map[x][y]++;
        ans += map[y][x];
      }
    }
    System.out.println(ans);
  }
}
