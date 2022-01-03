package luogu.p1765;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[][] chars = {{'a', 'b', 'c', '\0'}, {'d', 'e', 'f', '\0'}, {'g', 'h', 'i', '\0'},
                {'j', 'k', 'l', '\0'}, {'m', 'n', 'o', '\0'}, {'p', 'q', 'r', 's'},
                {'t', 'u', 'v', '\0'}, {'w', 'x', 'y', 'z'}};
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ')
                count++;
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    if (chars[i][j] == c)
                        count += j + 1;
                }
            }
        }
        System.out.println(count);
    }
}
