// https://codeforces.com/problemset/problem/9/A
package contest.winter_2022.jan_14.g;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    int w = sc.nextInt();
    int max = Math.max(y, w);
    sc.close();
    if (max == 1) {
      System.out.println("1/1");
      return;
    }
    int c = 7 - max;
    int gcd = gcd(c, 6);
    System.out.println(c / gcd + "/" + 6 / gcd);

  }

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}
