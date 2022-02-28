package practice.other.stack_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[60010];
    ArrayDeque<Integer> st = new ArrayDeque<>();
    while (T-- != 0) {
      for (int i = 1; i <= n; i++)
        a[i] = sc.nextInt();
      int j = 1;
      for (int i = 1; i <= n; i++) {
        st.push(i);
        while (!st.isEmpty() && a[i] == st.getLast()) {
          st.pop();
          j++;
        }
      }
      if (st.isEmpty())
        System.out.println("YES");
      else
        System.out.println("NO");
    }
    sc.close();
  }
}
