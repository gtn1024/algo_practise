package luogu.rm6.p5743;

import java.util.Scanner;

public class Main {
    public static int c = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        f(d);
        System.out.println(c);
    }

    public static void f(int n) {
        if (n == 0 || n == 1) return;
        c = (c + 1) * 2;
        f(n - 1);
    }
}
