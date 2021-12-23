// https://www.luogu.com.cn/problem/P1115
package luogu.questions.p1115;

import java.util.Scanner;

// TODO: 1WA, 3TLE
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (arr[j] - arr[i] > max)
                    max = arr[j] - arr[i];
            }
        }
        System.out.println(max);
    }
}
