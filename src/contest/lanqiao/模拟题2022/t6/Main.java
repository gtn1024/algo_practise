package contest.lanqiao.模拟题2022.t6;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(t / a + (t % a == 0 ? 0 : 1));
    }

}
