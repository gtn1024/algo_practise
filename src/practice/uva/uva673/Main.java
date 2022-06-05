package practice.uva.uva673;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    sc.nextLine(); // ignore
    while (n-- != 0) {
      Deque<Character> stack = new ArrayDeque<>();
      for (Character character : sc.nextLine().toCharArray()) {
        if (stack.isEmpty()) {
          stack.push(character);
          continue;
        }
        if (stack.peek() == f(character)) {
          stack.pop();
        } else {
          stack.push(character);
        }
      }
      if (stack.isEmpty())
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }

  static char f(char c) {
    if (c == ')')
      return '(';
    else if (c == ']')
      return '[';
    else if (c == '}')
      return '{';
    return '\0';
  }
}
