// https://www.luogu.com.cn/problem/P1422
package luogu.p1422;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double money = 0;
        if (i >= 401) {
            money += 150 * 0.4463;
            money += 250 * 0.4663;
            money += (i - 400) * 0.5663;
        } else if (i >= 151) {
            money += 150 * 0.4463;
            money += (i - 150) * 0.4663;
        } else {
            money += i * 0.4463;
        }
        System.out.printf("%.1f\n", money);
        sc.close();
    }
}
