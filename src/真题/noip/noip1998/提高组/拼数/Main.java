// https://www.luogu.com.cn/problem/P1012
package 真题.noip.noip1998.提高组.拼数;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] ls = new Integer[n];
    for (int i = 0; i < n; i++) {
      ls[i] = sc.nextInt();
    }
    Arrays.sort(ls, (Integer a, Integer b) -> {
      String sa = String.valueOf(a) + String.valueOf(b);
      String sb = String.valueOf(b) + String.valueOf(a);
      return -sa.compareTo(sb);
    });
    for (int integer : ls) {
      System.out.print(integer);
    }
    sc.close();
  }
}
