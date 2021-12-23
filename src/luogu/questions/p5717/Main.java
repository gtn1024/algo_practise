// https://www.luogu.com.cn/problem/P5717
package luogu.questions.p5717;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// TODO: 4WA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.sort(Comparator.naturalOrder());

        if (list.get(0).equals(list.get(1)) &&
                list.get(1).equals(list.get(2)) &&
                list.get(0).equals(list.get(2))) {
            System.out.println("Equilateral triangle");
        } else if (list.get(0).equals(list.get(1))) {
            System.out.println("Isosceles triangle");
        } else if (list.get(0) * list.get(0) +
                list.get(1) * list.get(1) > list.get(2) * list.get(2)) {
            System.out.println("Acute triangle");
        } else if (list.get(0) * list.get(0) +
                list.get(1) * list.get(1) == list.get(2) * list.get(2)) {
            System.out.println("Right triangle");
        } else if (list.get(0) * list.get(0) +
                list.get(1) * list.get(1) < list.get(2) * list.get(2)) {
            System.out.println("Obtuse triangle");
        } else {
            System.out.println("Not triangle");
        }
    }
}
