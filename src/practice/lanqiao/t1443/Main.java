package practice.lanqiao.t1443;

import java.util.HashMap;
import java.util.Map;

public class Main {
  // static final int MAX_N = 3;
  static final int MAX_N = 2021;

  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c = '0'; c <= '9'; c++) {
      map.put(c, MAX_N);
    }
    int i = 1;
    outer: while (true) {
      String s = String.valueOf(i);
      char[] charArray = s.toCharArray();
      for (char c : charArray) {
        int cnt = map.get(c);
        cnt--;
        if (cnt < 1) {
          break outer;
        }
        map.put(c, cnt);
      }
      i++;
    }
    System.out.println(i);
  }
}
