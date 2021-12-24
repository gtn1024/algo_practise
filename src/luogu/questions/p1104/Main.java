// https://www.luogu.com.cn/problem/P1104
package luogu.questions.p1104;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// TODO: 3WA
public class Main {
  public static class P {
    String name;
    int year;
    int month;
    int day;
    int allDays;

    private int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public P(String name, int year, int month, int day) {
      this.name = name;
      this.year = year;
      this.month = month;
      this.day = day;

      // ********* all days below *********
      int tmp = 0;
      int baseYear = 2022;
      for (int i = year + 1; i < baseYear; i++) {
        tmp += isLeap(year) ? 366 : 365;
      }
      for (int i = month + 1; i <= 12; i++) {
        tmp += monthDay(year, month);
      }
      tmp += monthDay(year, month) - day;
      this.allDays = tmp;
    }

    private boolean isLeap(int y) {
      return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    private int monthDay(int y, int m) {
      if (isLeap(y) && m == 2)
        return 29;
      return months[m];
    }

    public int getDays() {
      return this.allDays;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<P> list = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      String name = sc.next();
      int year = sc.nextInt();
      int month = sc.nextInt();
      int day = sc.nextInt();
      list.add(new P(name, year, month, day));
    }
    list.sort(Comparator.comparing(P::getDays));
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(list.get(i).name);
    }
  }
}
