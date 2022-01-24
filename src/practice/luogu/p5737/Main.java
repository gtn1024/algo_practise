package practice.luogu.p5737;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isLeap(i)) {
                ls.add(i);
            }
        }
        System.out.println(ls.size());
        for (Integer l : ls) {
            System.out.print(l + " ");
        }
        sc.close();
    }

    public static boolean isLeap(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }
}
