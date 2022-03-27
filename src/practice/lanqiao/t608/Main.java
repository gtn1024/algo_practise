package practice.lanqiao.t608;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        long cur = 2;
        while (list.size() < 2020) {
            if (prime(cur)) {
                list.add(cur);
            }
            cur++;
        }
        System.out.println(list.get(2018));
    }

    static boolean prime(long n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
