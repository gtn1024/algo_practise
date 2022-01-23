// https://www.luogu.com.cn/problem/P5719
package luogu.p5719;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                a.add(i);
            } else {
                b.add(i);
            }
        }
        System.out.printf("%.1f %.1f%n", a(a), a(b));
        sc.close();
    }

    public static double a(List<Integer> ls) {
        double s = 0;
        for (Integer i : ls) {
            s += i;
        }
        return s / ls.size();
    }
}
