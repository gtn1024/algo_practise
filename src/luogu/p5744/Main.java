package luogu.p5744;

import java.util.Scanner;

public class Main {
    static class S {
        String name;
        Integer age;
        Integer sc;

        public S(String name, int age, int sc) {
            this.name = name;
            this.age = age + 1;
            int tmp = (int) (sc * 1.2);
            this.sc = tmp > 600 ? 600 : tmp;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.sc;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(new S(sc.next(), sc.nextInt(), sc.nextInt()));
        }
    }
}
