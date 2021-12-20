package luogu.questions.p1957;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        char last = '\0';
        for (int j = 0; j < i; j++) {
            String[] s = sc.nextLine().split(" ");
            if (s.length == 3) {
                // 3
                last = s[0].toCharArray()[0];
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                if (last == 'a') {
                    // +
                    String str = a + "+" + b + "=" + (a + b);
                    System.out.println(str);
                    System.out.println(str.length());
                } else if (last == 'b') {
                    // -
                    String str = a + "-" + b + "=" + (a - b);
                    System.out.println(str);
                    System.out.println(str.length());
                } else if (last == 'c') {
                    // *
                    String str = a + "*" + b + "=" + (a * b);
                    System.out.println(str);
                    System.out.println(str.length());
                }
            } else {
                // 2
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                if (last == 'a') {
                    // +
                    String str = a + "+" + b + "=" + (a + b);
                    System.out.println(str);
                    System.out.println(str.length());
                } else if (last == 'b') {
                    // -
                    String str = a + "-" + b + "=" + (a - b);
                    System.out.println(str);
                    System.out.println(str.length());
                } else if (last == 'c') {
                    // *
                    String str = a + "*" + b + "=" + (a * b);
                    System.out.println(str);
                    System.out.println(str.length());
                }
            }
        }
    }
}
