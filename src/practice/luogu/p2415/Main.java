package practice.luogu.p2415;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long ans = 0;
    String[] ss = sc.nextLine().split(" ");
    int n = ss.length;
    ans = Arrays.stream(ss)
        .mapToInt(it -> Integer.parseInt(it))
        .sum();
    for (int i = 0; i < n - 1; i++) {
      ans *= 2;
    }
    System.out.println(ans);
  }
}
