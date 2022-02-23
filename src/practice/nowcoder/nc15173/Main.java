package practice.nowcoder.nc15173;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(f(n));
		scanner.close();
	}

	static long f(long x) {
		String s = String.valueOf(x);
		long su = 0;
		for (char c : s.toCharArray()) {
			su+=(int)(c-'0');
		}
		return su < 10 ? su : f(su);
	}
}
