// https://www.luogu.com.cn/problem/P1055
package luogu.p1055;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (char c : sc.nextLine().replace("-", "").toCharArray()) {
            list.add(c == 'X' ? 10 : c - 48);
        }
        int res = 0;
        for (int i = 1; i <= 9; i++) {
            res += list.get(i - 1) * i;
        }
        int result = res % 11;
        if (list.get(9) == result) {
            System.out.println("Right");
        } else {
            System.out.print(list.get(0) + "-");
            for (int i = 1; i <= 3; i++) {
                System.out.print(list.get(i));
            }
            System.out.print("-");
            for (int i = 4; i <= 8; i++) {
                System.out.print(list.get(i));
            }
            System.out.print("-");
            System.out.println(result == 10 ? "X" : result);
        }
    }
}
