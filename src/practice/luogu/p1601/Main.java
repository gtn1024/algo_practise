// https://www.luogu.com.cn/problem/P1601
package practice.luogu.p1601;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        sc.close();
    }
}
