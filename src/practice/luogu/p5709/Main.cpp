// https://www.luogu.com.cn/problem/P1008
#include <cmath>
#include <cstdio>

int main() {
  int m, t, s;
  scanf("%i%i%i", &m, &t, &s);
  if (t == 0) {
    printf("%i\n", 0);
    return 0;
  }
  m = m - (int)ceil(1.0 * s / t);
  printf("%i\n", m < 0 ? 0 : m);
  return 0;
}