// https://www.luogu.com.cn/problem/P5015
package 真题.noip.noip2018.普及组.标题统计;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '\n')
                continue;
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}
