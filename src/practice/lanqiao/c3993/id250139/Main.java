package practice.lanqiao.c3993.id250139;

import java.util.Scanner;

public class Main {
  static class Node {
    Node next;
    Integer data;

    public Node(Integer data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return Integer.toString(this.data);
    }
  }

  static Scanner sc = new Scanner(System.in);
  static Node first;

  public static void main(String[] args) {
    int n = sc.nextInt();
    int k = sc.nextInt();
    int m = sc.nextInt();

    first = new Node(1);

    // generate data
    Node pos = first;
    for (int i = 2; i <= n; i++) {
      pos.next = new Node(i);
      pos = pos.next;
    }
    pos.next = first;

    // find position k
    for (int i = 1; i < k; i++) {
      pos = pos.next;
    }

    while (pos != pos.next) {
      // find m
      for (int i = 1; i < m; i++) {
        pos = pos.next;
      }
      System.out.println(pos.next);
      pos.next = pos.next.next;
    }
    System.out.println(pos);
  }
}
