// https://www.luogu.com.cn/problem/P2669
package luogu.questions.p2669;

import java.util.Scanner;

public class Main {
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        int i = 1;  // 当前个数
        int s = 0;  // 金币数量
        int max = getMax();
        for (int j = 0; j < k; ) {  // 天数
            if (i < max) {
                s += i * i;
                j += i;
                i++;
            } else {
                s += i;
                j++;
            }
        }
        System.out.println(s);
    }

    public static int getMax() {
        int i = 0;      // 最大金币
        int tmp = 0;    // 记录天数
        while (tmp < k) {
            i++;
            for (int j = 0; j < i; j++) {
                tmp++;
            }
        }
        return i;
    }
}
