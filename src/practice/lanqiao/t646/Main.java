package practice.lanqiao.t646;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    outer: for (int start = 2; start < 10000; start++) {
      inner: for (int i = 1; i < 1000; i++) {
        ArrayList<Integer> list = new ArrayList<>();
        int current = start;
        while (list.size() != 10) {
          if (isPrime(current)) {
            list.add(current);
            current += i;
          } else {
            continue inner;
          }
        }
        System.out.println(i);
        break outer;
      }
    }
  }

  static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
