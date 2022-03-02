package practice.nowcoder.nc21874.string_oper;

import java.util.Scanner;

public class Main {
  static boolean solve(String s) {
    while (s.contains("ab")) {
      s = s.replace("ab", "");
    }
    return s.equals("");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    sc.close();
    System.out.println(solve(st) ? "Good" : "Bad");
  }
}
