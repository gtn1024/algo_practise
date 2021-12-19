// https://www.luogu.com.cn/problem/P1303
package luogu.questions.p1303;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(
                new BigDecimal(a).multiply(new BigDecimal(b))
        );
    }
}
