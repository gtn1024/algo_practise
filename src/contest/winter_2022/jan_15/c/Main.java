// https://www.51nod.com/Challenge/Problem.html#problemId=3202
package contest.winter_2022.jan_15.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int m = sc.nextInt(); // B的大小
      int n = sc.nextInt(); // A的大小
      ArrayList<Integer> BL = new ArrayList<>(m);
      ArrayList<Integer> AL = new ArrayList<>(n);
      HashMap<Integer, Integer> BM = new HashMap<>();
      HashMap<Integer, Integer> AM = new HashMap<>();
      for (int j = 0; j < m; j++) {
        int p = sc.nextInt();
        BL.add(p);
        if (!BM.containsKey(p)) {
          BM.put(p, 0);
        }
        BM.put(p, BM.get(p) + 1);
      }
      for (int j = 0; j < n; j++) {
        int p = sc.nextInt();
        AL.add(p);
        if (!AM.containsKey(p)) {
          AM.put(p, 0);
        }
        AM.put(p, AM.get(p) + 1);
      }
      boolean flag = false;
      for (Integer integer : AL) {
        if (!(BL.contains(integer) && BM.get(integer) >= AM.get(integer))) {
          flag = true;
          System.out.println("No");
          break;
        }
      }
      if (!flag) {
        System.out.println("Yes");
      }
    }
    sc.close();
  }
}
