// https://www.luogu.com.cn/problem/P5724
package luogu.p5724;

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
        System.out.println(list.get(list.size() - 1) - list.get(0));
        sc.close();
    }
}
