// https://www.luogu.com.cn/problem/P1320
package luogu.questions.p1320;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.toString().length();
        for (int i = 0; i < n - 1; i++) {
            sb.append(sc.next());
        }
        System.out.print(n + " ");
        ArrayList<Character> array = new ArrayList<>(n * n);

        for (char c : sb.toString().toCharArray()) {
            array.add(c);
        }

        char tmp = '\0';
        int ii = 0;
        for (int i = 0; i < n * n; i++) {
            if (i == 0 && array.get(i) != '0') {
                System.out.print(0 + " ");
            }
            if (tmp == '\0') {
                tmp = array.get(i);
                ii++;
            } else if (array.get(i) == tmp) {
                ii++;
            }
            if (i == n * n - 1) {
                System.out.print(ii + " ");
                continue;
            }
            if (array.get(i + 1) != tmp) {
                System.out.print(ii + " ");
                tmp = '\0';
                ii = 0;
            }
        }
    }
}
