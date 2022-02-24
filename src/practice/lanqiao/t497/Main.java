package practice.lanqiao.t497;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = 101, max = -1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int j = scanner.nextInt();
			sum += j;
			min = Math.min(min, j);
			max = Math.max(max, j);
		}
		System.out.println(max);
		System.out.println(min);
		System.out.printf("%.2f\n", 1.0 * sum / n);
		scanner.close();
	}
}
