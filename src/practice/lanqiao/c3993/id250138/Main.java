// 小王子单链表
package practice.lanqiao.c3993.id250138;

import java.util.Scanner;

public class Main {
  static class Node {
    Node next;
    Integer data;
  }

  static final Node HEAD = new Node();

  public static void main(String[] args) {
    // generate data
    for (int i = 10; i >= 1; i--) {
      add(i);
    }
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    while (m-- != 0) {
      int data = sc.nextInt();
      del(data);
      add(data);
      show();
    }
    sc.close();
  }

  static void add(int data) {
    Node tmp = new Node();
    tmp.data = data;
    tmp.next = HEAD.next;
    HEAD.next = tmp;
  }

  static void del(int data) {
    Node before = HEAD;
    for (Node position = HEAD.next; position != null; position = position.next) {
      if (position.data == data) {
        before.next = position.next;
      }
      before = before.next;
    }
  }

  static void show() {
    Node pos = HEAD.next;
    while (pos != null) {
      System.out.printf("%d ", pos.data);
      pos = pos.next;
    }
    System.out.println();
  }
}
