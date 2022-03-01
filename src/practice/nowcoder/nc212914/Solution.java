package practice.nowcoder.nc212914;

import java.util.ArrayDeque;

public class Solution {
  public static long legalExp(String str) {
    ArrayDeque<Long> st = new ArrayDeque<>();
    long tmp = -1;
    for (char c : str.toCharArray()) {
      if (c == '#') {
        st.push(tmp);
        tmp = -1;
      } else if (c == '+' || c == '-' || c == '*') {
        Long a = st.pop();
        Long b = st.pop();
        switch (c) {
          case '+':
            st.push(a + b);
            break;
          case '-':
            st.push(-a + b);
            break;
          case '*':
            st.push(a * b);
            break;
        }
      } else {
        if (tmp == -1) {
          tmp = (int) (c - '0');
        } else {
          tmp *= 10L;
          tmp += (int) (c - '0');
        }
      }
    }
    return st.pop();
  }

  public static void main(String[] args) {
    System.out.println(legalExp("1#1#+") == 2L);
    System.out.println(legalExp("12#3#+15#*") == 225L);
  }
}
