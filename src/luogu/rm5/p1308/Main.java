package luogu.rm5.p1308;

import java.util.Scanner;

// TODO: StringIndexOutOfBoundsException
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int index = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i].toLowerCase())) {
                if (index < 0) {
                    index = line.indexOf(arr[i].toLowerCase());
                    while (line.charAt(index - 1) != ' ' && line.charAt(index + s.length()) != ' ') {
                        index = line.indexOf(arr[i].toLowerCase(), index + 1);
                    }

                }
                count++;
            }
        }
        if (count > 0)
            System.out.println(count + " " + index);
        else
            System.out.println("-1");
    }
}
