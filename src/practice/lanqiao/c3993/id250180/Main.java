package practice.lanqiao.c3993.id250180;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static ArrayDeque<String> stack = new ArrayDeque<>();

  public static void main(String[] args) {
    int n = sc.nextInt();
    while (n-- != 0) {
      String op = sc.next();
      String name = sc.next();
      if (op.equals("in")) {
        stack.push(name);
      } else {
        while (!stack.isEmpty()) {
          if (stack.pop().equals(name)) {
            break;
          }
        }
      }
    }
    System.out.println(stack.isEmpty() ? "Empty" : stack.pop());
  }
}
