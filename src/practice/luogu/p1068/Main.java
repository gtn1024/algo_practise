// https://www.luogu.com.cn/problem/P1068
package practice.luogu.p1068;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static class P {
    int k, s;

    public P(int k, int s) {
      this.k = k;
      this.s = s;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    P[] ps = new P[n];
    for (int i = 0; i < n; i++) {
      ps[i] = new P(sc.nextInt(), sc.nextInt());
    }
    int t = Math.min((int) (m * 1.5), n);
    Arrays.sort(ps, (a, b) -> {
      if (a.s > b.s) {
        return -1;
      } else if (a.s < b.s) {
        return 1;
      } else {
        if (a.k < b.k) {
          return -1;
        } else {
          return 1;
        }
      }
    });
    int act = 0;
    for (int i = 0; i < n; i++) {
      if (i < t || (i < n - 1 && ps[i].s == ps[i - 1].s)) {
        act++;
      } else {
        break;
      }
    }
    System.out.printf("%d %d\n", ps[act - 1].s, act);
    for (int i = 0; i < act; i++) {
      System.out.printf("%d %d\n", ps[i].k, ps[i].s);
    }
    sc.close();
  }
}
