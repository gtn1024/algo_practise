package luogu.rm1.p5707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();   // 距离
        int v = sc.nextInt();   // 速度

        int at = 10 + (int) Math.ceil(1.0 * s / v);

        int hour = 7;
        int min = 60;
        hour -= at / 60;
        min -= at % 60;
        if (hour < 0) hour += 24;
        System.out.println(
                (hour < 10 ? "0" + hour : hour) +
                        ":" +
                        (min < 10 ? "0" + min : min)
        );
    }
}
