package practice.lanqiao.t1452;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long sec = sc.nextLong() / 1000;
    long ss = sec % 60;
    long min = sec / 60;
    long mm = min % 60;
    long hr = min / 60;
    long hh = hr % 24;

    System.out.println((hh < 10 ? "0" + hh : hh) +
        ":" + (mm < 10 ? "0" + mm : mm) +
        ":" + (ss < 10 ? "0" + ss : ss));
    sc.close();
  }
}
