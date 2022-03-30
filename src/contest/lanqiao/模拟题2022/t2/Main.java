/*
 * 从 1 到 2021 中
 */
package contest.lanqiao.模拟题2022.t2;

public class Main {

    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 2021; ++i) {
            if(check(i)) cnt++;
        }
        System.out.println(cnt);
    }

    static boolean check(int num) {
        return String.valueOf(num).indexOf('2') != -1;
    }
}
