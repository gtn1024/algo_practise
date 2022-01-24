// https://www.luogu.com.cn/problem/P1425

#include <cstdio>

int main() {
  int a, b, c, d, h, m;
  scanf("%i%i%i%i", &a, &b, &c, &d);

  h = c - a - 1;
  m = (60 - b) + d;
  if (m >= 60) {
    m -= 60;
    h++;
  }
  printf("%i %i\n", h, m);
  return 0;
}