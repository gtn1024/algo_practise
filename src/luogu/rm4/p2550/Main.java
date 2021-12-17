package luogu.rm4.p2550;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] zj = new int[7];
        ArrayList<Integer> zj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            zj.add(sc.nextInt());
        }
        int[][] cp = new int[n][7];
        int[] res = new int[8];
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < 7; j++) {
                cp[i][j] = sc.nextInt();
                if (zj.contains(cp[i][j])) {
                    tmp++;
                }
            }
            res[tmp]++;
        }
        // System.out.println(Arrays.toString(res));
        System.out.print(res[7] + " ");
        for (int i = 6; i > 0; i--) {
            System.out.print(res[i] + " ");
        }
    }
}
