// https://www.luogu.com.cn/problem/P1009
package luogu.p1009;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal res = BigDecimal.valueOf(0);
        for (int i = 1; i <= n; i++) {
            res = res.add(f(BigDecimal.valueOf(i)));
        }
        System.out.println(res);
    }

    public static BigDecimal f(BigDecimal i) {
        if (Integer.parseInt(i.toPlainString()) == 1)
            return BigDecimal.valueOf(1);
        return f(i.subtract(BigDecimal.valueOf(1))).multiply(i);
    }
}
