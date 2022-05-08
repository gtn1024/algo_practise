package practice.luogu.p1449;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Deque<Integer> stack = new ArrayDeque<>();

  public static void main(String[] args) {
    String s = sc.nextLine();
    int tmp = 0;
    for (Character c : s.toCharArray()) {
      if (c == '@') {
        break;
      }
      if (c == '.') {
        stack.push(tmp);
        tmp = 0;
      } else if (c == '+') {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a + b);
      } else if (c == '-') {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b - a);
      } else if (c == '*') {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a * b);
      } else if (c == '/') {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b / a);
      } else {
        tmp *= 10;
        tmp += (int) (c - '0');
      }
    }
    System.out.println(stack.pop());
  }
}
