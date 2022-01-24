// https://www.luogu.com.cn/problem/P1421
#include <cstdio>

int main() {
  int a, b;
  scanf("%i%i", &a, &b);
  int all = a * 10 + b;
  printf("%i\n", all / 19);
  return 0;
}