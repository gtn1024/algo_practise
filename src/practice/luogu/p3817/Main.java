// https://www.luogu.com.cn/problem/P3817
package practice.luogu.p3817;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int l = sc.nextInt();
        long res = 0L; // 结果
        for (int i = 1; i < n; ++i) {
            int r = sc.nextInt();
            if (l + r > x) {
                res += l + r - x; // 吃掉了 (l+r-x) 个糖果
                r = x - l; // r 要减去 l 个，即减去左侧的个数
            }
            l = r;
        }
        System.out.println(res);

        sc.close();
    }

}
