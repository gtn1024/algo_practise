package practice.nowcoder.nc15029;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      ArrayDeque<Character> st = new ArrayDeque<>();
      String s = sc.nextLine();
      for (char c : s.toCharArray()) {
        if (!st.isEmpty()) {
          if (st.peek() == 'O') {
            // 当顶层元素为大泡泡时
            if (c == 'O') {
              // 两个大泡泡爆炸
              st.pop();
            } else if (c == 'o') {
              st.push(c);
            }
          } else if (st.peek() == 'o') {
            // 当顶层元素为小泡泡时
            if (c == 'o') {
              // 两个小泡泡合成一个大泡泡
              st.pop();
              if (!st.isEmpty() && st.peek() == 'O') {
                // 判断顶层是否为大泡泡，如果为大泡泡则再次爆炸
                st.pop();
              } else {
                st.push('O');
              }
            } else if (c == 'O') {
              st.push('O');
            }
          }
        } else {
          st.push(c);
        }
      }
      StringBuilder sb = new StringBuilder();
      while (!st.isEmpty()) {
        sb.insert(0, st.pop());
      }
      System.out.println(sb);
    }
    sc.close();
  }
}
