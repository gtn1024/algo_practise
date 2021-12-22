// https://www.luogu.com.cn/problem/P5721
package luogu.questions.p5725.p5721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (c < 10) System.out.print(0);
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
