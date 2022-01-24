// https://www.luogu.com.cn/problem/P5720
#include <cstdio>

int main() {
  int n;
  scanf("%i", &n);
  int i = 0;
  while (n > 1) {
    n /= 2;
    i++;
  }
  printf("%i\n", i + 1);
  return 0;
}