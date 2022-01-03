package luogu.p1304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int n = 4; n <= in; n += 2) {
            for (int i = 2; i < n - 1; i++) {
                if (!isPrime(i))
                    continue;
                int j = n - i;
                if (!isPrime(j))
                    continue;
                System.out.println(n + "=" + i + "+" + j);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
