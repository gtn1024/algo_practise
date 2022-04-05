package practice.lanqiao.t600;

public class Main {

  public static void main(String[] args) {
    long a = 1L;
    long b = 1L;
    long c = 1L;
    long tmp;
    for (int i = 4; i <= 20190324; ++i) {
      tmp = (a + b + c) % 10000;
      a = b;
      b = c;
      c = tmp;
      // System.out.println(cnt + " " + c);
    }
    System.out.println(c);
  }
}