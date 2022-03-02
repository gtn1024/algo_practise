package practice.nowcoder.nc21874.stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  static ArrayDeque<Character> st = new ArrayDeque<>();

  static boolean solve(String s) {
    for (char c : s.toCharArray()) {
      if (c == 'a') {
        st.push(c);
      } else if (c == 'b') {
        if (!st.isEmpty() && st.peek() == 'a') {
          st.pop();
        } else {
          return false;
        }
      }
    }
    return st.isEmpty();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    sc.close();
    System.out.println(solve(st) ? "Good" : "Bad");
  }
}
