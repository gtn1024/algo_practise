// https://www.luogu.com.cn/problem/P5723
package luogu.questions.p5723;

import java.util.Scanner;

// TODO: 3WA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int tmp = 0;
        int c = 0;
        for (int i = 2; tmp < l && i <= l; i++) {
            if (isPrime(i)) {
                tmp += i;
                c++;
                System.out.println(i);
            }
        }
        System.out.println(c);
    }

    public static boolean isPrime(int i) {
        if (i == 1) return false;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
