// https://www.luogu.com.cn/problem/P3954
#include <cstdio>

int main() {
  int a, b, c;
  scanf("%i%i%i", &a, &b, &c);
  printf("%i\n", (int)(a * 0.2 + b * 0.3 + c * 0.5));
  return 0;
}