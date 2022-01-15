// https://www.51nod.com/Challenge/Problem.html#problemId=3199
package contest.winter_2022.jan_15.e;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int o = sc.nextInt();
      switch (o) {
        case 1:
          stack.push(sc.nextInt());
          break;
        case 2:
          if (stack.size() == 0) {
            System.out.println("empty");
          } else {
            System.out.println(stack.pop());
          }
          break;
      }
    }
  }
}
