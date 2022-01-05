// https://www.luogu.com.cn/problem/P5706
package luogu.p5706;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        int n = sc.nextInt();
        double p = t / n;
        System.out.printf("%.3f\n", p);
        System.out.println(2 * n);
    }
}
