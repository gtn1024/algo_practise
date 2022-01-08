// https://www.luogu.com.cn/problem/P5720
package luogu.p5720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = 1;
        while (i > 1) {
            i /= 2;
            c++;
        }
        System.out.println(c);
    }
}
