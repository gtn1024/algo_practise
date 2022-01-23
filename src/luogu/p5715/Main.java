package luogu.p5715;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            integers.add(sc.nextInt());
        }
        integers.sort(Comparator.naturalOrder());
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        sc.close();
    }
}
