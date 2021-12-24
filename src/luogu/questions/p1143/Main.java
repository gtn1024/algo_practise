// https://www.luogu.com.cn/problem/P1143
package luogu.questions.p1143;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 进制
    String t = sc.next();
    int n2 = sc.nextInt();

    int i = Integer.valueOf(t, n);
    System.out.println(Integer.toString(i, n2).toUpperCase());
  }
}
