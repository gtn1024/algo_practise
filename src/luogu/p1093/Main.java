// https://www.luogu.com.cn/problem/P1093
package luogu.p1093;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static class Student {
    int id;
    int chi, mat, eng;
    int sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Student[] s = new Student[n];
    for (int i = 0; i < n; i++) {
      s[i] = new Student();
      s[i].id = i + 1;
      s[i].chi = sc.nextInt();
      s[i].mat = sc.nextInt();
      s[i].eng = sc.nextInt();
      s[i].sum = s[i].chi + s[i].mat + s[i].eng;
    }
    Arrays.sort(s, (a, b) -> {
      if (a.sum > b.sum) {
        return -1;
      } else if (a.sum < b.sum) {
        return 1;
      } else {
        if (a.chi > b.chi) {
          return -1;
        } else if (a.chi < b.chi) {
          return 1;
        } else {
          if (a.id < b.id) {
            return -1;
          } else {
            return 1;
          }
        }
      }
    });
    for (int i = 0; i < 5; i++) {
      System.out.println(s[i].id + " " + s[i].sum);
    }
  }
}
