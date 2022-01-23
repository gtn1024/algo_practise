// https://www.luogu.com.cn/problem/P5725
package luogu.p5725;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        {
            int c = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (c < 10)
                        System.out.print(0);
                    System.out.print(c);
                    c++;
                }
                System.out.println();
            }
        }
        System.out.println();
        {
            int c = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j < i; j++) {
                    if (c < 10)
                        System.out.print(0);
                    System.out.print(c);
                    c++;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
