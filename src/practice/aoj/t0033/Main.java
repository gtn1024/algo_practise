package practice.aoj.t0033;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] ls;
    static boolean flag;
    static int left, right;

    public static void main(String[] args) {
        int n = sc.nextInt();
        while (n-- != 0) {
            flag = false;
            left = -1;
            right = -1;
            ls = new int[10];
            for (int i = 0; i < 10; ++i) {
                ls[i] = sc.nextInt();
            }
            dfs(0);
            System.out.println(flag ? "YES" : "NO");
        }
    }

    static void dfs(int n) {
        if (n == 10) {
            flag = true;
            return;
        }
        if (ls[n] > left) {
            left = ls[n];
            dfs(n + 1);
        } else if (ls[n] > right) {
            right = ls[n];
            dfs(n + 1);
        } else {
            return;
        }
    }
}
