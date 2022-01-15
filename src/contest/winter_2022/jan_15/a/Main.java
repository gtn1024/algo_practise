// https://www.51nod.com/Challenge/Problem.html#problemId=3056
package contest.winter_2022.jan_15.a;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> ls = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      ls.add(sc.nextInt());
    }
    for (int i = 0; i < k; i++) {
      String o = sc.next();
      if (o.equals("Z")) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > ls.size()) {
          ls.add(y);
        } else {
          ls.add(x, y);
        }
      } else if (o.equals("D")) {
        int x = sc.nextInt();
        if (x >= ls.size())
          continue;
        ls.remove(x);
      }
    }
    System.out.println(ls.size());
    boolean flag = false;
    for (Integer integer : ls) {
      if (flag) {
        System.out.print(" ");
      } else {
        flag = true;
      }
      System.out.print(integer);
    }
    System.out.println();
  }
}
