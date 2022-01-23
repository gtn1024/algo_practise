// https://www.luogu.com.cn/problem/P1591
package luogu.p1591;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int cc = 0;
      for (char c : f(n).toString().toCharArray()) {
        if (c == (char) (a + 48))
          cc++;
      }
      System.out.println(cc);
    }
    sc.close();
  }

  public static BigInteger f(int n) {
    if (n == 1)
      return BigInteger.valueOf(1);
    return f(n - 1).multiply(BigInteger.valueOf(n));
  }
}
