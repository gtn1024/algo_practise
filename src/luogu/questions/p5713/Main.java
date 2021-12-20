package luogu.questions.p5713;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int local = 5 * i;
        int lg = 11 + 3 * i;
        System.out.println(
                local < lg ? "Local" : "Luogu"
        );
    }
}
