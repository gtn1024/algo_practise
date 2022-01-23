// https://www.luogu.com.cn/problem/P1614
package luogu.p1614;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int tmp = 0;
            for (int j = 0; j < m; j++) {
                tmp += list.get(i + j);
            }
            if (tmp < min)
                min = tmp;
        }
        System.out.println(min);
        sc.close();
    }
}
