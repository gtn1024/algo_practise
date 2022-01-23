// https://www.luogu.com.cn/problem/P1255
package luogu.p1255;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    BigInteger[] f = new BigInteger[n + 5];
    f[1] = BigInteger.valueOf(1);
    f[2] = BigInteger.valueOf(2);
    for (int i = 3; i <= n; i++) {
      f[i] = f[i - 1].add(f[i - 2]);
    }
    System.out.println(f[n]);
    scanner.close();
  }
}
