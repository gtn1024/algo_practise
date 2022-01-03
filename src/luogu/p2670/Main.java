// https://www.luogu.com.cn/problem/P2670
package luogu.p2670;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine(); // ignore
    int[][] array = new int[n + 2][m + 2];
    for (int i = 1; i <= n; i++) {
      char[] charArray = sc.nextLine().toCharArray();
      for (int j = 1; j <= charArray.length; j++) {
        if (charArray[j - 1] == '*') {
          array[i][j] = 1;
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (array[i][j] == 1) {
          System.out.print("*");
          continue;
        }
        int count = array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i][j - 1]
            + array[i][j + 1] + array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1];
        System.out.print(count);
      }
      System.out.println();
    }
  }
}
