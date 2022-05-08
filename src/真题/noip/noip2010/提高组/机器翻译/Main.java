package 真题.noip.noip2010.提高组.机器翻译;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Queue<Integer> queue = new ArrayDeque<>();

  public static void main(String[] args) {
    int m = sc.nextInt(); // 内存容量
    int n = sc.nextInt(); // 文章长度

    int cnt = 0;

    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      if (!queue.contains(tmp)) {
        cnt++;
        if (queue.size() >= m) {
          queue.poll();
        }
        queue.offer(tmp);
      }
    }
    System.out.println(cnt);
  }
}
