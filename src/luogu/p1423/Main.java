// https://www.luogu.com.cn/problem/P1423
package luogu.p1423;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double s = 2;
        double sum = 0;
        int i = 0;
        while (sum < d) {
            i++;
            sum += s;
            s *= 0.98;
        }
        System.out.println(i);
    }
}
