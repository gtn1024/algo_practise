package practice.lanqiao.t606;

public class Main {
  public static void main(String[] args) {
    final int SUM = 2019;
    int cnt = 0;
    for (int i = 1; i <= SUM; i++) {
      for (int j = 1; j <= SUM; j++) {
        int k = SUM - i - j;
        if (i < j && j < k && valid(i, j, k)) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }

  static boolean valid(int i, int j, int k) {
    return !contain(i) && !contain(j) && !contain(k);
  }

  static boolean contain(int i) {
    for (char c : String.valueOf(i).toCharArray()) {
      if (c == '2' || c == '4')
        return true;
    }
    return false;
  }
}
