package luogu.rm5.p1914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            char nC = (char) (c + n);
            if (nC > 122)
                nC -= 26;
            sb.append(nC);
        }
        System.out.println(sb);
    }
}
