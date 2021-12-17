package luogu.rm4.p1554;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] res = new int[10];
        for (int i = m; i <= n; i++) {
            int tmp = i;
            for (char c : String.valueOf(tmp).toCharArray()) {
                res[Integer.parseInt(String.valueOf(c))]++;
            }
        }
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
