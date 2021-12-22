// https://www.luogu.com.cn/problem/P1420
package luogu.questions.p5725.p1420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                tmp++;
                continue;
            }
            if (array[i] - array[i - 1] == 1) {
                tmp++;
            } else {
                if (tmp > max) max = tmp;
                tmp = 1;
            }
        }
        System.out.println(max);
    }
}
