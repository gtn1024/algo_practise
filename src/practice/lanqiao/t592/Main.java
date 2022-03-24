package practice.lanqiao.t592;

public class Main {
  public static void main(String[] args) {
    int cnt = 0;
    for (int i = 1; i <= 2020; i++) {
      for (char c : String.valueOf(i).toCharArray()) {
        if (c == '2')
          cnt++;
      }
    }
    System.out.println(cnt);
  }
}
