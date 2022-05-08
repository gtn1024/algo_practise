package practice.luogu.p1167;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int[] ls = new int[n];
    for (int i = 0; i < n; i++) {
      ls[i] = sc.nextInt();
    }
    Arrays.sort(ls);

    sc.nextLine(); // ignore
    String[] s1 = sc.nextLine().split("-");
    String[] s2 = sc.nextLine().split("-");

    LocalDateTime ldt1 =
        LocalDateTime.of(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]),
            Integer.parseInt(s1[3].split(":")[0]), Integer.parseInt(s1[3].split(":")[1]));
    LocalDateTime ldt2 =
        LocalDateTime.of(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2]),
            Integer.parseInt(s2[3].split(":")[0]), Integer.parseInt(s2[3].split(":")[1]));
    Duration duration = Duration.between(ldt1, ldt2);
    long re = duration.toMinutes();
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (re < ls[i])
        break;
      re -= ls[i];
      cnt++;
    }
    System.out.println(cnt);
  }
}
