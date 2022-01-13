// https://www.luogu.com.cn/problem/P1781
package luogu.p1781;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    BigInteger max = BigInteger.valueOf(0);
    int index = 0;
    for (int i = 0; i < n; i++) {
      BigInteger tmp = new BigInteger(scanner.next());
      if (tmp.compareTo(max) > 0) {
        max = tmp;
        index = i + 1;
      }
    }
    System.out.println(index);
    System.out.println(max);
  }
}
