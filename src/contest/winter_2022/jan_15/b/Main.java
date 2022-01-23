// https://nanti.jisuanke.com/t/T1526
package contest.winter_2022.jan_15.b;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    HashSet<Integer> A = new HashSet<>(n + m);
    HashSet<Integer> B = new HashSet<>(m);
    for (int i = 0; i < n; i++) {
      A.add(sc.nextInt());
    }
    for (int i = 0; i < m; i++) {
      B.add(sc.nextInt());
    }
    A.addAll(B);
    boolean flag = false;
    for (Integer integer : A) {
      if (flag) {
        System.out.print(" ");
      } else {
        flag = true;
      }
      System.out.print(integer);
    }
    System.out.println();
    sc.close();
  }
}
