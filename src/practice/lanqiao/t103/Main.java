package practice.lanqiao.t103;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ints = Arrays.stream(sc.nextLine().split("/")).mapToInt(it -> Integer.parseInt(it)).toArray();
		int year, month, day;
		String pYear, pMonth, pDay;
		for (int d = 19600101; d <= 20591231; d++) {
			year = d / 10000 % 100;
			year += year < 60 ? 2000 : 1900;
			month = d / 100 % 100;
			day = d % 100;
			if ((year % 100 == ints[0] && month == ints[1] && day == ints[2]) // 年月日
					|| (year % 100 == ints[2] && month == ints[0] && day == ints[1]) // 月日年
					|| (year % 100 == ints[2] && month == ints[1] && day == ints[0]) // 日月年
			) {
				if (!valid(year, month, day))
					continue;
				pYear = String.valueOf(year);
				pMonth = month < 10 ? "0" + month : String.valueOf(month);
				pDay = day < 10 ? "0" + day : String.valueOf(day);
				System.out.printf("%s-%s-%s\n", pYear, pMonth, pDay);
			}
		}
		sc.close();
	}

	static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	static boolean valid(int y, int m, int d) {
		int day;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if (isLeapYear(y)) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			day = 30;
		}
		if (m < 1 || m > 12)
			return false;
		if (d < 1 || d > day)
			return false;
		return true;
	}
}
