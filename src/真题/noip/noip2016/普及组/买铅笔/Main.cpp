// https://www.luogu.com.cn/problem/P1909
#include <bits/stdc++.h>

int main() {
  int n;
  int a[3][2];
  scanf("%i", &n);
  for (int i = 0; i < 3; i++) {
    scanf("%i%i", &a[i][0], &a[i][1]);
  }
  int pens[3] = {0};
  int price[3] = {0};
  for (int i = 0; i < 3; i++) {
    while (pens[i] < n) {
      pens[i] += a[i][0];
      price[i] += a[i][1];
    }
  }
  std::sort(price, price + 3);
  printf("%i\n", price[0]);
  return 0;
}