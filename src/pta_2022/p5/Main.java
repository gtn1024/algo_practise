package pta_2022.p5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] a = sc.nextLine().toCharArray();
    char[] b = sc.nextLine().toCharArray();
    int c = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      int aa = a[i] + 48;
      int bb = b[i] + 48;
      if (aa < bb) {
        if (i != 0) {
          a[i - 1]--;
        }
        c++;
      }
    }
    System.out.println(c);
  }
}
