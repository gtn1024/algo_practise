package luogu.questions.p5711;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(
                (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0) ?
                        1 : 0
        );
    }
}
