package practice.lanqiao.t597;

import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    long sum = 0;
    Calendar calendar = Calendar.getInstance();
    calendar.set(2000, Calendar.JANUARY, 1);
    while (true) {
      if (calendar.get(Calendar.YEAR) == 2020 && calendar.get(Calendar.MONTH) == Calendar.OCTOBER
          && calendar.get(Calendar.DAY_OF_MONTH) == 2) {
        break;
      }
      if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY || calendar.get(Calendar.DAY_OF_MONTH) == 1) {
        sum += 2;
      } else {
        sum += 1;
      }
      calendar.add(Calendar.DATE, 1);
    }
    System.out.println(sum);
  }
}
