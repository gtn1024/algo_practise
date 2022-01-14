// https://nanti.jisuanke.com/t/T2065
package contest.winter_2022.jan_14.a;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean neg = false; // 负数
    if (n < 0) {
      neg = true;
      n = -n;
    }
    StringBuilder sb = new StringBuilder();
    for (char c : String.valueOf(n).toCharArray()) {
      sb.insert(0, c);
    }
    if (neg)
      System.out.print("-");
    System.out.println(Integer.parseInt(sb.toString()));
  }
}
