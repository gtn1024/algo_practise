// https://www.luogu.com.cn/problem/P5707
#include <cmath>
#include <cstdio>

int main() {
  int s, v;
  scanf("%i%i", &s, &v);
  int time = 10 + (int)ceil(1.0 * s / v);
  int h = 7;
  int m = 60;
  h -= time / 60;
  m -= time % 60;
  while (h < 0) {
    h += 24;
  }
  if (h < 10) {
    putchar('0');
  }
  printf("%i:", h);
  if (m < 10) {
    putchar('0');
  }
  printf("%i\n", m);
  return 0;
}