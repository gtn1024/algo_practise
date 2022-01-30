// https://www.luogu.com.cn/problem/P1059
package 真题.noip.noip2006.普及组.明明的随机数;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashSet<Integer> set = new HashSet<>();
    int[] arr = new int[n];
    int tmp;
    for (int i = 0; i < n; i++) {
      tmp = sc.nextInt();
      if (set.add(tmp)) {
        arr[i] = tmp;
      }
    }
    System.out.println(set.size());
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        continue;
      }
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
