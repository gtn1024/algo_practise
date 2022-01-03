// https://www.luogu.com.cn/problem/P1100
package luogu.p1100;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Long i = Long.valueOf(s);
    StringBuilder sb = new StringBuilder(Long.toString(i, 2));
    while (sb.length() < 32) {
      sb.insert(0, "0");
    }
    String s2 = sb.substring(16) + sb.substring(0, 16);
    System.out.println(Long.valueOf(s2, 2));
  }
}
