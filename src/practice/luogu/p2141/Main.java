// https://www.luogu.com.cn/problem/P2141
package practice.luogu.p2141;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Integer> ls = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ls.add(scanner.nextInt());
    }
    HashSet<Integer> s = new HashSet<>();
    for (int i : ls) {
      for (int j : ls) {
        if (i == j)
          continue;
        if (ls.contains(i + j))
          s.add(i + j);
      }
    }
    System.out.println(s.size());
    scanner.close();
  }
}
