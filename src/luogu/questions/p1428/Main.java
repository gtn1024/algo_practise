package luogu.questions.p1428;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    arr2[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
