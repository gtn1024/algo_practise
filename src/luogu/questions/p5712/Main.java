package luogu.questions.p5712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.print("Today, I ate ");
        if (i <= 1) {
            System.out.println(i + " apple.");
        } else {
            System.out.println(i + " apples.");
        }
    }
}
