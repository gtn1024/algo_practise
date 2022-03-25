package practice.luogu.p1803;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Game {
		int start;
		int end;

		public Game(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Game[] games = new Game[n];
		for (int i = 0; i < n; ++i) {
			games[i] = new Game(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(games, (a, b) -> a.end > b.end ? 1 : -1);
		int f = 0;
		int res = 0;
		for (int i = 0; i < n; ++i) {
			if (f <= games[i].start) {
				f = games[i].end;
				res++;
			}
		}
		System.out.println(res);

		sc.close();
	}
}
