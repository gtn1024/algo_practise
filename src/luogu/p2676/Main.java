// https://www.luogu.com.cn/problem/P2676
package luogu.p2676;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int[] ls = new int[n];
    for (int i = 0; i < n; i++) {
      ls[i] = sc.nextInt();
    }
    Arrays.sort(ls);
    int c = 0;
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      sum += ls[i];
      c++;
      if (sum >= b) {
        System.out.println(c);
        break;
      }
    }
    sc.close();
  }
}
