package 真题.noip.noip2017.普及组.成绩;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zy = sc.nextInt();
        int xc = sc.nextInt();
        int qm = sc.nextInt();
        System.out.println((int) (zy * 0.2 + xc * 0.3 + qm * 0.5));
        sc.close();
    }
}
