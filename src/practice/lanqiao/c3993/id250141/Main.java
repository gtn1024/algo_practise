package practice.lanqiao.c3993.id250141;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static ArrayDeque<String> v = new ArrayDeque<>();
  static ArrayDeque<String> n = new ArrayDeque<>();

  public static void main(String[] args) {
    int M = sc.nextInt();
    while (M-- != 0) {
      String op = sc.next();
      if (op.equals("IN")) {
        String name = sc.next();
        String role = sc.next();
        if (role.equals("V")) {
          v.offer(name);
        } else {
          n.offer(name);
        }
      } else if (op.equals("OUT")) {
        String role = sc.next();
        if (role.equals("V")) {
          v.poll();
        } else {
          n.poll();
        }
      }
    }
    for (String name : v) {
      System.out.println(name);
    }
    for (String name : n) {
      System.out.println(name);
    }
  }
}
