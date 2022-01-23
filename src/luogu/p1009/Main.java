// https://www.luogu.com.cn/problem/P1009
package luogu.p1009;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            res = res.add(f(i));
        }
        System.out.println(res);
        sc.close();
    }

    public static BigInteger f(int i) {
        if (i == 1)
            return BigInteger.valueOf(1);
        return f(i - 1).multiply(BigInteger.valueOf(i));
    }
}
