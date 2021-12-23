// https://www.luogu.com.cn/problem/P1424
package luogu.questions.p1424;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = x + i;
            if (tmp % 7 == 6 || tmp % 7 == 0) continue;
            sum += 250;
        }
        System.out.println(sum);
    }
}
