package luogu.rm4.p1427;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        int i;
        while ((i = sc.nextInt()) != 0) {
            ls.add(i);
        }
        for (int j = ls.size() - 1; j >= 0; j--) {
            System.out.print(ls.get(j));
            if (j != 0) System.out.print(" ");
        }
        System.out.println();
    }
}
