// https://www.luogu.com.cn/problem/P5711

#include <cstdio>

int main() {
  int i;
  scanf("%i", &i);
  printf("%i\n", (i % 4 == 0 && i % 100 != 0) || i % 400 == 0 ? 1 : 0);
  return 0;
}