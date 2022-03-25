// https://www.luogu.com.cn/problem/P1478
package practice.luogu.p1478;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Apple {
        int x; // 苹果高度
        int y; // 需要的力气

        public Apple(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 苹果数
        int s = sc.nextInt(); // 力气
        int a = sc.nextInt(); // 椅子高度
        int b = sc.nextInt(); // 伸直最大长度
        Apple[] apples = new Apple[n];
        for (int i = 0; i < n; ++i)
            apples[i] = new Apple(sc.nextInt(), sc.nextInt());
        Arrays.sort(apples, (x, y) -> x.y > y.y ? 1 : -1);
        int re = s;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (re <= 0)
                break;
            if (a + b >= apples[i].x && re >= apples[i].y) {
                re -= apples[i].y;
                ans++;
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
