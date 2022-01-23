// https://www.luogu.com.cn/problem/P5716
package luogu.p5716;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                res = 30;
                break;
            case 2:
                res = isLeap(y) ? 29 : 28;
                break;
        }
        System.out.println(res);
        sc.close();
    }

    public static boolean isLeap(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }
}
