// https://www.luogu.com.cn/problem/P1563
package luogu.p1563;

import java.util.Scanner;

public class Main {
  static class R {
    final int cx; // 朝向 0 内 1 外
    final String zy; // 职业

    public R(int cx, String zy) {
      this.cx = cx;
      this.zy = zy;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 小人个数
    int m = sc.nextInt(); // 指令条数

    R[] rs = new R[n];

    for (int i = 0; i < n; i++) {
      rs[i] = new R(sc.nextInt(), sc.next());
    }
    int index = 0;
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt(); // 0 左 1 右
      int s = sc.nextInt(); // 人数
      index -= (a == 0 ? 1 : -1) * (rs[index].cx == 0 ? 1 : -1) * s;
      if (index < 0)
        index += n;
      else if (index >= n)
        index -= n;
    }
    System.out.println(rs[index].zy);
  }
}
