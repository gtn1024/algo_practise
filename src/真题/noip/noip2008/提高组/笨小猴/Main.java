// https://www.luogu.com.cn/problem/P1125
package 真题.noip.noip2008.提高组.笨小猴;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxn = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        String wd = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : wd.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        for (Integer value : map.values()) {
            if (value > maxn)
                maxn = value;
            if (value < minn)
                minn = value;
        }
        if (isPrime(maxn - minn)) {
            System.out.println("Lucky Word");
            System.out.println(maxn - minn);
        } else {
            System.out.println("No Answer");
            System.out.println(0);
        }
        sc.close();
    }

    public static boolean isPrime(int i) {
        if (i < 2)
            return false;
        for (int j = 2; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
