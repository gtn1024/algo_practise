// https://www.luogu.com.cn/problem/P1307
package practice.luogu.p1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        if (i == 0) {
            System.out.println(0);
            return;
        }
        boolean fs = i < 0;
        i = Math.abs(i);
        char[] chars = String.valueOf(i).toCharArray();
        if (fs)
            System.out.print("-");
        boolean flag = false;
        for (int j = chars.length - 1; j >= 0; j--) {
            if (!flag) {
                if (chars[j] == '0') {
                    continue;
                } else {
                    flag = true;
                }
            }
            System.out.print(chars[j]);
        }

    }
}
