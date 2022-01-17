// https://nanti.jisuanke.com/t/T1193
package contest.winter_2022.jan_14.e;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static class S {
    int a, b, c, d;

    public S(int a, int b, int c, int d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<S> ls = new ArrayList<>();
    for (int b = 1; b <= n; b++) {
      for (int c = b; c <= n; c++) {
        for (int d = c; d <= n; d++) {
          double da = Math.pow(b * b * b + c * c * c + d * d * d, 1.0 / 3);
          int ia = (int) (da + 1e-7);
          if (Math.abs(da - ia) < 1e-6) {
            if (ia > n || b > n || c > n || d > n)
              continue;
            if (ia <= 1 || b <= 1 || c <= 1 || d <= 1)
              continue;
            ls.add(new S(ia, b, c, d));
          }
        }
      }
    }
    ls.sort((S a, S b) -> {
      if (a.a < b.a) {
        return -1;
      } else if (a.a > b.a) {
        return 1;
      } else {
        if (a.b < b.b) {
          return -1;
        } else if (a.b > b.b) {
          return 1;
        } else {
          if (a.c < b.c) {
            return -1;
          } else if (a.c > b.c) {
            return 1;
          } else {
            if (a.d < b.d) {
              return -1;
            }
            return 1;
          }
        }
      }
    });
    for (S s : ls) {
      System.out.printf("Cube = %d, Triple = (%d,%d,%d)\n",
          s.a, s.b, s.c, s.d);
    }
  }
}
