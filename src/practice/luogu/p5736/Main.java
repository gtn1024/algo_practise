package practice.luogu.p5736;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isPrime(a))
                System.out.print(a + " ");
        }
        sc.close();
    }

    public static boolean isPrime(int i) {
        if (i < 2)
            return false;
        for (int j = 2; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
