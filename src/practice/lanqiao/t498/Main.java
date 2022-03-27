package practice.lanqiao.t498;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        boolean flag = false;
        while (n < 99999999) {
            n++;
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            if (!flag && sb.toString().equals(sb.reverse().toString()) && valid(n)) {
                System.out.println(sb);
                flag = true;
            }
            char A = sb.charAt(0);
            char B = sb.charAt(1);
            if (A == B)
                continue;
            if (sb.charAt(2) == A && sb.charAt(3) == B && sb.charAt(4) == B && sb.charAt(5) == A && sb.charAt(6) == B
                    && sb.charAt(7) == A && valid(n)) {
                System.out.println(sb);
                break;
            }
        }
    }

    static boolean valid(long n) {
        if (String.valueOf(n).length() > 8)
            return false;
        int year = (int) (n / 10000);
        int month = (int) (n % 10000 / 100);
        int day = (int) (n % 100);
        if (month < 1 || month > 12)
            return false;
        int[] ms = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && leap(year)) {
            ms[2] = 29;
        }
        if (day < 1 || day > ms[month])
            return false;
        return true;
    }

    static boolean leap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}
