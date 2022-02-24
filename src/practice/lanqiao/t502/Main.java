package practice.lanqiao.t502;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int hege = 0;
		int youxiu = 0;
		for (int i = 0; i < n; i++) {
			int sc = scanner.nextInt();
			if (sc >= 60) {
				hege++;
			}
			if (sc >= 85) {
				youxiu++;
			}
		}
		System.out.println((int) (1.0 * hege / n * 100 + 0.5) + "%");
		System.out.println((int) (1.0 * youxiu / n * 100 + 0.5) + "%");
		scanner.close();
	}
}
