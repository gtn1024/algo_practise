package luogu.p5727;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(n);
        while (n != 1) {
            n = o(n);
            ls.add(n);
        }
        for (int i = ls.size() - 1; i >= 0; i--) {
            System.out.print(ls.get(i));
            if (i != 0)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static int o(int i) {
        if (i % 2 == 1) {
            // 奇数
            return 3 * i + 1;
        } else {
            // 偶数
            return i / 2;
        }
    }
}
