// https://www.luogu.com.cn/problem/P1308
package practice.luogu.p1308;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String sentence = sc.nextLine().toLowerCase();
        String[] words = sentence.split(" ");
        int i = -1;
        while (true) {
            i = sentence.indexOf(word, i + 1);
            if (i == -1)
                break;
            if (i > 0 && sentence.charAt(i - 1) != ' ') {
                continue;
            }
            if (i < sentence.length() && sentence.charAt(i + word.length()) != ' ') {
                continue;
            }
            break;
        }
        sc.close();
        if (i < 0) {
            System.out.println(i);
            return;
        }

        int count = 0;
        for (String string : words) {
            if (string.equals(word))
                count++;
        }
        System.out.println(count + " " + i);

    }
}
