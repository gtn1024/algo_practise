// https://www.luogu.com.cn/problem/P3397
package luogu.questions.p3397;

import java.util.Scanner;

// TODO: 8TLE
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] array = new int[n][n];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      for (int j = a; j <= c; j++) {
        for (int j2 = b; j2 <= d; j2++) {
          array[j - 1][j2 - 1]++;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
