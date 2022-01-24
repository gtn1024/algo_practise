// https://www.luogu.com.cn/problem/P1035
#include <cstdio>

int main() {
  int k;
  scanf("%i", &k);
  int n = 0;
  double s = 0;
  do {
    n++;
    s += 1.0 / n;
  } while (s <= k);
  printf("%i\n", n);
  return 0;
}