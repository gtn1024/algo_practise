package contest.nowcoder.contest27740.f;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while ((T--) != 0) {
      int x = sc.nextInt();
      if (x > 0) {
        String abss = Integer.toBinaryString(x);
        for (int i = 0; i < 32 - abss.length(); i++) {
          System.out.print(0);
        }
        System.out.println(abss);
      } else if (x < 0) {
        System.out.println(Integer.toBinaryString(x));
      } else {
        System.out.println("00000000000000000000000000000000");
      }
    }
    sc.close();
  }
}
