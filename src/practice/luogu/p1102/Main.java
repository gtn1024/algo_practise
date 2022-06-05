package practice.luogu.p1102;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] ls = new int[200010];
    long ans = 0;

    int n = sc.nextInt();
    int c = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      ls[i] = sc.nextInt();
      map.put(ls[i], map.getOrDefault(ls[i], 0) + 1);
    }
    for (int i = 1; i <= n; i++) {
      ans += map.getOrDefault(ls[i] - c, 0);
    }
    System.out.println(ans);
  }
}
