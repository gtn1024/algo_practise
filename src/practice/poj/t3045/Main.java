package practice.poj.t3045;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  static class Cow {
    int w; // 重量
    int s; // 力量
    int sum;

    public Cow(int w, int s) {
      this.w = w;
      this.s = s;
    }

    @Override
    public String toString() {
      return "Cow [s=" + s + ", w=" + w + "]";
    }
  }

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    Cow[] cows = new Cow[n];
    for (int i = 0; i < n; i++) {
      cows[i] = new Cow(sc.nextInt(), sc.nextInt());
      cows[i].sum = cows[i].s + cows[i].w;
    }
    Arrays.sort(cows, new Comparator<Cow>() {
      @Override
      public int compare(Cow a, Cow b) {
        return a.sum > b.sum ? 1 : -1;
      }
    });
    int sum = 0;
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      ans = Math.max(ans, sum - cows[i].s);
      sum += cows[i].w;
    }
    System.out.println(ans);
  }
}
