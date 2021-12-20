package luogu.questions.p5738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 同学人数
        int m = sc.nextInt();   // 评委人数
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            int maxVal = -1;
            int maxIndex = -1;
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
                if (array[i][j] > maxVal) {
                    maxIndex = j;
                    maxVal = array[i][j];
                }
                if (array[i][j] < minVal) {
                    minIndex = j;
                    minVal = array[i][j];
                }
            }
            array[i][maxIndex] = -1;
            array[i][minIndex] = -1;
        }
        double max = -1;
        for (int i = 0; i < n; i++) {
            double ave = ave(array[i]);
            if (ave > max) max = ave;
        }
        System.out.printf("%.2f", max);
    }

    public static double ave(int[] array) {
        double sum = 0;
        for (int i : array) {
            if (i < 0) continue;
            sum += i;
        }
        return sum / (array.length - 2);
    }
}
