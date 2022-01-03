package luogu.p5710;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println((a(i) && b(i) ? "1" : "0") + " " + (a(i) || b(i) ? "1" : "0") + " "
                + ((a(i) && !b(i)) || (!a(i) && b(i)) ? "1" : "0") + " "
                + (!a(i) && !b(i) ? "1" : "0"));
    }

    public static boolean a(int i) {
        return i % 2 == 0;
    }

    public static boolean b(int i) {
        return i > 4 && i <= 12;
    }
}
