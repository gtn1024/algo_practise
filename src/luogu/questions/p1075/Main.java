package luogu.questions.p1075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int i = 2;
        int j = 0;
        do {
            if (isPrime(i)) {
                j = mul / i;
            }
            i++;
        } while (j * (i - 1) != mul);
        System.out.println(Math.max(i, j));
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
