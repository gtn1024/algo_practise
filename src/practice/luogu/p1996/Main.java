package practice.luogu.p1996;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static class Node {
    int data;
    Node next;
  }

  static Scanner sc = new Scanner(System.in);
  static Queue<Integer> queue = new ArrayDeque<>();

  public static void main(String[] args) {
    int n = sc.nextInt();
    int m = sc.nextInt();

    Node head = new Node();
    head.data = 1;
    Node curNode = head;
    for (int i = 2; i <= n; ++i) {
      Node tmp = new Node();
      tmp.data = i;
      curNode.next = tmp;
      curNode = curNode.next;
    }
    curNode.next = head;

    int cur = 1;
    curNode = head;
    while (curNode.next != curNode) {
      if (cur == m - 1) {
        queue.offer(curNode.next.data);
        curNode.next = curNode.next.next;
        cur = 1;
        curNode = curNode.next;
        continue;
      }
      if (cur >= m) {
        cur -= m;
      }
      cur++;
      curNode = curNode.next;
    }
    queue.offer(curNode.data);
    for (int i : queue) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
