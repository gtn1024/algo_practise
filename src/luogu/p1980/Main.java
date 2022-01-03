// https://www.luogu.com.cn/problem/P1980
package luogu.p1980;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char x = String.valueOf(sc.nextInt()).toCharArray()[0];
        char x = (char) (sc.nextInt() + 48);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        int i = 0;
        for (char c : sb.toString().toCharArray()) {
            if (c == x)
                i++;
        }
        System.out.println(i);
    }
}
