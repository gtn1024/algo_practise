package luogu.rm6.p5735;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[3][2];
        for (int i = 0; i < 3; i++) {
            a[i][0] = sc.nextDouble();
            a[i][1] = sc.nextDouble();
        }
        System.out.printf("%.2f",
                d(a[0][0], a[0][1], a[1][0], a[1][1]) +
                        d(a[0][0], a[0][1], a[2][0], a[2][1]) +
                        d(a[1][0], a[1][1], a[2][0], a[2][1])
        );
    }

    public static double d(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
        );
    }
}
