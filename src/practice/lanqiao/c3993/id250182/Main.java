package practice.lanqiao.c3993.id250182;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static HashMap<String, Integer> map = new HashMap<>();

  public static void main(String[] args) {
    int n = sc.nextInt();
    boolean flag = false;
    String ans = "NO";
    while (n-- != 0) {
      String s = sc.next();
      if (flag)
        continue;

      if (map.containsKey(s)) {
        ans = s;
        flag = true;
      } else {
        map.put(s, 1);
      }
    }
    System.out.println(ans);
  }
}
