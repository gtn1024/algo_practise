// https://www.luogu.com.cn/problem/P1104
package luogu.p1104;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static class Student {
    int id;
    String name;
    int y, m, d;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Student[] s = new Student[n];
    for (int i = 0; i < n; i++) {
      s[i] = new Student();
      s[i].id = i + 1;
      s[i].name = sc.next();
      s[i].y = sc.nextInt();
      s[i].m = sc.nextInt();
      s[i].d = sc.nextInt();
    }
    Arrays.sort(s, (a, b) -> {
      if (a.y > b.y) {
        return 1;
      } else if (a.y < b.y) {
        return -1;
      } else {
        if (a.m > b.m) {
          return 1;
        } else if (a.m < b.m) {
          return -1;
        } else {
          if (a.d > b.d) {
            return 1;
          } else if (a.d < b.d) {
            return -1;
          } else {
            if (a.id < b.id) {
              return 1;
            } else {
              return -1;
            }
          }
        }
      }
    });

    for (int i = 0; i < n; i++) {
      System.out.println(s[i].name);
    }
    sc.close();
  }

}
