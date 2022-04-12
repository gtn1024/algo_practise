package contest.nowcoder.小白月赛47.a;

import java.util.Scanner;

public class Main {
  static final double PI = 3.141592653589;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    while (T-- != 0) {
      int r = sc.nextInt();
      int h = sc.nextInt();
      double v = PI * r * r * h;
      int gs = h / (r * 2);
      v -= ((4.0 / 3) * PI * r * r * r) * gs;
      System.out.printf("%.3f\n", v);
    }
  }
}
