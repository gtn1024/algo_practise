// https://www.luogu.com.cn/problem/P1177
package practice.luogu.p1177.归并;

import java.util.Scanner;

public class Main {
	static int[] a = new int[100010];
	static int[] b = new int[100010];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt();
		}
		mergeSort(1, n);
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		scanner.close();
	}

	static void mergeSort(int l, int r) {
		if (l == r)
			return;
		int mid = (l + r) >> 1;
		mergeSort(l, mid);
		mergeSort(mid + 1, r);
		merge(l, r, mid);
	}

	static void merge(int l, int r, int mid) {
		int p = l, q = mid + 1;
		for (int i = l; i <= r; i++) {
			if (q > r || (p <= mid && a[p] <= a[q]))
				b[i] = a[p++];
			else
				b[i] = a[q++];
		}
		for (int i = l; i <= r; i++) {
			a[i] = b[i];
		}
	}
}
