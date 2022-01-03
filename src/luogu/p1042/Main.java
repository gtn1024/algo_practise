// https://www.luogu.com.cn/problem/P1042
package luogu.p1042;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
    outer: while (sc.hasNextLine()) {
      for (char c : sc.nextLine().toCharArray()) {
        if (c == 'E') {
          break outer;
        } else if (c == 'W') {
          array.add(1);
        } else if (c == 'L') {
          array.add(0);
        }
      }
    }

    int[] f = {11, 21};
    for (int i = 0; i < f.length; i++) {
      int w = 0;
      int l = 0;
      for (int j = 0; j < array.size(); j++) {
        if (array.get(j) == 1) {
          w += 1;
        } else if (array.get(j) == 0) {
          l += 1;
        }
        if (Math.max(w, l) >= f[i] && Math.abs(w - l) >= 2) {
          System.out.println(w + ":" + l);
          w = 0;
          l = 0;
        }
      }

      System.out.println(w + ":" + l);
      System.out.println();
    }
  }
}
