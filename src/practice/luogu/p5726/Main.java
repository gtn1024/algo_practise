// https://www.luogu.com.cn/problem/P5726
package practice.luogu.p5726;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        double sum = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            sum += list.get(i);
        }
        double res = sum / (list.size() - 2) + 0.005;
        System.out.printf("%.2f%n", res);
        sc.close();
    }
}
