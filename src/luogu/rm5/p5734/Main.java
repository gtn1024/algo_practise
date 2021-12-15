package luogu.rm5.p5734;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    s.append(sc.next());
                    System.out.println(s);
                    break;
                case 2:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    s = new StringBuilder(s.substring(a, a + b));
                    System.out.println(s);
                    break;
                case 3:
                    int ii = sc.nextInt();
                    s.insert(ii, sc.next());
                    System.out.println(s);
                    break;
                case 4:
                    int index = s.indexOf(sc.next());
                    System.out.println(index >= 0 ? index : -1);
                    break;
            }
        }
    }
}
