package practice.lanqiao.t593;

public class Main {

    public static void main(String[] args) {
        long ans = 0;
        for (int i = 1; i <= 2020; ++i) {
            for (int j = 1; j <= 2020; ++j) {
                if (gcd(i, j) == 1)
                    ans++;
            }
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
