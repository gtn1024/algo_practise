package a模板.排序.归并排序;

import java.util.Scanner;

public class Main {
  static int[] a = new int[10010];
  static int[] b = new int[10010];

  public static void m(int l, int mid, int r) {
    int pos_a = l, pos_b = mid + 1;
    for (int i = l; i <= r; i++) {
      if (pos_b > r || (pos_a <= mid && a[pos_a] <= a[pos_b]))
        b[i] = a[pos_a++];
      else
        b[i] = a[pos_b++];
    }
    for (int i = l; i <= r; i++) {
      a[i] = b[i];
    }
  }

  public static void ms(int l, int r) {
    if (l == r)
      return;
    int mid = (l + r) / 2;
    ms(l, mid);
    ms(mid + 1, r);
    m(l, mid, r);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    ms(1, n);
    for (int i = 1; i <= n; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}
