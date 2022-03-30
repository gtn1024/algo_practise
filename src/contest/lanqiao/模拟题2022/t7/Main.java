package contest.lanqiao.模拟题2022.t7;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (char c : sc.next().toCharArray()) {
            if(c != ',') {
                System.out.print(c);
            }
        }
        System.out.println();
    }

}
