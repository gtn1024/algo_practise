// https://www.luogu.com.cn/problem/P5708
package luogu.questions.p5708;

import java.util.Scanner;

// TODO: 3RE
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double p = (1.0 * a + b + c) / 2;
        double s = Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
        System.out.printf("%.1f\n", s);
    }
}
