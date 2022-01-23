package luogu.p5740;

import java.util.Scanner;

public class Main {
    static class P {
        String name;
        int a;
        int b;
        int c;
        int all;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P[] ps = new P[n];
        int maxI = -1;
        int maxVal = -1;
        for (int i = 0; i < n; i++) {
            P p = new P();
            p.name = sc.next();
            p.a = sc.nextInt();
            p.b = sc.nextInt();
            p.c = sc.nextInt();
            p.all = p.a + p.b + p.c;
            ps[i] = p;
            if (p.all > maxVal) {
                maxI = i;
                maxVal = p.all;
            }
        }
        System.out.println(ps[maxI].name + " " + ps[maxI].a + " " + ps[maxI].b + " " + ps[maxI].c);
        sc.close();
    }
}
