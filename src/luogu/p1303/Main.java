// https://www.luogu.com.cn/problem/P1303
package luogu.p1303;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
