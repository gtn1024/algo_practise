package practice.lanqiao.t191;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    for (int i = 1; i <= n; i++) {
      if (valid(i)) {
        sum += i;
      }
    }
    System.out.println(sum);
    sc.close();
  }

  static boolean valid(int i) {
    for (char c : String.valueOf(i).toCharArray()) {
      if (c == '2' || c == '0' || c == '1' || c == '9')
        return true;
    }
    return false;
  }
}
