package practice.luogu.p1208;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static class Ele {
        int p; // 单价
        int a; // 最多卖出牛奶量

        public Ele(int p, int a) {
            super();
            this.p = p;
            this.a = a;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt(); // 需要牛奶总量
        int m = sc.nextInt(); // 提供牛奶的农民个数
        Ele[] eles = new Ele[m];
        for (int i = 0; i < m; ++i)
            eles[i] = new Ele(sc.nextInt(), sc.nextInt());
        Arrays.sort(eles, (a, b) -> {
            if (a.p == b.p) {
                return a.a < b.a ? 1 : -1;
            }
            return a.p > b.p ? 1 : -1;
        });
        int r = n;
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            if (r <= 0)
                break;
            if (r > eles[i].a) {
                ans += eles[i].a * eles[i].p;
                r -= eles[i].a;
            } else {
                ans += r * eles[i].p;
                r -= r;
            }
        }
        System.out.println(ans);
    }

}
