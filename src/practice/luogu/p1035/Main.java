// https://www.luogu.com.cn/problem/P1035
package practice.luogu.p1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 0;
        double s = 0;
        while (s <= k) {
            n++;
            s += 1.0 / n;
        }
        System.out.println(n);
        sc.close();
    }
}
