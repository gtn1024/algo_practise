package luogu.questions.p5015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '\n')
                continue;
            i++;
        }
        System.out.println(i);
    }
}
