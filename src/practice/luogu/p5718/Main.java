// https://www.luogu.com.cn/problem/P5718
package practice.luogu.p5718;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        scanner.close();
    }
}
