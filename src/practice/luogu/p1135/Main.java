package practice.luogu.p1135;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  static class Node {
    int floor;
    int d;

    public Node(int floor, int d) {
      this.floor = floor;
      this.d = d;
    }

    @Override
    public String toString() {
      return "Node [d=" + d + ", floor=" + floor + "]";
    }
  }

  public static void main(String[] args) {
    Queue<Node> queue = new ArrayDeque<>();
    int[] k = new int[1000];
    boolean[] vis = new boolean[1000];

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    for (int i = 1; i <= n; i++)
      k[i] = sc.nextInt();
    queue.offer(new Node(a, 0));
    vis[a] = true;
    Node now = new Node(0, 0);
    while (!queue.isEmpty()) {
      now = queue.poll();
      if (now.floor == b)
        break;
      for (int sign = -1; sign <= 1; sign += 2) {
        int dist = now.floor + k[now.floor] * sign;
        if (dist >= 1 && dist <= n && !vis[dist]) {
          queue.offer(new Node(dist, now.d + 1));
          vis[dist] = true;
        }
      }
    }
    if (now.floor == b) {
      System.out.println(now.d);
    } else {
      System.out.println(-1);
    }
  }
}
