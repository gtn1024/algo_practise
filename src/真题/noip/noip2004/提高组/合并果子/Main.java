package 真题.noip.noip2004.提高组.合并果子;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < n; i++)
      pq.offer(sc.nextInt());
    long ans = 0;
    while (pq.size() != 1) {
      int a = pq.poll();
      int b = pq.poll();
      pq.add(a + b);
      ans += a + b;
    }
    System.out.println(ans);
    sc.close();
  }
}