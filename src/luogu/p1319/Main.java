// https://www.luogu.com.cn/problem/P1319
package luogu.p1319;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for (String s : sc.nextLine().trim().split(" ")) {
            ls.add(Integer.parseInt(s));
        }
        int flag = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (i % 2 == 0) {
                // print 0
                for (int j = 0; j < ls.get(i); j++) {
                    System.out.print(0);
                    if (++flag % n == 0)
                        System.out.println();
                }
            } else {
                // print 1
                for (int j = 0; j < ls.get(i); j++) {
                    System.out.print(1);
                    if (++flag % n == 0)
                        System.out.println();
                }
            }
        }
    }
}
