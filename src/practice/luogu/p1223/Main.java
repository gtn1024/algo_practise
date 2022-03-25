package practice.luogu.p1223;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class S {
		int num, data;

		public S(int num, int data) {
			this.num = num;
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		S[] is = new S[n];
		for (int i = 0; i < n; ++i) {
			is[i] = new S(i + 1, sc.nextInt());
		}
		Arrays.sort(is, (a, b) -> {
			if (a.data != b.data) {
				return a.data > b.data ? 1 : -1;
			}
			return a.num > b.num ? 1 : -1;
		});
		long sum = 0L;
		for (int i = 0; i < n; ++i) {
			System.out.print(is[i].num + " ");
			sum += (n - i - 1) * is[i].data;
		}
		System.out.println();
		System.out.printf("%.2f\n", 1.0 * sum / n);

		sc.close();
	}
}
