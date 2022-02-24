package practice.lanqiao.t504;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (!map.containsKey(c))
				map.put(c, 0);
			map.put(c, map.get(c) + 1);
		}
		char max_c='\0';
		int cnt = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if(val > cnt) {
				max_c = key;
				cnt = val;
			}
		}
		System.out.println(max_c);
		System.out.println(cnt);
		sc.close();
	}

}
