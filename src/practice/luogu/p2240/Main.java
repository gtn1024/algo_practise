package practice.luogu.p2240;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class JB {
		int m; // 重量
		int v; // 总价值

		public JB(int m, int v) {
			super();
			this.m = m;
			this.v = v;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 金币
		int t = sc.nextInt(); // 背包承重

		JB[] jbs = new JB[n];
		for (int i = 0; i < n; ++i) {
			jbs[i] = new JB(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		Arrays.sort(jbs, (a, b) -> (a.v * b.m < b.v * a.m) ? 1 : -1);
		int remain = t;
		double val = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			if (jbs[i].m > remain)
				break;
			val += jbs[i].v;
			remain -= jbs[i].m;
		}
		if (i < n) {
			val += 1.0 * jbs[i].v / jbs[i].m * remain;
		}
		System.out.printf("%.2f\n", val);
	}

}
